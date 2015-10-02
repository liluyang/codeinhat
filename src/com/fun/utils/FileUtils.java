package com.fun.utils;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
  // Experiment shows that 1024 ~ 4096 is too small; anything larger than
  // 16384 is OK
  private final static int FILE_BUFFER_SIZE = 16384;

  private FileUtils() {
  }

  public static List<String> readLines(String fileName) {
    ArrayList<String> lines = new ArrayList<String>();
    try {
      BufferedReader br = new BufferedReader(new FileReader(fileName));
      String line;
      while ((line = br.readLine()) != null) {
        lines.add(line);
      }
      br.close();
    } catch (IOException e) {
      // Ignore unreadable file
    }
    return lines;
  }

  /**
   * Returns file content as a String.
   *
   * @param fileName
   *          file name
   * @return file content as String
   */
  public static String readFile(String fileName, String... charset) {
    try {
      return readFile(new FileInputStream(fileName), charset);
    } catch (FileNotFoundException e) {
      return "";
    }
  }

  public static String readFile(InputStream inStream, String... charset) {
    try {
      ByteArrayOutputStream buffer = new ByteArrayOutputStream();

      int len;
      byte[] data = new byte[16384];

      while ((len = inStream.read(data, 0, data.length)) != -1) {
        buffer.write(data, 0, len);
      }

      buffer.flush();
      byte[] b = buffer.toByteArray();

      return charset.length == 0 ? new String(b) : new String(b, charset[0]);
    } catch (IOException e) {
      return "";
    }
  }

  public static byte[] readBinaryFile(String fileName) throws IOException {
    DataInputStream dis = new DataInputStream(new FileInputStream(fileName));

    int len = dis.available();
    byte[] buffer = new byte[len];
    dis.readFully(buffer);
    dis.close();

    return buffer;
  }

  /**
   * Writes a String to a file.
   *
   * @param fileName
   *          file name
   * @param content
   *          file content
   */
  public static void writeFile(String fileName, String content, String... charset) {
    try {
      FileOutputStream fos = new FileOutputStream(fileName);
      byte[] buffer = charset.length == 0 ? content.getBytes() : content.getBytes(charset[0]);
      fos.write(buffer);
      fos.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * Copies a file/directory from src to dst.
   *
   * @param src
   *          source file/directory path
   * @param dst
   *          destination file/directory path
   * @throws IOException
   */
  public static void copy(String src, String dst) throws IOException {
    File source = new File(src);
    if (!source.exists()) {
      return;
    }

    if (source.isDirectory()) {
      copyDirectory(src, dst);
    } else {
      copyFile(src, dst);
    }
  }

  /**
   * Copies a file from src to dst.
   *
   * @param src
   *          source file path
   * @param dst
   *          destination file path
   * @throws IOException
   */
  public static void copyFile(String src, String dst) throws IOException {
    FileInputStream fis = new FileInputStream(src);
    assureFilePath(dst);
    FileOutputStream fos = new FileOutputStream(dst);

    byte[] buffer = new byte[FILE_BUFFER_SIZE];
    int len;
    while ((len = fis.read(buffer)) >= 0) {
      fos.write(buffer, 0, len);
    }

    fos.close();
    fis.close();

    copyLastModified(src, dst);
  }

  private static void copyLastModified(String src, String dst) {
    File srcFile = new File(src);
    File dstFile = new File(dst);

    dstFile.setLastModified(srcFile.lastModified());
  }

  public static void copyDirectory(String src, String dst) throws IOException {
    File srcDir = new File(src);
    File dstDir = new File(dst);

    if (!srcDir.exists() || !srcDir.isDirectory()) {
      return;
    }

    dstDir.mkdirs();
    dstDir.setLastModified(srcDir.lastModified());

    File[] files = srcDir.listFiles();
    for (int i = 0; i < files.length; i++) {
      final String name = files[i].getName();
      if (files[i].isFile()) {
        copyFile(src + "/" + name, dst + "/" + name);
      } else {
        copyDirectory(src + "/" + name, dst + "/" + name);
      }
    }
  }

  /**
   * Removes a file from file system.
   *
   * @param fileName
   *          file name
   */
  public static void removeFile(String fileName) {
    File file = new File(fileName);
    file.delete();
  }

  /**
   * Removes a file path from file system, could be either File or Directory.
   *
   * @param path
   *          path to be deleted.
   */
  public static void removeFilePath(String path) {
    removeFilePath(new File(path));
  }

  private static void removeFilePath(File file) {
    if (file.isDirectory()) {
      File[] files = file.listFiles();
      for (int i = 0; i < files.length; i++) {
        removeFilePath(files[i]);
      }
    }

    file.delete();
  }

  /**
   * Test whether a file exists.
   *
   * @param filePath
   *          file path
   * @return true if file exists; otherwise false.
   */
  public static boolean exists(String filePath) {
    return new File(filePath).exists();
  }

  /**
   * Assure a file path exists.
   *
   * @param filePath
   */
  public static void assureFilePath(String filePath) {
    File f = new File(filePath);
    if (!f.isDirectory()) {
      File parent = f.getParentFile();
      parent.mkdirs();
    }
  }

  public static void assureDirPath(String dirPath) {
    new File(dirPath).mkdirs();
  }

  public static boolean move(String src, String dst) {
    File srcFile = new File(src);
    File dstFile = new File(dst);

    if (dstFile.exists()) {
      dstFile.delete();
    } else {
      dstFile.getParentFile().mkdirs();
    }

    return srcFile.renameTo(dstFile);
  }
}

package com.fun.set2;

import com.fun.utils.AES;

public class Problem025 {
  public static void main(String[] arguments) throws Exception {
    String encryptionKey = "MZygpewJsCpRrfOr";
    String plainText = "Hello world!";
    AES aes = new AES(encryptionKey);
    String cipherText = aes.encrypt(plainText);
    String decryptedCipherText = aes.decrypt(cipherText);

    System.out.println(plainText);
    System.out.println(cipherText);
    System.out.println(decryptedCipherText);
  }
}

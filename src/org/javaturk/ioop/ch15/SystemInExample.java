package org.javaturk.ioop.ch15;

import java.io.IOException;
import java.io.InputStream;

public class SystemInExample {

    public static void main(String[] args) throws IOException {
        readOneByte();
//        readTwoBytes1();
//        readTwoBytes2();
//        readBytes();
//        readNBytes();
//        readAllBytes();
//        keepReading1();
//        keepReading2();
    }

    public static void readOneByte() throws IOException {
        System.out.println("readOneByte()");
        InputStream in = System.in;
        System.out.print("Please enter a character:"); // Enter a or ğ (Latin small letter g with breve, Unicode decimal 287, binary 0000_0001_0001_1111 or hex \u011f) or just hit return
        int aByte = in.read();
        System.out.println("Byte read: " + aByte);
        System.out.println("Char read: " + (char) aByte);
        System.out.println("The end");
    }

    public static void readTwoBytes1() throws IOException {
        //Try with following inputs: a and then enter, ab, ğ, ğı, ağ
        System.out.println("readTwoBytes1()");
        InputStream in = System.in;
        System.out.print("Please enter a character:");
        int aByte = in.read();
        int anotherByte = in.read();
        byte[] bytes = new byte[2];
        bytes[0] = (byte) aByte;
        bytes[1] = (byte) anotherByte;
        String string = new String(bytes);
        if (string.length() == 1) {
            System.out.println("Char read: " + string);
            char charRead = string.charAt(0);
            System.out.println("Integer read: " + (int) charRead);
        } else {
            System.out.println("Chars read: " + string);
            char firstCharacter = string.charAt(0);
            System.out.println("Integer read: " + (int) firstCharacter);
            char secondCharacter = string.charAt(1);
            System.out.println("Integer read: " + (int) secondCharacter);
        }
        System.out.println("The end");
    }

    public static void readTwoBytes2() throws IOException {
        //Try with following inputs: a and then enter, ab, ğ, ğı, ağ
        System.out.println("readTwoBytes2()");
        InputStream in = System.in;
        System.out.print("Please enter a character:");
        byte[] bytes = in.readNBytes(2);
        String string = new String(bytes);
        if (string.length() == 1) {
            System.out.println("Char read: " + string);
            char charRead = string.charAt(0);
            System.out.println("Integer read: " + (int) charRead);
        } else {
            System.out.println("Chars read: " + string);
            char firstCharacter = string.charAt(0);
            System.out.println("Integer read: " + (int) firstCharacter);
            char secondCharacter = string.charAt(1);
            System.out.println("Integer read: " + (int) secondCharacter);
        }
    }

    public static void readBytes() throws IOException {
        System.out.println("readBytes()");
        InputStream in = System.in;
        System.out.print("Please enter characters:");
        byte[] bytes = new byte[1000];
        int byteCount = in.read(bytes);
        System.out.println("Number of bytes read: " + byteCount);
        String string = new String(bytes);
        System.out.println("String read: " + string);
    }


    public static void readNBytes() throws IOException {
        // Try with both akin kaldiroglu and akın kaldıroğlu
        System.out.println("readNBytes()");
        InputStream in = System.in;
        System.out.print("Please enter characters:");
        byte[] bytes = new byte[15];
        bytes = in.readNBytes(15);
        System.out.println("Number of bytes read: " + bytes.length);
        String string = new String(bytes);
        System.out.println("String read: " + string);
    }

    public static void readAllBytes() throws IOException {
        System.out.println("readAllBytes()");
        InputStream in = System.in;
        System.out.print("Please enter characters:");
        byte[] bytes = in.readAllBytes();
        String string = new String(bytes);
        System.out.println("String read: " + string);
    }

    public static void keepReading1() throws IOException {
        // Try with both akin kaldiroglu and akın kaldıroğlu
        System.out.println("keepReading1()");
        InputStream in = System.in;
        System.out.print("Please enter characters:");
        int charRead;
        while ((charRead = System.in.read()) != -1) // -1 can't be entered on terminal so try keepReading2() method instead!
            System.out.write(charRead);
        System.out.println("bye ");
    }

    public static void keepReading2() throws IOException {
        // Try with both akin kaldiroglu and akın kaldıroğlu
        System.out.println("keepReading2()");
        InputStream in = System.in;
        System.out.print("Please enter characters:");
        int charRead;
        while ((charRead = System.in.read()) != 'q')
            System.out.write(charRead);
        System.out.println("bye ");
    }

}

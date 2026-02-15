package org.javaturk.ioop.ch15;

import java.io.IOException;
import java.io.PrintStream;

public class SystemIO {

    public static void main(String[] args) throws IOException {
        write();
        read();
    }

    public static void write(){
        System.out.println("This is regular.");
        PrintStream out = System.out;
        out.println("This is regular.");

        System.err.println("\nThis is red.");
        PrintStream err = System.err;
        err.println("This is red.");
    }

    public static void read() throws IOException {
        System.out.println("\nKeep writing some characters along with enter:");
        int charRead; // It is an int, which means only one byte of four bytes are meaningful, which is fine for an ASCII char such as q!
        while ((charRead = System.in.read()) != 'q')
            System.out.print((char) charRead);
        System.out.println("bye ");
    }
}

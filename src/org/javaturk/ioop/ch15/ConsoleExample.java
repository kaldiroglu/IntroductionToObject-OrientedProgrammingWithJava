package org.javaturk.ioop.ch15;

import java.io.Console;

public class ConsoleExample {

    public static void main(String[] args) {
        readLine();
//        readLineWithPrompt();
//        printFormatted();
//        readPassword();
//        readPasswordWithPrompt();
    }

    public static void readLine() {
        System.out.println("readLine()");
        Console console = System.console();
        if (console != null) {
            System.out.println("Please write something: ");
            String line = console.readLine();
            System.out.println("You've written: " + line);
        } else
            System.out.println("No Console exists!");
    }

    public static void readLineWithPrompt() {
        System.out.println("readLineWithPrompt()");
        Console console = System.console();
        if (console != null) {
            String line = console.readLine("Please  write something: ");
            System.out.println("You've written: " + line);
        } else
            System.out.println("Console is null!");
    }

    public static void printFormatted() {
        System.out.println("printFormatted()");
        Console console = System.console();
        if (console != null) {
            String line = console.readLine("Please write something: ");
            console.printf("%20s : %100s\n", "You've written", line);
        } else
            System.out.println("Console is null!");
    }

    public static void readPassword() {
        System.out.println("readPassword()");
        Console console = System.console();
        if (console != null) {
            System.out.println("Please enter your password: ");
            char[] password = console.readPassword();
            System.out.println("Your password: " + password);
            String passwordString = new String(password);
            System.out.println("Your password: " + passwordString);
        } else
            System.out.println("Console is null!");
    }

    public static void readPasswordWithPrompt() {
        System.out.println("readLineWithPrompt()");
        Console console = System.console();
        if (console != null) {
            char[] password = console.readPassword("Please enter your password: ");
            System.out.println("Your password: " + password);
            String passwordString = new String(password);
            System.out.println("Your password: " + passwordString);
        } else
            System.out.println("Console is null!");
    }
}
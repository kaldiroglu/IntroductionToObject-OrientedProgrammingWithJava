package org.javaturk.ioop.ch15;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

import static java.lang.Math.PI;

public class PrintStreamExample {

    public static void main(String[] args) {
        print();
        formatGeneral();
//        formatPrimitives();
//        printMultiplicationTable();
//        printILoveJavaTable();
//        formatDate();
//        formatFloat();
    }

    public static void print() {
        char[] name = {'J', 'A', 'V', 'A'};
        System.out.print(name);
        System.out.println();

        System.out.print("I love Java");
        System.out.println();

        int[] numbers = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        System.out.print(Arrays.toString(numbers));
        System.out.println();

        boolean b = false;
        System.out.println(b);

        int i = 2026;
        System.out.print(i);

        System.out.println();

        System.out.println(PI);

        System.out.println(new Date());
    }

    /**
     * java.util.Formatter for formatting.
     */
    public static void formatGeneral() {
        System.out.printf("\n%s\n", "formatGeneral()");

        System.out.printf(">%s<\n", "Hey, how are you?");

        System.out.printf(">%10s<\n", "Hey, how are you?");
        System.out.printf(">%-10s<\n", "Hey, how are you?");

        System.out.printf(">%50s<\n", "Hey, how are you?");
        System.out.printf(">%-50s<\n", "Hey, how are you?");

        System.out.printf(">%40s<\n", Math.PI);
        System.out.printf(">%-40s<\n", Math.PI);

        System.out.printf(">%400s<\n", new Date());
        System.out.printf(">%-40s<\n", new Date());

        System.out.printf("%s", '\n');
    }

    public static void formatPrimitives() {
        System.out.printf("\n%s\n", "formatPrimitives()");

        System.out.printf("\n%s\n", "int");
        System.out.printf(">%d<\n", 1511);
        System.out.printf(">%20d<\n", 1511);
        System.out.printf(">%020d<\n", 1511); // Padding with 0s
        System.out.printf(">%-20d<\n", 1511);
        System.out.printf(">%-20o<\n", 1511);
        System.out.printf(">%-20x<\n", 1511);

        System.out.printf("\n%s\n", "ints");
        System.out.printf(">%d< >%d<\n", 1511, 1288519);
        System.out.printf(">%1$d< >%2$d<\n", 1511, 1288519);
        System.out.printf(">%1$10d< >%2$10d<\n", 1511, 1288519);
        System.out.printf(">%1$010d< >%2$010d<\n", 1511, 1288519);
        System.out.printf(">%1$-10d< >%2$-10d<\n", 1511, 1288519);

        System.out.printf("\n%s\n", "char");
        System.out.printf(">%10c<\n", 'a');
        System.out.printf(">%-20C<\n", 'a');

        System.out.printf("\n%s\n", "boolean");
        System.out.printf(">%b<\n", false);
        System.out.printf(">%B<\n", false);

        System.out.printf("\n%s\n", "floating-point");
        System.out.printf(">%e<\n", PI);
        System.out.printf(">%f<\n\n", PI);
        System.out.printf(">%2$e< %1$20s, >%2$+05.20e<\n", " ", PI); // $1 is the argument index
        System.out.printf(">%f< >%1$+05.20f<\n\n", PI);
        System.out.printf(">%g< >%1$+05.20g<\n", PI);
        System.out.printf(">%e< >%1$+05.20e<\n", PI);
        System.out.printf(">%a< >%1$+05.20a<\n\n", PI);
        System.out.printf(">%e< >%1$+05.20e<\n", PI); // $1 is the argument index
    }

    public static void printMultiplicationTable() {
        System.out.printf("\n%s\n\n", "printMultiplicationTable();\n()");

        System.out.printf("%s\n", "Multiplication Table - I");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j);
            }
            System.out.println();
        }

        System.out.printf("\n%s\n", "Multiplication Table - II");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d", i * j);
            }
            System.out.println();
        }

        System.out.printf("\n%s\n", "Multiplication Table - III");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%5d", i * j);
            }
            System.out.println();
        }

        System.out.printf("\n%s\n", "Multiplication Table - IV");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%-5d", i * j);
            }
            System.out.println();
        }
    }

    public static void printILoveJavaTable() {
        System.out.printf("\n%s\n\n", "printILoveJavaTable()");

        System.out.printf("%s\n\n", "I love Java - I");
        String[] sentences = {"I", "I love", "I love Java", "I love Java very", "I love Java very much", "I love Java very much :)"};
        for(int i = 1; i < sentences.length; i++){
                System.out.println(sentences[i] + " has " + sentences[i].length() + " characters");
        }

        System.out.printf("\n\n%s\n\n", "I love Java - II");
        for(int i = 1; i < sentences.length; i++){
            System.out.printf("%50s has %5s characters\n", sentences[i], sentences[i].length());
        }

        System.out.printf("\n\n%s\n\n", "I love Java - III");
        for(int i = 1; i < sentences.length; i++){
            System.out.printf("%-50s has %-5s characters\n", sentences[i], sentences[i].length());
        }

        System.out.printf("\n\n%s\n\n", "I love Java - IV");
        for(int i = 1; i < sentences.length; i++){
            System.out.printf("%-25s has %-2s characters\n", sentences[i], sentences[i].length());
        }
    }

    public static void formatDate() {
        System.out.printf("\n%s\n", "formatDate()");

        System.out.printf("\n%s\n", "*** Date Using s ***");
        System.out.printf(">%40s<\n", new Date());
        System.out.printf(">%-40s<\n", new Date());

        // t and T are a prefix for date and time conversion characters.

        System.out.printf("\n%s\n", "*** Date Using t ***");
        System.out.printf(">%-40tD<\n", new Date());
        System.out.printf(">%-40tR<\n", new Date());
        System.out.printf(">%-40tT<\n", new Date());
        System.out.printf(">%-40tr<\n", new Date());
        System.out.printf(">%-40tF<\n", new Date());
        System.out.printf(">%-40tc<\n", new Date());

        System.out.printf("\n%s\n", "*** GregorianCalendar Using t ***");
        System.out.printf(">%-40tD<\n", new GregorianCalendar());
        System.out.printf(">%-40tR<\n", new GregorianCalendar());
        System.out.printf(">%-40tT<\n", new GregorianCalendar());
        System.out.printf(">%-40tr<\n", new GregorianCalendar());
        System.out.printf(">%-40tF<\n", new GregorianCalendar());
        System.out.printf(">%-40tc<\n", new GregorianCalendar());

        System.out.printf("%s", '\n');
    }

    public static void formatFloat() {
        System.out.printf("%s", '\n');
        System.out.printf("%f, %1$020.10f %n", PI);
        System.out.printf("%f, %1$20.10f %n", PI);
        System.out.printf("%f, %1$30.20f%n", PI);

        System.out.format("i = %d %n", 8);
        System.out.format("i = %f %n", 8f);
        System.out.format("i = %5.2f %n", 8d);

        System.out.println();

        System.out.format("i = %f %n", 829.23f);
        System.out.format("i = %5f %n", 829.23f);
        System.out.format("i = %10.3f %n", 829.23f);
        System.out.format("i = %-10.3f %n", 829.23f);
    }
}

package org.javaturk.ioop.ch15;

import java.util.InputMismatchException;
import java.util.Scanner;

import static org.javaturk.ioop.ch15.ScannerUtil.*;

public class ScannerExample {
    public static void main(String[] args) {
//        readInfo();
//        readAnything();
//        readNextAndNextLine();
//        calculateSum();
        useDelimiter();
    }

    public static void readInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unix: Type ctrl-d to exit."
                + "\nWindows: Type ctrl-z to exit\n");

        System.out.println("Enter your first name: ");
        String firstName = scanner.next();

        System.out.println("Enter your last name: ");
        String lastName = scanner.next();

        int age = 0;
        System.out.println("Enter your age: ");
        try {
            age = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Abicim int gireceksin int :)");
            age = scanner.nextInt();
        }

        System.out.println("Enter your sex (m or f): ");
        char sex = scanner.next().charAt(0);

        System.out.println("Enter your height: ");
        float height = scanner.nextFloat();

        System.out.println(firstName + " " + lastName + " " + age + " " + sex
                + " " + height);

        String line = readLine("Bir seyler daha yaz:");
        System.out.println(line);
    }


    public static void readAnything() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unix: Type ctrl-d to exit."
                + "\nWindows: Type ctrl-z to exit\n");

        System.out.println("Enter something: ");
        if (scanner.hasNextBoolean())
            System.out.println("It is a boolean: " + scanner.nextBoolean());

        else if (scanner.hasNextByte())
            System.out.println("It is a byte: " + scanner.nextByte());

        else if (scanner.hasNextShort())
            System.out.println("It is a short: " + scanner.nextShort());

        else if (scanner.hasNextInt())
            System.out.println("It is a int: " + scanner.nextInt());

        else if (scanner.hasNextDouble())
            System.out.println("It is a double: " + scanner.nextDouble());

        else System.out.println("It is a string: " + scanner.next());

    }

    public static void readNextAndNextLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something:");
        // Enter: Hey what's up how are you?
        String token = scanner.next();
        System.out.println("You've entered: " + token);
        String line = scanner.nextLine();
        System.out.println("Enter something else:");
        System.out.println("You've entered: " + line);
    }

    public static void calculateSum() {
        double sum = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter several numbers to calculate sum and enter 0 to finish calculation:");
        System.out.print("Number: ");

        while (s.hasNext()) {
            double nextDouble = s.nextDouble();
            if (nextDouble == 0)
                break;
            sum += nextDouble;
            System.out.print("Number: ");
        }
        s.close();

        System.out.println("Sum of all numbers = " + sum);
    }

    public static void useDelimiter(){
        String s = "1,2,3,4,5";
        Scanner sc = new Scanner(s);
        sc.useDelimiter(",");
        while(sc.hasNext()){
            System.out.println(sc.nextInt());
        }
    }
}

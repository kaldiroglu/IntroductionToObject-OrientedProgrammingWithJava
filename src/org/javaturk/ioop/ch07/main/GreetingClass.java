package org.javaturk.ioop.ch07.main;

import java.util.Random;

public class GreetingClass {
    Random random = new Random();

    String start = "*** GreetingClass Example ***";

    public void main() {
        System.out.println(start);
        saySalam();
        sayHello();
    }

    void saySalam() {
        Selam s = new Selam();
        int limit = random.nextInt(10);
        for (int i = 0; i < limit; i++)
            System.out.println(s.selamSoyle("Nalan"));

    }

    void sayHello() {
        Hello h = new Hello();
        int limit = random.nextInt(10);
        for (int i = 0; i < limit; i++)
            System.out.println(h.sayHello("Jane"));
    }
}

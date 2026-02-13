// Compact source files can not have a package sdeclaration
//package org.javaturk.ioop.ch07.main;

import org.javaturk.ioop.ch07.main.Hello;
import org.javaturk.ioop.ch07.main.Selam;

static Random random = new Random();

static String start = "*** Greeting-2 Example ***";

public static  void main() {
    System.out.println(start);
    saySalam();
    sayHello();
}

static void saySalam() {
    Selam s = new Selam();
    int limit = random.nextInt(10);
    for (int i = 0; i < limit; i++)
        System.out.println(s.selamSoyle("Nalan"));

}

static void sayHello() {
    Hello h = new Hello();
    int limit = random.nextInt(10);
    for (int i = 0; i < limit; i++)
        System.out.println(h.sayHello("Jane"));
}


 


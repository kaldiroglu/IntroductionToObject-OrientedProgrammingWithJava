package org.javaturk.ioop.ch07;

public class MyClass {

    int i = 5;

    public static void main(String[] args) {
        MyClass mc = new MyClass();
        System.out.println(mc.i);
        mc.aMethod();
        bMethod();
    }

    void aMethod(){
        System.out.println("Naber abi :)");
    }

    static void bMethod(){
        System.out.println("Naber abi :)");
    }
}

//package org.javaturk.ioop.ch06.call.newThis;
//
//public class Tree {
//    String type;
//    float height;
//
//    public Tree(String newType, float newHeight) {
//        if (newType != null && newHeight >= 0) {
//            type = newType;
//            height = newHeight;
//        }
//    }
//
//    Tree(String newType) {
//        if (newType == null)
//            throw new IllegalArgumentException("Type cannot be null!");
//        this(newType, 1.0f);
//    }
//
//    Tree(float newHeight) {
//        if (newHeight >= 0)
//            throw new IllegalArgumentException("Height cannot be negative!");
//        this("Pine", newHeight);
//    }
//
//    Tree() {
//        String newType = "Pine";
//        float newHeight = 1.0f;
//        this(newType, newHeight);
//    }
//
//    public void printInfo() {
//        System.out.println("\nTree Info:");
//        System.out.println("Type: " + type);
//        System.out.println("Height: " + height);
//    }
//}

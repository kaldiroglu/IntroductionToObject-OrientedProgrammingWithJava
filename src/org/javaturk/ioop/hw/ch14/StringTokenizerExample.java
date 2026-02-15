package org.javaturk.ioop.hw.ch14;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String sentence = "I love Java very much!, it is fun to code in it!";

        StringTokenizer st = new StringTokenizer(sentence);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        System.out.println("*****************");

        StringTokenizer st1 = new StringTokenizer(sentence, ",");
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }

        System.out.println("*****************");

        StringTokenizer st2 = new StringTokenizer(sentence, ",!", true);
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }

        System.out.println("*****************");

        String[] tokens = sentence.split("!");
        for(String token : tokens)
            System.out.println(token);
    }
}

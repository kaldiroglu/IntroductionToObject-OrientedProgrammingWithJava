package org.javaturk.ioop.hw.solution.ch06.password;

public class Test {
    public static void main(String[] args) {

        Password password = new PasswordBuilder().setLength(6).add('a').add('b').add('c').add('d').add('e').add('f').build();
        System.out.println(password.getPassword());

        PasswordBuilder pb = new PasswordBuilder();
        pb.setLength(8).add('q').add('w').add('e').add('r').add('t').add('y').add('1').add('2');
        System.out.println(pb.build().getPassword());
    }
}

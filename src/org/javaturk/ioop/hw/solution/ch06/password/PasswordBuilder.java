package org.javaturk.ioop.hw.solution.ch06.password;

public class PasswordBuilder {
    private Password password;

    PasswordBuilder setLength(int passwordLength){
        password = new Password();
        password.setLength(passwordLength);
        return this;
    }

    PasswordBuilder add(char ch){
        password.append(ch);
        return this;
    }

    Password build(){
        return password;
    }



}

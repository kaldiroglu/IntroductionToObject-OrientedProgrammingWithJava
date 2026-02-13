package org.javaturk.ioop.hw.solution.ch06.password;

public class Password {
    char[] passwordArray;
    int cursor;
    int length;

    void setLength(int passwordLength){
        length = passwordLength;
        passwordArray = new char[passwordLength];
    }

    String getPassword(){
        return new String(passwordArray);
    }

    public void append(char ch) {
        if(cursor < length){
            passwordArray[cursor++] = ch;
        }
    }
}

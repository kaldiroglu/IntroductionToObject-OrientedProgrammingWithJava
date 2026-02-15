/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javaturk.ioop.ch14;

/**
 * This class is an exception and states that the bulb is blown due to a high
 * @author akin
 */
public class BulbBlownException extends Exception{
    private static String text = "Bulb is blown! ";
    
    public BulbBlownException(int luminescence){
        super(text + "Luminescence that blew the bulb: " + luminescence);
    }
    
}

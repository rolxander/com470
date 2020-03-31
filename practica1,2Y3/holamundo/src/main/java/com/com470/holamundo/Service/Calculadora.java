/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.holamundo.Service;

/**
 *
 * @author Jose Gael
 */
public class Calculadora {
    public Calculadora(){}
    public float  suma(float x , float y){
        return x+y;
    }
    public float resta(float x , float y){
        return x-y;
    }
    public float division(float x , float y){
        if(y==0){
            throw new ArithmeticException();
        }
        return x/y;
    }public float multiplicacion(float x , float y){
        return x*y;
    }
}

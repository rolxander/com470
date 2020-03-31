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
public class ValidarEmail {
    private static ValidarEmail instance;
    private boolean clean = true;

    private ValidarEmail() {
    }
    public static synchronized ValidarEmail getInstance() {
        if (ValidarEmail.instance == null) {
            instance = new ValidarEmail();
        }
        return ValidarEmail.instance;
    } 
    
    public boolean validaEmail(String email){
        if (!clean) {
            throw new IllegalStateException("El validador esta mal");
        }
        this.clean=false;
        if (!email.contains("@")) {
            return false;
        }
        return true;
    }
    
    public void reset(){
    if (this.clean) {
            throw new IllegalStateException("Aun no se puede llamar");
        }
    this.clean=true;
    }
}

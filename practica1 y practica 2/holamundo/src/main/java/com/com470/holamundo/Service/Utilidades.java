/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.com470.holamundo.Service;

/**
 *
 * @author Jose Gael**/
public class Utilidades {
    public String concatenar(String uno, String dos){
        if(uno!=null && dos!=null){
            return uno.concat(" ").concat(dos);
        }
        return null;
    }
}

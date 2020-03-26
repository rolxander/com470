/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.holamundo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jose Gael
 */
@RestController
public class HolaMundoController {
    @RequestMapping(value="/")
    public String hola(){
        return "Hola Mundo";
    }
}

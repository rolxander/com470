/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Controller.MinimoMaximo;
import java.util.List;

/**
 *
 * @author Jose Gael
 */
public class BuscarMinimoMaximo {
     public MinimoMaximo buscaMinimoMaximo(List<Integer> lista){
        int smallest = lista.get(0);
        int largest = lista.get(0);
        System.out.print("La lista es "+lista.toString());
        for(int i = 0; i< lista.size();i++){
            if(lista.get(i)<smallest) smallest = lista.get(i);
            if(lista.get(i)>largest) largest = lista.get(i);
            
        }
        System.out.print("El menor es >> " + smallest);
        System.out.print("El mayor es >> " + largest);
        return new MinimoMaximo(smallest,largest);
    };
}

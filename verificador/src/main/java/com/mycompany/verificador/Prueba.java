/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.verificador;
/**
 *
 * @author hp
 */
public class Prueba {
    
    public static void main(String []arg){{
        Verificador verif=new Verificador();
            
        if(verif.verificarEdad(15)){            
            System.out.print("Eres mayor de Edad");           
            
        } else{  
            
            System.out.print("Eres Menor de Edad");
    }
    
    Numeracion num=new Numeracion();   
    num.imprimirHasta(10);
        }
    }
}
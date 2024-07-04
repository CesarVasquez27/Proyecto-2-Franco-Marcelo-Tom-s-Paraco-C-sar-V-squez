/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto2francobarracesarvasqueztomasparaco;

/**
 *
 * @author frank
 */
import java.util.HashMap;
public class Proyecto2FrancoBarraCesarVasquezTomasParaco {

   public static void main(String[] args) {
        List<String> autores = new List<>();
        autores.addLast("Autor1");
        autores.addLast("Autor2");

        String resumen = "Este es un resumen de ejemplo. Este resumen incluye palabras clave importantes.";

        List<String> palabrasClave = new List<>();
        palabrasClave.addLast("resumen");
        palabrasClave.addLast("ejemplo");
        palabrasClave.addLast("palabras");
        palabrasClave.addLast("clave");

        Resumen miResumen = new Resumen(autores, resumen, palabrasClave);
      
    }
}


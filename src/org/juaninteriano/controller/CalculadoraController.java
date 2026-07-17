
package org.juaninteriano.controller;


public class CalculadoraController {
    private String opcion1 = "";
    private String operador = "";
    private String opcion2 = "";
    private boolean calculoTerminado = true;
    
    public CalculadoraController() {
        
    }
    
    public void procesoDeEntrada(String entrada, label pantalla){
        if (entrada.matches("[0-9]")) {
            
            opcion1 += entrada;
            
            actualizarPantalla(pantalla);
        }
    }
    
    private
}

package org.juaninteriano.system;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.juaninteriano.view.CalculadoraView;

public class main extends Application {

    public static void main(String[] args) {
        launch(args); 
    }

    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        // Vista de la calculadora 
        CalculadoraView calculadora = new CalculadoraView(); 
        
        // Creamos la escena pasándole directamente la vista
        Scene escena = new Scene(calculadora.getView(), 266, 390);
        
        // Mostrar escenario principal
        //nombre con el que sera mostrada la calculadora
        escenarioPrincipal.setTitle("Calculadora de Interiano");
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.show();
    }
}
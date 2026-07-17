package org.juaninteriano.system;

import org.juaninteriano.view.CalculadoraView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class main extends Application {
    
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        launch(args);
    }

    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        //Vista de la calculadora
        CalculadoraView calculadora = new CalculadoraView();
        
         //nodos
         Pane raiz = new Pane(calculadora.getView());
        
        Scene escena = new Scene(raiz, 266, 390);
        
        escenarioPrincipal.setTitle("Calculadora de Derek");
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.show();
        
    }
    
}
package org.juaninteriano.view;

import javafx.geometry.Insets;
import java.util.HashSet;
import java.util.Set;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import org.juaninteriano.controller.CalculadoraController;

public class CalculadoraView {

    private VBox view;
    private Label pantalla;
    private GridPane cuadroBotones;
    private CalculadoraController controlador;

      public CalculadoraView() {
        controlador = new CalculadoraController();
        view = new VBox(15); 
        view.setPadding(new Insets(15));
        view.setAlignment(Pos.CENTER);
        view.setStyle("-fx-background-color: #758FBA");
        
        pantalla = new Label("0");
        pantalla.setFont(Font.font("Consolas", FontWeight.BOLD, 40));
        pantalla.setAlignment(Pos.CENTER_RIGHT); 
        pantalla.setPrefSize(235, 50); 
        
        cuadroBotones = new GridPane();
        cuadroBotones.setHgap(10);
        cuadroBotones.setVgap(10);
        cuadroBotones.setAlignment(Pos.CENTER);
        
        Button btnCE = accionBoton("CE");
        
        Button btnFrac = accionBoton("%");
        
        Button btnUNo = nuevoBoton("1");
        
        Button btnDos = nuevoBoton("2");
        
        Button btnTres = nuevoBoton("3");

        Button btnCuatro = nuevoBoton("4");
        
        Button btnCinco = nuevoBoton("5");
        
        Button btnSeis = nuevoBoton("6");
        
        Button btnSiete = nuevoBoton("7");
        
        Button btnOcho = nuevoBoton("8");
        
        Button btnNueve = nuevoBoton("9");
        
        Button btnCero = nuevoBoton("0");
        
        Button btnPunto = accionBoton(".");
        
        Button btnIgual = accionBoton("=");
        btnIgual.setPrefSize(50, 50);
        
        Button btnMas = accionBoton("+");
        
        Button btnMenos = accionBoton("-");

        Button btnPor = accionBoton("*");
        
        Button btnDiv = accionBoton("÷");
        
        Button btnElevar = accionBoton("^");
        
        Button btnRaiz = accionBoton("√");
        
 
    cuadroBotones.add(btnFrac, 0, 1);
    cuadroBotones.add(btnElevar, 1, 1);
    cuadroBotones.add(btnRaiz, 2, 1);
    cuadroBotones.add(btnDiv, 3, 1);
    cuadroBotones.add(btnSiete, 0, 2);
    cuadroBotones.add(btnOcho, 1, 2);
    cuadroBotones.add(btnNueve, 2, 2);
    cuadroBotones.add(btnPor, 3, 2);
    cuadroBotones.add(btnCuatro, 0, 3);
    cuadroBotones.add(btnCinco, 1, 3);
    cuadroBotones.add(btnSeis, 2, 3);
    cuadroBotones.add(btnMenos, 3, 3);
    cuadroBotones.add(btnUNo, 0, 4);
    cuadroBotones.add(btnDos, 1, 4);
    cuadroBotones.add(btnTres, 2, 4);
    cuadroBotones.add(btnMas, 3, 4);
    cuadroBotones.add(btnCE, 0, 5);
    cuadroBotones.add(btnCero, 1, 5);
    cuadroBotones.add(btnPunto, 2, 5);
    cuadroBotones.add(btnIgual, 3, 5);
    GridPane.setColumnSpan(btnIgual, 2);

        
        
        
        view.getChildren().addAll(pantalla, cuadroBotones);     
    }
    
    public VBox getView(){
        return view;
    }
    
    private Button nuevoBoton (String texto){
        Button btn = new Button(texto);
        btn.setPrefSize(50, 50);
        btn.setStyle("-fx-background-color: #4B71AD; -fx-text-fill:black; -ft-background-radius:5px;"
                + " -fx-cursor:hand;");
        
        btn.setOnAction(e -> {
            btn.setStyle("-fx-background-color:#3D547D ; -fx-text-fill: black;");
            controlador.procesoDeEntrada(texto, pantalla);
            btn.setTranslateY(2);
        });

        
        btn.setOnMouseReleased(e -> {
            btn.setStyle("-fx-background-color: #66B9F4; -fx-text-fill: black;");
            btn.setTranslateY(0);
        });
        btn.setFont(Font.font("Consolas", FontWeight.BOLD, 20));
        
        
        return btn;
        
    }
    
    private Button accionBoton (String texto){
        Button btn = new Button(texto);
        btn.setPrefSize(50, 50);
        btn.setStyle("-fx-background-color: #4F4F4F; -fx-text-fill:black; -ft-background-radius:5px;"
                + " -fx-cursor:hand;");
        
        btn.setOnMousePressed(e -> {
            btn.setStyle("-fx-background-color:#F79764 ; -fx-text-fill: black;");
            controlador.procesoDeEntrada(texto, pantalla);
            btn.setTranslateY(2);
        });

        
        btn.setOnMouseReleased(e -> {
            btn.setStyle("-fx-background-color: #F4712A; -fx-text-fill: black;");
            btn.setTranslateY(0);
        });
        btn.setFont(Font.font("Consolas", FontWeight.BOLD, 20));
        
        
        return btn;
        
    }
    
}
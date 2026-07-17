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
 
public class CalculadoraView {
    private VBox view; 
    private Label pantalla; 
    private GridPane cuadroBotones;     
    // Constructor
    //controller
    private CalculadoraController controlador;
    
    public CalculadoraView() {
        controlador = new CalculadoraController();
        
        view = new VBox(15); 
        view.setPadding(new Insets(15));
        view.setAlignment(Pos.CENTER);
        view.setStyle("-fx-background-color: #D64949");
        pantalla = new Label("0");
        pantalla.setFont(Font.font("Consolas", FontWeight.BOLD, 40));
        pantalla.setAlignment(Pos.CENTER_RIGHT); 
        pantalla.setPrefSize(235, 50); 
        cuadroBotones = new GridPane();
        cuadroBotones.setHgap(10);
        cuadroBotones.setVgap(10);
        cuadroBotones.setAlignment(Pos.CENTER);
        Button btnCiento = new Button("%");
        btnCiento.setPrefSize(50, 50);
        Button btnCE = new Button("CE");
        btnCE.setPrefSize(50, 50);
        Button btnC = new Button("C");
        btnC.setPrefSize(50, 50);
        Button btnUNo = new Button("1");
        btnUNo.setPrefSize(50, 50);
        btnUNo.setStyle("-fx-background-color: #6B8E23; -fx-text-fill:white; -ft-background-radius:5px;"
                + " -fx-cursor:hand;");
        btnUNo.setOnMousePressed(e -> {
            btnUNo.setStyle("-fx-background-color: #388E3C; -fx-text-fill: white;");
            btnUNo.setTranslateY(2);
        });
 
        
        btnUNo.setOnMouseReleased(e -> {
            btnUNo.setStyle("-fx-background-color: #688E23; -fx-text-fill: white;");
            btnUNo.setTranslateY(0);
        });
        btnUNo.setFont(Font.font("Consolas", FontWeight.BOLD, 20));
        Button btnDos = new Button("2");
        btnDos.setPrefSize(50, 50);
        btnDos.setStyle("-fx-background-color: #6B8E23; -fx-text-fill:white; -ft-background-radius:5px;"
                + " -fx-cursor:hand;");
        btnDos.setOnMousePressed(e -> {
            btnDos.setStyle("-fx-background-color: #388E3C; -fx-text-fill: white;");
            btnDos.setTranslateY(2);
        });
 
        
        btnDos.setOnMouseReleased(e -> {
            btnDos.setStyle("-fx-background-color: #688E23; -fx-text-fill: white;");
            btnDos.setTranslateY(0);
        });
        btnDos.setFont(Font.font("Consolas", FontWeight.BOLD, 20));
        Button btnTres = new Button("3");
        btnTres.setPrefSize(50, 50);
        btnTres.setStyle("-fx-background-color: #6B8E23; -fx-text-fill:white; -ft-background-radius:5px;"
                + " -fx-cursor:hand;");
        btnTres.setOnMousePressed(e -> {
            btnTres.setStyle("-fx-background-color: #388E3C; -fx-text-fill: white;");
            btnTres.setTranslateY(2);
        });
 
        
        btnTres.setOnMouseReleased(e -> {
            btnTres.setStyle("-fx-background-color: #688E23; -fx-text-fill: white;");
            btnTres.setTranslateY(0);
        });
        btnTres.setFont(Font.font("Consolas", FontWeight.BOLD, 20));
        Button btnCuatro = new Button("4");
        btnCuatro.setPrefSize(50, 50);
        Button btnCinco = new Button("5");
        btnCinco.setPrefSize(50, 50);
        Button btnSeis = new Button("6");
        btnSeis.setPrefSize(50, 50);
        Button btnSiete = new Button("7");
        btnSiete.setPrefSize(50, 50);
        Button btnOcho = new Button("8");
        btnOcho.setPrefSize(50, 50);
        Button btnNueve = new Button("9");
        btnNueve.setPrefSize(50, 50);
        Button btnCero = new Button("0");
        btnCero.setPrefSize(50, 50);
        Button btnPunto = new Button(".");
        btnPunto.setPrefSize(50, 50);
        Button btnIgual = new Button("=");
        btnIgual.setPrefSize(50, 50);
        Button btnMas = new Button("+");
        btnMas.setPrefSize(50, 50);
        btnMas.setStyle("-fx-background-color: #6B8E23; -fx-text-fill:white; -ft-background-radius:5px;"
                + " -fx-cursor:hand;");
        btnMas.setOnMousePressed(e -> {
            btnMas.setStyle("-fx-background-color: #388E3C; -fx-text-fill: white;");
            btnMas.setTranslateY(2);
        });
 
        
        btnMas.setOnMouseReleased(e -> {
            btnMas.setStyle("-fx-background-color: #688E23; -fx-text-fill: white;");
            btnMas.setTranslateY(0);
        });
        btnMas.setFont(Font.font("Consolas", FontWeight.BOLD, 20));
        Button btnMenos = new Button("-");
        btnMenos.setPrefSize(50, 50);
        Button btnPor = new Button("x");
        btnPor.setPrefSize(50, 50);
        Button btnDiv = new Button("÷");
        btnDiv.setPrefSize(50, 50);

        cuadroBotones.add(btnCiento, 0, 2);
        cuadroBotones.add(btnCE, 1, 2);
        cuadroBotones.add(btnC, 2, 2);
        cuadroBotones.add(btnUNo, 0, 5);
        cuadroBotones.add(btnDos, 1, 5);
        cuadroBotones.add(btnTres, 2, 5);
        cuadroBotones.add(btnCuatro, 0, 4);
        cuadroBotones.add(btnCinco, 1, 4);
        cuadroBotones.add(btnSeis, 2, 4);
        cuadroBotones.add(btnSiete, 0, 3);
        cuadroBotones.add(btnOcho, 1, 3);
        cuadroBotones.add(btnNueve, 2, 3);
        cuadroBotones.add(btnMas, 3, 5);
        cuadroBotones.add(btnMenos, 3, 4);
        cuadroBotones.add(btnPor, 3, 3);
        cuadroBotones.add(btnDiv, 3, 2);
        cuadroBotones.add(btnCero, 1, 6);
        cuadroBotones.add(btnPunto, 2, 6);
        cuadroBotones.add(btnIgual, 3, 6);

        view.getChildren().addAll(pantalla, cuadroBotones);     
    }
    public VBox getView(){
        return view;
    }
    
    private Button nuevoBoton (String texto){
        
        Button btn = new Button(texto);
        btn.setPrefSize(50, 50);
        btn.setStyle("") 
                
        //configuracion de boton
        //tamañaoo, el estilo, sus funciones
        return btn;
    }
}
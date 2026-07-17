package org.juaninteriano.controller;

import javafx.scene.control.Label;

public class CalculadoraController {

    private String opcion1 = "";
    private String operador = "";
    private String opcion2 = "";
    private boolean calculoTerminado = false;

    public CalculadoraController() {

    }

    public void procesoDeEntrada(String entrada, Label pantalla) {

        if (entrada.equals("CE")) {
            opcion1 = "";
            operador = "";
            opcion2 = "";
            calculoTerminado = false;
            pantalla.setText("0");
            return;
        }

        if (calculoTerminado && entrada.matches("[0-9]")) {
            opcion1 = "";
            operador = "";
            opcion2 = "";
            calculoTerminado = false;
        }

        if (entrada.matches("[0-9]")) {

            if (operador.isEmpty()) {
                opcion1 += entrada;
            } else {
                opcion2 += entrada;
            }

            actualizarPantalla(pantalla);
        }

        else if (entrada.equals(".")) {

            if (operador.isEmpty()) {

                if (!opcion1.contains(".")) {

                    if (opcion1.isEmpty()) {
                        opcion1 = "0.";
                    } else {
                        opcion1 += ".";
                    }
                }

            } else {

                if (!opcion2.contains(".")) {

                    if (opcion2.isEmpty()) {
                        opcion2 = "0.";
                    } else {
                        opcion2 += ".";
                    }
                }
            }

            actualizarPantalla(pantalla);
        }

        else if (entrada.equals("+")
                || entrada.equals("-")
                || entrada.equals("*")
                || entrada.equals("÷")
                || entrada.equals("^")
                || entrada.equals("%")
                || entrada.equals("√")) {

            if (entrada.equals("√")) {
                operador = "√";
            } else if (!opcion1.isEmpty()) {
                operador = entrada;
            }

            actualizarPantalla(pantalla);
        }

        else if (entrada.equals("=")) {

            if (operador.equals("√")) {

                double numero = Double.parseDouble(opcion1);

                if (numero < 0) {
                    pantalla.setText("¡ERROR!");
                    return;
                }

                opcion1 = String.valueOf(Math.sqrt(numero));

                operador = "";
                opcion2 = "";
                calculoTerminado = true;

                actualizarPantalla(pantalla);
                return;
            }

            if (!opcion1.isEmpty()
                    && !opcion2.isEmpty()
                    && !operador.isEmpty()) {

                opcion1 = calcular(opcion1, opcion2, operador);

                operador = "";
                opcion2 = "";
                calculoTerminado = true;

                actualizarPantalla(pantalla);
            }
        }
    }

    private void actualizarPantalla(Label pantalla) {

        if (operador.isEmpty()) {
            pantalla.setText(opcion1.isEmpty() ? "0" : opcion1);
        } else {
            pantalla.setText(opcion1 + " " + operador + " " + opcion2);
        }
    }

    private String calcular(String numeroUno,
                            String numeroDos,
                            String operador) {

        double datoUno = Double.parseDouble(numeroUno);
        double datoDos = Double.parseDouble(numeroDos);

        switch (operador) {

            case "+":
                return String.valueOf(datoUno + datoDos);

            case "-":
                return String.valueOf(datoUno - datoDos);

            case "*":
                return String.valueOf(datoUno * datoDos);

            case "÷":

                if (datoDos == 0) {
                    return "¡ERROR!";
                }

                return String.valueOf(datoUno / datoDos);

            case "^":
                return String.valueOf(Math.pow(datoUno, datoDos));

            case "%":
                return String.valueOf((datoUno * datoDos) / 100);

            default:
                return "¡ERROR!";
        }
    }
}
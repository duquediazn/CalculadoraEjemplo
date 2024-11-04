/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg6.dpl;

/**
 *
 * @author nazaret
 */
public class Tarea6DPL {

    /**
     * Método principal para probar la clase CalculadoraEjemplo.
     * 
     * @param args argumentos de la línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        // Crear un objeto de CalculadoraEjemplo
        CalculadoraEjemplo calculadora = new CalculadoraEjemplo(10, 5);

        // Prueba de cada uno de los métodos
        System.out.println("Suma: " + calculadora.sumar());
        System.out.println("Resta: " + calculadora.restar());
        System.out.println("Multiplicación: " + calculadora.multiplicar());
        
        try {
            System.out.println("División: " + calculadora.dividir());
        } catch (ArithmeticException e) {
            System.out.println("Error en la división: " + e.getMessage());
        }
    }
    
}

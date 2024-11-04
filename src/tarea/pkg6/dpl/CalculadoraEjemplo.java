package tarea.pkg6.dpl;

/**
 * La clase CalculadoraEjemplo proporciona métodos para realizar operaciones 
 * aritméticas básicas como suma, resta, multiplicación y división.
 * 
 * @author Nazaret Duque Díaz
 * @version 1.0
 * @since 2024-11-04
 * @see <a href="https://docs.oracle.com/en/java/">Java Documentation</a>
 */
public class CalculadoraEjemplo {
    private double operando1;
    private double operando2;
    private double resultado;

    /**
     * Constructor de la clase CalculadoraEjemplo.
     * 
     * @param operando1 el primer operando para las operaciones aritméticas
     * @param operando2 el segundo operando para las operaciones aritméticas
     */
    public CalculadoraEjemplo(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    /**
     * Realiza la suma de operando1 y operando2.
     * 
     * @return el resultado de la suma de los dos operandos
     */
    public double sumar() {
        resultado = operando1 + operando2;
        return resultado;
    }

    /**
     * Realiza la resta de operando1 y operando2.
     * 
     * @return el resultado de la resta de los dos operandos
     */
    public double restar() {
        resultado = operando1 - operando2;
        return resultado;
    }

    /**
     * Realiza la multiplicación de operando1 y operando2.
     * 
     * @return el resultado de la multiplicación de los dos operandos
     */
    public double multiplicar() {
        resultado = operando1 * operando2;
        return resultado;
    }

    /**
     * Realiza la división de operando1 por operando2.
     * 
     * @return el resultado de la división de los dos operandos
     * @throws ArithmeticException si operando2 es 0
     */
    public double dividir() throws ArithmeticException {
        if (operando2 == 0) {
            throw new ArithmeticException("División por cero no permitida.");
        }
        resultado = operando1 / operando2;
        return resultado;
    }
}

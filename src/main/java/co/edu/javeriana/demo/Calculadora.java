package co.edu.javeriana.demo;

/**
 * Clase simple de calculadora para demostrar CI/CD
 * @author JaimesySam
 */
public class Calculadora {

    /**
     * Suma dos números enteros
     * @param a primer número
     * @param b segundo número
     * @return la suma de a y b
     */
    public int sumar(int a, int b) {
        return a + b; //Jaimes es un bobo
    }

    /**
     * Resta dos números enteros
     * @param a primer número (minuendo)
     * @param b segundo número (sustraendo)
     * @return la resta de a - b
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dos números enteros
     * @param a primer número
     * @param b segundo número
     * @return el producto de a y b
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dos números enteros
     * @param a dividendo
     * @param b divisor
     * @return el cociente de a / b
     * @throws IllegalArgumentException si b es cero
     */
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return (double) a / b;
    }

    /**
     * Calcula el módulo de dos números
     * @param a dividendo
     * @param b divisor
     * @return el resto de a % b
     */
    public int modulo(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede calcular módulo con divisor cero");
        }
        return a % b;
    }

    /**
     * Calcular potencia elevado a la n
     * @param base la base
     * @param exponente el exponente
     * @return base elevado a exponente
     */
    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    /**
     * Calcula la raíz cuadrada de un número
     * @param a el número
     * @return la raíz cuadrada de a
     */
    public double raizCuadrada(double a) {
        return Math.sqrt(a);
    }

    /**
     * Calcular el factorial de un número
     * @param n el número
     * @return el factorial de n
     */

    public long factorial(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    /**
     * Calcular el maximo común divisor (MCD) de dos números
     * @param a primer número
     * @param b segundo número
     * @return el MCD de a y b
     */

    public int maximoComunDivisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}


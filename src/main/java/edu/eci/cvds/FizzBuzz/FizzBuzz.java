package edu.eci.cvds.FizzBuzz;

public class FizzBuzz {
    public final static String fizz = "Fizz";
    public final static String buzz = "Buzz";

    public static String fizzBuzz(int numero) {
        // Cumple con posibilidad de fizz y buzz
        String str_numero = Integer.toString(numero);

        if (str_numero.contains("3") && str_numero.contains("5")) {
            return fizz + buzz;
        } else if (numero % 3 == 0 && numero % 5 == 0) {
            return fizz + buzz;
        }

        // Si el numero directamente es multiplo de 3 o de 5

        if (numero % 3 == 0) {
            return fizz;
        } else if (numero % 5 == 0) {
            return buzz;
        }

        // Si el numero contiene 3 o 5

        if (str_numero.contains("3")) {
            return fizz;
        } else if (str_numero.contains("5")) {
            return buzz;
        }

        // No es multiplo de 3 ni 5

        return str_numero;
    }
}

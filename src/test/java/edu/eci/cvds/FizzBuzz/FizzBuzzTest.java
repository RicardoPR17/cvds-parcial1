package edu.eci.cvds.FizzBuzz;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void fizzBuzz_NumeroNoMultiplo3Ni5_RetornarNumero() {
        // Arrange
        int number = 7;
        // Act
        String result = FizzBuzz.fizzBuzz(number);
        // Assert
        assertEquals(Integer.toString(number), result);
    }

    @Test
    public void fizzBuzz_NumeroMultiplo3_RetornaFizz() {
        // Arrange
        int number = 6;
        String expected = FizzBuzz.fizz;
        // Act
        String result = FizzBuzz.fizzBuzz(number);
        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void fizzBuzz_NumeroContiene3NoMultiplo3_RetornarFizz() {
        // Arrange
        int number = 13;
        String expected = FizzBuzz.fizz;
        // Act
        String result = FizzBuzz.fizzBuzz(number);
        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void fizzBuzz_NumeroContiene3Multiplo3_RetornarFizz() {
        // Arrange
        int number = 3;
        String expected = FizzBuzz.fizz;
        // Act
        String result = FizzBuzz.fizzBuzz(number);
        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void fizzBuzz_NumeroMultiplo5_RetornaBuzz() {
        // Arrange
        int number = 10;
        String expected = FizzBuzz.buzz;
        // Act
        String result = FizzBuzz.fizzBuzz(number);
        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void fizzBuzz_NumeroContiene5NoMultiplo5_RetornarBuzz() {
        // Arrange
        int number = 52;
        String expected = FizzBuzz.buzz;
        // Act
        String result = FizzBuzz.fizzBuzz(number);
        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void fizzBuzz_NumeroContiene5Multiplo5_RetornarBuzz() {
        // Arrange
        int number = 25;
        String expected = FizzBuzz.buzz;
        // Act
        String result = FizzBuzz.fizzBuzz(number);
        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void fizzBuzz_NumeroMultiplo3y5_RetornaFizzBuzz() {
        // Arrange
        int number = 30;
        String expected = FizzBuzz.fizz + FizzBuzz.buzz;
        // Act
        String result = FizzBuzz.fizzBuzz(number);
        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void fizzBuzz_NumeroMultiplo3y5NoContiene3y5_RetornaFizzBuzz() {
        // Arrange
        int number = 60;
        String expected = FizzBuzz.fizz + FizzBuzz.buzz;
        // Act
        String result = FizzBuzz.fizzBuzz(number);
        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void fizzBuzz_NumeroContiene3y5NoMultiplo_RetornaFizzBuzz() {
        // Arrange
        int number = 53;
        String expected = FizzBuzz.fizz + FizzBuzz.buzz;
        // Act
        String result = FizzBuzz.fizzBuzz(number);
        // Assert
        assertEquals(expected, result);
    }
}

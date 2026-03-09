package fizzbuzz;

import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void shouldReturn1WhenInputIs1() {
        Main main = new Main();
        assertEquals("1", main.convert(1));
    }

    @Test
    void shouldReturn2WhenInputIs2() {
        Main main = new Main();
        assertEquals("2", main.convert(2));
    }

    @Test
    void shouldReturnFizzWhenInputIs3() {
        Main main = new Main();
        assertEquals("Fizz", main.convert(3));
    }

    @Test
    void shouldReturnBuzzWhenInputIs5() {
        Main main = new Main();
        assertEquals("Buzz", main.convert(5));
    }

    @Test
    void shouldReturnFizzWhenInputIs6() {
        Main main = new Main();
        assertEquals("Fizz", main.convert(6));
    }

    @Test
    void shouldReturnBuzzWhenInputIs10() {
        Main main = new Main();
        assertEquals("Buzz", main.convert(10));
    }
}
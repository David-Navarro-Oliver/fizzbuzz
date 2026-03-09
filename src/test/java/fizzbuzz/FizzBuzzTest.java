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
}
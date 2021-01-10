import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateRegistredAndUnderLimit() {
        BonusService service = new BonusService();

        // Данные
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // Метод
        long actual = service.calculate(amount, registered);

     assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateRegistredAndOverLimit() {
        BonusService service = new BonusService();

        // Данные
        long amount = 26_000_60;
        boolean registered = true;
        long expected = 500;

        // Метод
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateNotRegistredAndOverLimit() {
        BonusService service = new BonusService();

        // Данные
        long amount = 26_000_600;
        boolean registered = false;
        long expected = 500;

        // Метод
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateNotRegistredAndUnderLimit() {
        BonusService service = new BonusService();

        // Данные
        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;

        // Метод
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }


}
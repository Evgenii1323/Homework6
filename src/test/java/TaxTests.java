import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions.*;

public class TaxTests {
    @BeforeAll
    public static void startAllTests() {
        System.out.println("Начало тестирования");
    }

    @AfterAll
    public static void endAllTests() {
        System.out.println("Конец тестирования");
    }

    @Test
    public void taxMinusSpendingsTest() {

        int earnings = 200;
        int spendings = 130;
        int expected = 10;

        int result = Tax.taxEarningsMinusSpendings(earnings, spendings);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void taxEarningsTest() {

        int earnings = 200;
        int expected = 12;

        int result = Tax.taxEarnings(earnings);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void taxChooserTest() {

        int earnings = 200;
        int spendings = 130;
        String expected = "Мы советуем Вам УНС доходы минус расходы";

        String result = Tax.taxChooser(earnings, spendings);

        Assertions.assertEquals(expected, result);


    }
}
import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;

public class TestLocalDate {

    @Test
    public void testCountDaysBetween() {
        LocalDate localDate = LocalDate.parse("2023-04-01");
        LocalDate localDate1 = LocalDate.parse("2023-04-12");

        long a = localDate.datesUntil(localDate1).count();
        Assert.assertEquals(11, a);

    }


}
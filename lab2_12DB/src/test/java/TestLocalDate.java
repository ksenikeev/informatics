import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.time.LocalDate;

public class TestLocalDate {

    private static LocalDate localDate;
    private static LocalDate localDate1;
    private static int[] array;


    @BeforeClass
    public static void setUpBeforeClass() {
        localDate = LocalDate.parse("2023-04-01");
        localDate1 = LocalDate.parse("2023-04-12");
        array = new int[] {1,2,3,4,5};
    }

    @Test
    public void testCountDaysBetween() {
        System.out.println("after");
        long a = localDate.datesUntil(localDate1).count();
        Assert.assertEquals(11, a);

    }


    @Test
    public void testArray() {
        //array = new int[] {1,2,3,4,5};
        int[] testArray = {1,2,3,4,5};

        Assert.assertArrayEquals(array, testArray);

    }

}
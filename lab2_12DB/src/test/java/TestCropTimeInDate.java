import ru.itis.lab2_12.utils.Util;

import java.util.Date;

public class TestCropTimeInDate {

    public static void main(String[] args) {
        Date date = Util.cropTimeInDate(new Date());
        System.out.println(date);
    }

}

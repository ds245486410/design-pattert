package test;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by hellen on 2018/6/2.
 */
public class Hello {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        instance.set(instance.get(Calendar.YEAR),instance.get(Calendar.MONTH),instance.get(Calendar.DAY_OF_MONTH),0,0,0);
        Date time = instance.getTime();
        System.out.println(time);
    }
}

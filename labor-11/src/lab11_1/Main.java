package lab11_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<MyDate> myDates = new ArrayList<>();
        Random rand = new Random();
        while(myDates.size()!=10){
            int year,month, day;
            year = rand.nextInt(2050);
            month = rand.nextInt(13);
            day = rand.nextInt(32);
            if(DateUtil.isValidDate(year, month, day)){
                myDates.add(new MyDate(year,month,day));
            }
        }
        //uj kiiratasok
        myDates.forEach((e)->{
            System.out.println(e);
        });
        Collections.sort(myDates);
        System.out.println();
        myDates.forEach(System.out::println);

    }
}
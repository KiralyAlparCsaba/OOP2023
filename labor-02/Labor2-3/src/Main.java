import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand= new Random();
        MyDate[] dates = new MyDate[100];
        for (int i = 0; i < 100; i++) {
            int day = 28 + rand.nextInt(31);
            int month = 1 + rand.nextInt(12);
            int year = 1 + rand.nextInt(2023);
            dates[i] = new MyDate(year,month,day);
            //System.out.println(dates[i].getYear()+" honap "+dates[i].getMonth()+"nap"+dates[i].getDay()+"\n");

        }
        System.out.println(DateUtil.isValidDate(2000,2, 29) == true);
        System.out.println(DateUtil.isValidDate(2000,2, 30) == false);
        System.out.println(DateUtil.isValidDate(1900,2, 29) == false);
        System.out.println(DateUtil.isValidDate(1900,2, 28) == true);
        System.out.println(DateUtil.isValidDate(-1900,2, 28) == false);
        System.out.println(DateUtil.isValidDate(0,2, 28) == false);
        System.out.println(DateUtil.isValidDate(2021,2, 29) == false);
        System.out.println(DateUtil.isValidDate(2020,2, 29) == true);
        System.out.println(DateUtil.isValidDate(2020,1, 32) == false);
        System.out.println(DateUtil.isValidDate(2020,1, 0) == false);
        System.out.println(DateUtil.isValidDate(2020,0, 0) == false);
        System.out.println(DateUtil.isValidDate(2020,4, 31) == false);
        System.out.println(DateUtil.isValidDate(2020,1, 31) == true);





    }
}
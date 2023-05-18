package lab11_1;

public class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    public MyDate(int pYear, int pMonth, int pDay){

        if(DateUtil.isValidDate(pYear,pMonth,pDay))
        {
            year =pYear;
            month =pMonth;
            day =pDay;
        }
    }

    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }
    public int getDay() {
        return day;
    }

    public String toString(){
        return (year + "." + month + "." + day);
    }

    @Override
    public int compareTo(MyDate that) {
        if(this.year == that.year){
            if(this.month == that.month){
                return this.day - that.day;
            }
            return this.month - that.month;
        }
        return this.year - that.year;
    }
}
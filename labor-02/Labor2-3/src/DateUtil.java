public class DateUtil {


    public static boolean leapYear(int year){
            if(year%4==0)
                return true;
            else
                return false;
    }
    public static boolean isValidDate(int year, int month, int day){
        if(year>0){
            if((month==2 && day>0))
                if(leapYear(year) && day==29)
                    return true;
            if(month==8 && day==31)
                return true;
            if(month%2==0&&day==30){
                return true;
            }
            if(month%2==1&&day==31){
                return true;
            }
            return false;
        }
        return false;
    }
}

package lab11_1;

public class DateUtil {
    public static boolean leapYear(int pYear){

        if(pYear % 400 == 0){
            return true;
        }
        else if(pYear % 100 == 0){
            return false;
        }
        else if(pYear % 4==0){
            return true;
        }
        return false;
    }

    public static boolean isValidDate(int year, int month, int day){
        if(year <= 0 || month <= 0 || day <= 0 || month > 12  || day > 31){
            return false;
        }
        if(month == 2){
            if(leapYear(year)){
                if(day<=29){
                    return true;
                }else{
                    return false;
                }
            }else if(day <=28){
                return true;
            }
            else{
                return false;
            }
        }
        if((month == 4 || month ==6 || month == 9 || month == 11) && day <=30){
            return true;
        }
        else if(!(month == 4 || month ==6 || month == 9 || month == 11) && day <=31){
            return true;
        }
        return false;
    }
}

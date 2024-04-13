public class Main {
    public static void main(String[] args) {
        System.out.println(isWeekend("Monday"));
        String[] days =  {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(weekendCount(days));
        System.out.println(weekdayCount(days));
    }

    public static boolean isWeekend(String dayName) {
        switch (dayName) {
            case "Saturday":
                return true;
            case "Sunday":
                return true;
            default:
                return false;
        }
    }


    public static int weekendCount(String[] days) {
        int count = 0;
        for(String day : days){
            if( isWeekend(day) ){
                count++;
            }
        }
        return count;
    }
    public static int weekdayCount(String[] days) {
    int num = days.length;
    int weekday = weekendCount(days);
    return  num - weekday;
    }
}

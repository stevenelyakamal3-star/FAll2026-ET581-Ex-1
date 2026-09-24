public class ExerciseOne{

    static final int MINUTES_IN_AN_HOUR =60;
    static final int HOURS_IN_A_DAY = 24;
    static final int SECONDS_IN_A_MINUTE = 60;


        public static void converttime(int numberofseconds){
            int secondsinaday = MINUTES_IN_AN_HOUR * HOURS_IN_A_DAY * SECONDS_IN_A_MINUTE;
            int days = numberofseconds / secondsinaday;
            numberofseconds = numberofseconds % secondsinaday;
            int hours = numberofseconds / (MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE);
            numberofseconds = numberofseconds%(MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE);
            int minutes = numberofseconds / SECONDS_IN_A_MINUTE;
            int seconds = numberofseconds % SECONDS_IN_A_MINUTE;
            System.out.println("Days: " + days);
            System.out.println("Hours: " + hours);
            System.out.println("Minutes: " + minutes);
            System.out.println("Seconds: " + seconds);






     }
     public static void main(String[] args){

        converttime(90061);


     }










}
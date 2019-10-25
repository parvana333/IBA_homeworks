package homework3;

import java.util.Scanner;

public class WorkingWithStrings {
    //FUNCTION TO CHECK MEANINGFUL DAY OF WEEK
    public static boolean chechking (String a){
        if(a.equalsIgnoreCase("monday")|| a.equalsIgnoreCase("sunday") ){
            return true;
        }
        return false;
    }
    public static void findDayofweek (String a){
        switch (a.toLowerCase()){ //WE DON'T KNOW HOW IT HAS BEEN WRITTEN.that's why we make it lower or upper
            case "monday":
                System.out.println("Your tasks for Monday: go to courses; watch a film." );
                break;
            case "sunday":
                System.out.println("do home work");
                break;
        }

    }
    public static void main(String[] args) {
        String[][] scedule = new String[7][2];
        scedule[0][0] = "Sunday";
        scedule[0][1] = "do home work";
        scedule[1][0] = "Monday";
        scedule[1][1] = "go to courses; watch a film";
        String dayOfweek;
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < scedule.length; i++) {
            System.out.println("Please, input the day of the week:");
            dayOfweek=scan.next();
            //  for exit
            if(dayOfweek.equals("exit")){
                break;
            }else{
                boolean isitday=chechking(dayOfweek);
                if(isitday==true){
                    findDayofweek(dayOfweek);

                }
                else{
                    System.out.println("Sorry, I don't understand you, please try again");
                    dayOfweek=scan.next();
                    findDayofweek( dayOfweek);
                }
            }
        }

    }
}

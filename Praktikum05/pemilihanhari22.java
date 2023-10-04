package Praktikum05;
import java.util.Scanner;

public class pemilihanhari22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayName, dayaType;

        System.out.println("masukkan nama hari:");
        dayName = sc.nextLine();

        switch(dayName.toLowerCase()){
            case "monday:":
            case "thuesday":
            case "wednesday":
            case "thursday":
            case "friday":
            dayaType = "weekday";
            break;
            case "saturday":
            case "sunday":
            dayaType = "weekend";
            break;
            default:
            dayaType ="invalid day name";
        }
        System.out.println(dayName + " is day" + dayaType);
    }
}

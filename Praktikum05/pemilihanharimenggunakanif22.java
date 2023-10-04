package Praktikum05;

import java.util.Scanner;

public class pemilihanharimenggunakanif22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hari;

       System.out.println("masukkan hari");
       hari = sc.nextDouble();
        if (hari >0 && hari <=5 ) {
            System.out.println("weekday");
        } else if (hari > 5 && hari<= 7) {
            System.out.println("weekend");
        } else{
            System.out.println("invalid day");
        }
    }
}

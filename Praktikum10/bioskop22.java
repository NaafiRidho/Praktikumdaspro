package Praktikum10;

public class bioskop22 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][3];
        penonton[0][0]= "amin";
        penonton[0][1]= "bena";
        penonton[0][2]= "angga";
        penonton[1][0]= "candra";
        penonton[1][1]= "dela";
        penonton[2][0]= "eka";
        penonton[2][1]= "farhan";
        penonton[3][0]= "gisel";
        penonton[3][1]= "hana";

        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);

        System.out.println(penonton.length);
        for(String[] barisPenonton:penonton){
            System.out.println("panjang baris " + barisPenonton.length);
        }

        for(int i =0; i<penonton.length; i++){
            System.out.println("penonton pada baris ke- " + (i+1) + ": " + String.join(", " ,penonton[i]));
        }
    }
}

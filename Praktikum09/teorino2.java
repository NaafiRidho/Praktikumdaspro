import java.util.Scanner;

public class teorino2 {
    public static void main(String[] args) {
        int[]arrayA=new int[9];
        Scanner sc = new Scanner(System.in);
        int angka;

        for(int i= 0; i<arrayA.length; i++){
            System.out.println("Masukkan angka ke-" + (i+1));
            arrayA[i]=sc.nextInt();
    
        }
        for (int i = arrayA.length-1; i>=0; i-- ) {
            angka=arrayA[i];
            System.out.print(angka);
            
        }
    }
}

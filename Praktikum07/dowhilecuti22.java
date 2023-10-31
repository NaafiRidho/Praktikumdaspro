package Praktikum07;
import java.util.Scanner;

public class dowhilecuti22 {
    public static void main(String[] args) {
        int jatahCuti, jumlahHari;
        String konfirmasi;
        Scanner sc = new Scanner(System.in);

        System.out.println("jatah cuti : ");
        jatahCuti = sc.nextInt();

        do{
            System.out.println("Apakah anda ingin mengambil cuti (Y/T)? ");
            konfirmasi= sc.next();

            if(konfirmasi.equalsIgnoreCase("y")){
                System.out.println("jumlah hari : ");
                jumlahHari = sc.nextInt();                

                if(jumlahHari<= jatahCuti){
                    jatahCuti-=jumlahHari;
                    System.out.println("sisa jatah cuti : " + jatahCuti);
                }else {
                    System.out.println("Sisa jatah cuti tidak mencukupi ");
                    continue;
                }
            }else{
                System.out.println("tidak ingin cuti");
                break;
            }
        }while(jatahCuti > 0);
        
    }
}

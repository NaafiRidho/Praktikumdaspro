import java.util.Scanner;

public class linearsearch22 {
    public static void main(String[] args) {
        int jumlahelemen;
        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan jumlah elemen array: ");
        jumlahelemen = sc.nextInt();
        int[] arrayInt = new int[jumlahelemen];

        int hasil = -1;

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("masukkan elemen array ke-" + i);
            arrayInt[i] = sc.nextInt();

        }
        System.out.println("masukkan key yang dicari : ");
        int key = sc.nextInt();
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                System.out.println("key ada dalam array pada index ke-" + hasil);
            }
        }
        if (hasil == -1) {
            System.out.println("hasil tidak ditemukan");
        }

    }
}

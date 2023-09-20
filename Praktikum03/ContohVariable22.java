public class ContohVariable22 {

    public static void main(String[] args){

        String nama = "naafi";
        String hobi = "Bermain petak umpet";
        boolean pandai = true;
        char jenisKelamin = 'L';
        byte umur = 20;
        double ipk = 3.24, tinggi = 1.78;

        System.out.println("Nama:" + nama);
        System.out.println("Hobi:" + hobi);
        System.out.println("apakah pandai?" + pandai);
        System.out.println("jenisKelamin:" + jenisKelamin);
        System.out.println("IPK:" + ipk);
        System.out.println(String.format("saya berumur %s dengan tinggi badan %s", umur, tinggi));
    }
}
import java.util.Scanner;

public class Gaji09 {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        int jmlMasuk, jmlTdkMasuk, TotGaji, gaji, potGaji;
        
        System.out.println("Masukkan gaji anda ");
        gaji=input.nextInt();
        System.out.println("Masukkan potongan gaji anda ");
        potGaji=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda ");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Anda ");
        jmlTdkMasuk=input.nextInt();
        TotGaji=(jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah " +TotGaji);

    }
}

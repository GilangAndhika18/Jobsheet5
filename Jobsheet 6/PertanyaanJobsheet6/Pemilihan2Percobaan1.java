package PertanyaanJobsheet6;

import java.util.Scanner;

public class Pemilihan2Percobaan1 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        System.out.println("Masukkan tahun : ");
        int tahun = input09.nextInt();


        if ((tahun % 400) == 0) {
            System.out.println("Tahun kabisat"); 
        }else if ((tahun % 100) == 0) {
            System.out.println("Bukan tahun kabisat");
        }else if ((tahun % 4) == 0) {
                System.out.println("Tahun kabisat"); 
        } else {
            System.out.println("Bukan tahun kabisat");
        }
    }
}

import java.util.Scanner;

public class PemilihanPercobaan109 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        int angka = input09.nextInt();

        String nomor = (angka  % 2 == 0 ) ? "Genap" : "Ganjil";
        System.out.println(nomor);

    }
}    
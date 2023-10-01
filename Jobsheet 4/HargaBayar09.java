import java.util.Scanner;

public class HargaBayar09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String merkBuku;
        
        int halamanBuku, harga, jumlah;

        double dis, total, bayar, jmlDis;

        System.out.println("Masukan merk buku ");
        merkBuku = input.nextLine();

        System.out.println("Masukan jumlah halaman buku " + merkBuku);

        halamanBuku = input.nextInt();

        System.out.println("Masukan harga barang yg dibeli : ");
        harga = input.nextInt();

        System.out.println("Masukan jumlah barang yang dibeli");
        jumlah = input.nextInt();

        System.out.println("Masukan diskon ");
        dis = input.nextDouble();

        total = harga * jumlah;

        jmlDis = total * dis;

        bayar = total - jmlDis;
        
        System.out.printf("Anda membeli buku %s dengan halaman berjumlah %d", merkBuku, halamanBuku);

        System.out.println("Diskon yg anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yg harus dibayar adalah " + bayar);
    }
    
}

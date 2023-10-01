import java.util.Scanner;

public class TugasIndividu2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();

        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        if (username.equals("gilang") && password.equals("12345678")) {
            System.out.println("Selamat datang, " + username + "!" );
        }
        else {
            System.out.println("Username atau password salah. Silahkan coba lagi. ");
        }

    }
    
}

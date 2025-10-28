import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String username = inputan.nextLine();
        System.out.print("Masukkan password: ");
        String password = inputan.nextLine();

        System.out.println("\n\nData yang dimasukkan:");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        String username = inputan.nextLine();
        String password = inputan.nextLine();

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
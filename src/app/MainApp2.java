package app;

import java.util.Scanner;
import model.Mahasiswa;

public class MainApp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan NPM: ");
        String npm = scanner.nextLine();

        System.out.print("Masukkan Fakultas: ");
        String fakultas = scanner.nextLine();

        Mahasiswa mhs = new Mahasiswa(nama, npm, fakultas);
        System.out.println("\nData Mahasiswa:");
        mhs.tampil();

        scanner.close();
    }
}
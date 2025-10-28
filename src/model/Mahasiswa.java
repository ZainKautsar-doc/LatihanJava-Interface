package model;

public class Mahasiswa {
    private String nama;
    private String npm;
    private String fakultas;

    public Mahasiswa(String nama, String npm, String fakultas) {
        this.nama = nama;
        this.npm = npm;
        this.fakultas = fakultas;
    }

    public void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("NPM: " + npm);
        System.out.println("Fakultas: " + fakultas);
    }
}
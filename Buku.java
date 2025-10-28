interface BukuBagus {
    double RATING = 4.5;

    void cover();
    void judul();
    void penulis();
    void halaman();
    void infobuku();
}

class Buku implements BukuBagus {
    @Override
    public void cover() {
        System.out.println("Cover: Materialisme, Dialektika, dan Logika");
    }

    @Override
    public void judul() {
        System.out.println("Judul: Madilog");
    }

    @Override
    public void penulis() {
        System.out.println("Penulis: Tan Malaka");
    }

    @Override
    public void halaman() {
        System.out.println("Halaman: 200 halaman");
    }

    @Override
    public void infobuku() {
        System.out.println("======= INFORMASI BUKU =======");
        cover();
        judul();
        penulis();
        halaman();
        System.out.println("Info Buku: Buku pertama dalam seri Madilog yang memperkenalkan pemikiran Tan Malaka. Buku ini memiliki rating " + RATING + " dari pembaca.");
    }
}
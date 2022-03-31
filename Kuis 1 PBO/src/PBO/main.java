package PBO;
        
public class main {


    public static void main(String[] args) {

        //Input Buku
        buku Hujan = new buku("Hujan", "Roman", 320, "Tere Liye");
        buku Ayahku_Bukan_Pembohong = new buku ("Ayahku_Bukan_Pembohong", "Drama",304, "Tere Liye");

        //Input Peminjam
        peminjaman Zaki_Taufiqurrachman = new peminjaman("01", "Zaki Taufiqurrachman", Hujan, "31 Maret 2022", "13.14", "6 April 2022", "13.14");
        peminjaman Dymon_Slayer = new peminjaman("02", "Dymon Slayer", Ayahku_Bukan_Pembohong, "02 Maret 2022", "14.23", "09 Maret 2022", "14.23");

        //Menampilkan Peminjam
        Zaki_Taufiqurrachman.tampilPeminjam();
        Dymon_Slayer.tampilPeminjam();
    }
}
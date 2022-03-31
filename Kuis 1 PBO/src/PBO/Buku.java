package PBO;

class buku{
        String judul;
        String genre;
        int halaman;
        String penulis;

        //constructor
        buku(String buku, String genre, int halaman, String penulis){
            this.judul = buku;
            this.genre = genre;
            this.halaman = halaman;
            this.penulis = penulis;
        }
        // Method
        void tampilJudul(){
            System.out.println("Judul buku yang dipinjam: " + judul);
            System.out.println("genre buku: " + genre);
            System.out.println("jumlah halaman: " + halaman);
            System.out.println("Penulis: " + penulis);
        }
    }
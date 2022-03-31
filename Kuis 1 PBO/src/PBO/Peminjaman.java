package PBO;

class peminjaman{
        String id;
        String namaPeminjam;
        buku judulBukuPinjam;
        String tanggalPinjam;
        String waktuPinjam;
        String tanggalKembali;
        String waktuKembali;

        //contructor
        peminjaman(String id, String namaPeminjam, buku judulBukuPinjam, String tanggalPinjam, String waktuPinjam, String tanggalKembali, String waktuKembali){
            this.id = id;
            this.namaPeminjam = namaPeminjam;
            this.judulBukuPinjam = judulBukuPinjam;
            this.tanggalPinjam = tanggalPinjam;
            this.waktuPinjam = waktuPinjam;
            this.tanggalKembali = tanggalKembali;
            this.waktuKembali = waktuKembali;
        }

  //Method
        void tampilPeminjam(){
            System.out.println("\nID Peminjam: " + id);
            System.out.println("Nama Peminjam: " + namaPeminjam + "\n");
            judulBukuPinjam.tampilJudul();
            System.out.println("\nTanggal peminjaman: " + tanggalPinjam);
            System.out.println("Waktu peminjaman: " + waktuPinjam);
            System.out.println("Tanggal pengembalian: " + tanggalKembali);
            System.out.println("Waktu pengembalian: " + waktuKembali);
            System.out.println("========================================");
        }
        
 }

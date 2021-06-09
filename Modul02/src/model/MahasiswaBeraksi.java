package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19630130";
        mahasiswa.nama = "Fauzi";


        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);
        try {
            mahasiswa.tanggalLahir = simpleDateFormat.parse("06-03-2000");
        } catch (ParseException e) {
            System.err.println("================================================");
            System.err.println("============= Format Tanggal Salah =============");
            System.err.println("================================================");
        }

        mahasiswa.tampilkanAtribut();
        System.out.println("Usia saya " + mahasiswa.hitungUsia() + " Tahun");
        System.out.println("-----------------------------------------------");

        Mahasiswa m = new Mahasiswa("19631111","Fauzan", new Date());
        m.tampilkanAtribut();
        System.out.println("-----------------------------------------------");



    }
}

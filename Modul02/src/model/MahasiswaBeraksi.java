package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19630130";
        mahasiswa.nama = "Fauzi";


        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("06-03-2000");
        mahasiswa.tanggalLahir = simpleDateFormat.parse("06-03-2000");

        System.out.println("-----------------------------------------------");

        System.out.println(mahasiswa.nama);
        System.out.println(mahasiswa.getNama());
        System.out.println(simpleDateFormat.format(mahasiswa.tanggalLahir));

        mahasiswa.menyapa();

        System.out.println("-----------------------------------------------");
    }
}

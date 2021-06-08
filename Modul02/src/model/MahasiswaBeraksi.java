package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException {

        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19630130";
        mahasiswa.nama = "Fauzi";
        mahasiswa.tanggalLahir = simpleDateFormat.parse("06-03-2000");

        System.out.println("-----------------------------------------------");
        System.out.println("Nama \t\t\t : " + mahasiswa.nama);
        System.out.println("NPM \t\t\t : " + mahasiswa.npm);
        System.out.println("Tanggal Lahir \t : " + simpleDateFormat.format(mahasiswa.tanggalLahir));
        System.out.println("-----------------------------------------------");

        mahasiswa.tampilkanAtribut();
        mahasiswa.menyapa();
        System.out.println("Usiaku : " + mahasiswa.hitungUsia() + " tahun");

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.npm = "11111111";
        mahasiswa2.nama = "Fauzan";
        mahasiswa2.tanggalLahir = simpleDateFormat.parse("06-03-2000");

        System.out.println("-----------------------------------------------");
        System.out.println("Nama \t\t\t : " + mahasiswa2.nama);
        System.out.println("NPM \t\t\t : " + mahasiswa2.npm);
        System.out.println("Tanggal Lahir \t : " + simpleDateFormat.format(mahasiswa2.tanggalLahir));
        System.out.println("-----------------------------------------------");

        Mahasiswa n = new Mahasiswa("19630130","Fauzi",new Date());
        n.tampilkanAtribut();
    }
}

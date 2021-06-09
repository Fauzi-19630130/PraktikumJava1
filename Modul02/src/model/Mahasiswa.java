package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mahasiswa {
    String npm;
    public String nama;
    Date tanggalLahir;

    void menyapa(){
        System.out.println("Hai, nama saya " + nama);
    }

    String getNama(){
        return nama;
    }

    void tampilkanAtribut(){
        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("06-03-2000");
        try {
            this.tanggalLahir = simpleDateFormat.parse("06-03-2000");
            System.out.println("-----------------------------------------------");

            System.out.println("\t\t ########### " + this.getNama() + " ###########");
            System.out.println("Nama \t\t\t : " + this.nama);
            System.out.println("NPM \t\t\t : " + this.npm);
            System.out.println("Tanggal Lahar \t : " + simpleDateFormat.format(this.tanggalLahir));

            this.menyapa();

            System.out.println("-----------------------------------------------");
        } catch (ParseException e) {
            System.err.println("================================================");
            System.err.println("============= Format Tanggal Salah =============");
            System.err.println("================================================");
        }
    }
}

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
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);
        System.out.println("-----------------------------------------------");
        System.out.println("\t\t ########### " + this.getNama() + " ###########");
        System.out.println("Nama \t\t\t : " + this.nama);
        System.out.println("NPM \t\t\t : " + this.npm);
        System.out.println("Tanggal Lahar \t : " + simpleDateFormat.format(this.tanggalLahir));

        this.menyapa();

        System.out.println("-----------------------------------------------");
    }
    int hitungUsia(){
        Calendar tanggalLahir = Calendar.getInstance();
        tanggalLahir.setTime(this.tanggalLahir);
        Calendar hariIni = Calendar.getInstance();

        int tahunTanggalLahir = tanggalLahir.get(Calendar.YEAR);
        int tahunHariIni = hariIni.get(Calendar.YEAR);
        int selisihTahun = tahunHariIni - tahunTanggalLahir;

        int bulanTanggalLahir = tanggalLahir.get(Calendar.MONTH);
        int bulanHariIni = hariIni.get(Calendar.MONTH);

        if (bulanHariIni < bulanTanggalLahir){
            selisihTahun--;
        }else {
            int tanggalTanggalLahir = tanggalLahir.get(Calendar.DAY_OF_MONTH);
            int tanggalHariIni = hariIni.get(Calendar.DAY_OF_MONTH);
            if (bulanHariIni == bulanTanggalLahir && tanggalHariIni < tanggalTanggalLahir){
                selisihTahun--;
            }
        }
        return selisihTahun;
    }
}

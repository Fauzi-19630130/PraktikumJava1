package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mahasiswa {
    private String npm;
    private String nama;
    private Date tanggalLahir;

    public Mahasiswa() {
        System.out.println("Opjek diciptakan");
    }

    public Mahasiswa(String npm, String nama, Date tanggalLahir) {
        this.npm = npm;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
    }

    void menyapa(){
        System.out.println("Hai, nama saya " + nama);
    }

    String getNama(){
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
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

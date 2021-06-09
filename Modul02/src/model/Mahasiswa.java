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
}

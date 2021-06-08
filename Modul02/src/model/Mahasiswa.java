package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Mahasiswa {
    String npm;
    String nama;
    Date tanggalLahir;

    void menyapa(){
        System.out.println("Hai nama Aku : " + this.nama);
    }
}

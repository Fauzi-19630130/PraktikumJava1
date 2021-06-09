package model;

public class Matakuliah {
    int idMatakuliah;
    String namaMatakuliah;
    String singkatanMataKuliah;
    String namaDosen;
    String kontakDosen;
    boolean aktif;

    public Matakuliah(int idMatakuliah, String namaMatakuliah, String singkatanMataKuliah, String namaDosen, String kontakDosen, boolean aktif) {
        this.idMatakuliah = idMatakuliah;
        this.namaMatakuliah = namaMatakuliah;
        this.singkatanMataKuliah = singkatanMataKuliah;
        this.namaDosen = namaDosen;
        this.kontakDosen = kontakDosen;
        this.aktif = aktif;
    }

    public int getIdMatakuliah() {
        return idMatakuliah;
    }

    public void setIdMatakuliah(int idMatakuliah) {
        this.idMatakuliah = idMatakuliah;
    }

    public String getNamaMatakuliah() {
        return namaMatakuliah;
    }

    public void setNamaMatakuliah(String namaMatakuliah) {
        this.namaMatakuliah = namaMatakuliah;
    }

    public String getSingkatanMataKuliah() {
        return singkatanMataKuliah;
    }

    public void setSingkatanMataKuliah(String singkatanMataKuliah) {
        this.singkatanMataKuliah = singkatanMataKuliah;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public String getKontakDosen() {
        return kontakDosen;
    }

    public void setKontakDosen(String kontakDosen) {
        this.kontakDosen = kontakDosen;
    }

    public boolean isAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }
}

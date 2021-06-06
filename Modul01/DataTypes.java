import javax.swing.JOptionPane;

public class DataTypes {
    public static void main(String [] args){
        String namaDepan ="Fauzi";

        int usia = 21;
        int targetTahunKuliah = 4;
        double ipk = 3.89764512;
        char nilaiAbjad = 'A';
        boolean tampan = true;

        System.out.println("Nama depan : " + namaDepan);
        System.out.println("Usia : " + usia);
        System.out.println("Target kuliah : " + targetTahunKuliah  + "tahun");
        System.out.println("IPK : " + ipk);
        System.out.println("Nilai PBO : " + nilaiAbjad);
        System.out.println("Tampan : " + tampan);

        JOptionPane.showMessageDialog(null,"Hai," +namaDepan);
    }
}
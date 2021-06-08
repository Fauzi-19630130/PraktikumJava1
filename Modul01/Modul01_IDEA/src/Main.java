import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String namaDepan = "Fauzi";
        String npm = "19630130";
        String penghalat = "-----------------------";

        int usia = 21;
        int targetTahunKuliah = 4;
        double ipk = 3.89764512;
        char nilaiAbjad = 'A';
        boolean tampan = true;

        System.out.println(penghalat);
        System.out.println(namaDepan + npm);
        System.out.println(penghalat);

        char[] uniskaChar = {'U','N','I','S','K','A'};
        String uniskaString = new String(uniskaChar);

        String namaLengkap = namaDepan + " " + npm;
        System.out.println(namaLengkap.length());
        System.out.println(penghalat);
        System.out.println(namaLengkap.indexOf("zi"));
        System.out.println(penghalat);
        System.out.println(namaLengkap.substring(3));
        System.out.println(penghalat);
        System.out.println(namaLengkap.substring(3,10));
        System.out.println(penghalat);
        System.out.println(namaLengkap.replace("Fauzi", "Ambar"));
        System.out.println(penghalat);
        System.out.println(namaLengkap.toUpperCase());
        System.out.println(penghalat);
        System.out.println(namaLengkap.toLowerCase());
        System.out.println(penghalat);

        String namaArray[] = namaLengkap.split(" ");

        for (String nama : namaArray){
            System.out.println(nama);
            System.out.println(penghalat);
        }

    }
}

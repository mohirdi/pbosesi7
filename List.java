package sesi7;

import java.util.ArrayList;

public class List {

    public static void main(String[] args) {
 
        ArrayList<String> nama = new ArrayList<>();

        nama.add("Moh");
        nama.add("Irdi");
        nama.add("Alfarizi");

        System.out.println("Isi ArrayList: " + nama);

        nama.remove("Alfarizi");

        boolean nama2 = nama.contains("Irdi");

        System.out.println("Siapa nama anda? " + nama2);

        System.out.println("Isi ArrayList setelah dihapus: " + nama);
    }
}
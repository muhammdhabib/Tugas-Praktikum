package TugasPraktikum.StrukturDataModul2;

import java.util.ArrayList;
import java.util.Collections;

public class Kegiatan1 {
    public static void main(String[] args) {
        ArrayList<String> Hewan = new ArrayList<>();

        // Menambahkan Elemen Hewan sesuai ketentuan
        Hewan.add(0, "Angsa");
        Hewan.add(1, "Bebek");
        Hewan.add(2, "Cicak");
        Hewan.add(3, "Domba");
        Hewan.add(4, "Elang");
        Hewan.add(5, "Gajah");

        // 1. Menambahkan Elemen "Badak" dan "Bebek"
        Hewan.add("Badak");
        Hewan.add("Bebek");
        System.out.println(Hewan);

        // 2. Menghitung jumlah Elemen "Bebek"
        int Hitung = Collections.frequency(Hewan, "Bebek");
        System.out.print("Bebek = " + Hitung);

        // 3. Menampilkan Posisi index dari Elemen "Bebek"
        int index = Hewan.indexOf("Bebek");
        int lastIndex = Hewan.lastIndexOf("Bebek");
        System.out.println(", Index Bebek = " + index + ", " + lastIndex);

        // 4. Menghapus elemen "Bebek" yang pertama
        Hewan.remove(1);
        System.out.println(Hewan);

        // 5. Menampilkan Elemen menggunakan Index
        String Binatang = Hewan.get(0);
        System.out.println("Index ke-0 adalah : " + Binatang);

        // 6. Menghapus Index ke 0 dalam ArrayList
        Hewan.remove(0);
        System.out.println(Hewan);

        // 7. Mengubah Index ke-0 "Cacing" menjadi "Ular"
        System.out.println(Hewan.get(2));

        Hewan.set(2, "Ular");
        System.out.println(Hewan.get(2));
        System.out.println(Hewan);

        // 8. Menghapus Elemen dari Index ke 1 - 5
        Hewan.subList(1, 5);
        System.out.println(Hewan);

        // 9. Menampilkan Elemen Pertama dan Terakhir
        String pertama = Hewan.get(0);
        String Terakhir = Hewan.get(Hewan.size() - 1);
        System.out.println("Elemen Pertama  : " + pertama);
        System.out.println("Elemen Terakhir : " + Terakhir);

        // 10. Menampilkan Jumlah Elemen ArrayList
        int ukuran = Hewan.size();
        System.out.println("Jumlah Hewan: " + ukuran);

        // 11. Mencari Index dari elemen "badak"
        int cariIndex = Hewan.indexOf("Badak");
        System.out.println("Index badak : " + cariIndex);
    }
}
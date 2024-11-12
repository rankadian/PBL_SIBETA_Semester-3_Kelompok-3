package jobsheet10.objecCasting;

import java.util.ArrayList;

public class demoMain {
    public static void main(String[] args) {
        // Pertanyaan 2
        Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402");

        System.out.println(dosen1.nip);
        System.out.println(dosen1.nama);
        System.out.println(dosen1.nidn);
        dosen1.mengajar();

        // Pertanyaan 4 & 5 - Upcasting dosen1 menjadi Pegawai
        Pegawai pegawai1 = dosen1;

        System.out.println(pegawai1.nip);
        System.out.println(pegawai1.nama);

        // Pertanyaan 6 - Runtime error saat mengakses atribut/method spesifik kelas
        // Dosen
        // System.out.println(pegawai1.nidn);
        // pegawai1.mengajar();

        // Pertanyaan 7 - Memanggil displayInfo() setelah upcasting
        System.out.println(pegawai1.nip);
        System.out.println(pegawai1.nama);
        pegawai1.displayInfo();

        // Pertanyaan 10 - Downcasting pegawai1 ke TenagaKependidikan (akan menyebabkan runtime error)
        try {
            TenagaKependidikan test = (TenagaKependidikan) pegawai1;
        } catch (ClassCastException e) {
            System.out.println("Runtime Error: " + e);
        }

        // Pertanyaan 13 - Downcasting pegawai1 kembali ke Dosen
        Dosen newDosen = (Dosen) pegawai1;

        // Pertanyaan 14 - Akses atribut dan metode yang dimiliki oleh Dosen
        System.out.println(newDosen.nama);
        System.out.println(newDosen.nidn);
        newDosen.mengajar();

    }

}

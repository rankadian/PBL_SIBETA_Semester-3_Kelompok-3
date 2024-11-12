import java.util.ArrayList;

public class demoMain {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402");

        Pegawai pegawai1 = dosen1;

        System.out.println(pegawai1.nip);
        System.out.println(pegawai1.nama);
        pegawai1.displayInfo();

        Dosen newDosen = (Dosen) pegawai1;

        System.out.println(newDosen.nama);
        System.out.println(newDosen.nidn);
        newDosen.mengajar();

        // Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402");
        // TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida,
        // A.Md.", "Tenaga Administrasi");

        // train(dosen1);
        // train(tendik1);
    }

    // public static void train(Pegawai pegawai) {
    //     System.out.println("Memberikan pelatihan untuk pegawai");
    //     pegawai.displayInfo();

    //     // test
    //     // System.out.println(pegawai.nidn);
    //     // System.out.println(pegawai.kategori);
    //     // pegawai.mengajar;

    // }
}

import jobsheet10.heterogenous.Pegawai;
import jobsheet10.heterogenous.TenagaKependidikan;

public class Demo {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen();
        TenagaKependidikan tendik1 = new TenagaKependidikan();

        train(dosen1);
        train(tendik1);
    }

    public static void train(Pegawai Pegawai){
        System.out.println("Memberikan pekatihan untuk pegawai");
        pegawai.displayinfo();

        //hanya test
        System.out.println(pegawai.nidn);
        System.out.println(pegawai.kategori);
        pegawai.mengajar;
    }
}

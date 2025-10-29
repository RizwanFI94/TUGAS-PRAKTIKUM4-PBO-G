import hubungan.Dosen;
import hubungan.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        Mahasiswa Anis = new Mahasiswa("100", "Anis");
        Mahasiswa Joko = new Mahasiswa("101", "Joko");
        Mahasiswa Bowo = new Mahasiswa("102", "Bowo");

        Mahasiswa Karno = new Mahasiswa("200", "Soekarno");
        Mahasiswa Harto = new Mahasiswa("201", "Soeharto");
        Mahasiswa Habib = new Mahasiswa("202", "Habibie");

        Mahasiswa[] bimbinganPA1 = {Anis, Joko, Bowo};
        Mahasiswa[] bimbinganPA2 = {Karno, Harto, Habib};

        Dosen Amir = new Dosen("11", "Amir Murtako");
        Dosen Desti = new Dosen("12", "Desti Fitriati");

        Amir.membimbingMahasiswa(bimbinganPA1);
        Desti.membimbingMahasiswa(bimbinganPA2);

        Amir.getInfoDosen();
        Desti.getInfoDosen();

        System.out.println("Daftar bimbingan " + Amir.getNIDN() + ": " + Amir.getNamaDosen() );
        Amir.daftarBimbingannya();
        System.out.println("Daftar bimbingan " + Desti.getNIDN() + ": " + Desti.getNamaDosen() );
        Desti.daftarBimbingannya();
    }
}

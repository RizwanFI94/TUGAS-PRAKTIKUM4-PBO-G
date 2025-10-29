import agregasi.Mahasiswa;
import agregasi.Prodi;

public class App {
    public static void main(String[] args) {
        Mahasiswa rina = new Mahasiswa("123", "Rina");
        Mahasiswa rano = new Mahasiswa("124", "Rano");
        Mahasiswa doel = new Mahasiswa("125", "Doel");
        Mahasiswa jajang = new Mahasiswa("126", "Jajang");

        Prodi TInformatika = new Prodi("45", "Teknik Informatika");
        Prodi TElektro = new Prodi("41", "Teknik Elektro");

        Mahasiswa[] mahasiswaInformatika = {doel, jajang};
        Mahasiswa[] mahasiswaElektro = {rina, rano};

        TInformatika.setMahasiswa(mahasiswaInformatika);
        TElektro.setMahasiswa(mahasiswaElektro);

        TInformatika.displayInformasi();
        TElektro.displayInformasi();
    }
}

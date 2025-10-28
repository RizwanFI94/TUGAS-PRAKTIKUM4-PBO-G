package Agregasi;

public class Prodi {
    private String kodeProdi;
    private String namaProdi;
    private Mahasiswa[] mhs;

    public Prodi(String kodeProdi, String namaProdi) {
        this.kodeProdi = kodeProdi;
        this.namaProdi = namaProdi;
    }

    public void setMahasiswa(Mahasiswa[] mhs) {
        this.mhs = mhs;
    }

    public void displayInformasi() {
        System.out.println("Kode Jurusan" + this.kodeProdi);
        System.out.println("JURUSAN: " + this.namaProdi);
        System.out.println("Daftar Mahasiswa");

        int panjang = this.mhs.length;
        int i = 0;

        while (i < panjang ) {
            System.out.println(mhs[i].getNPM() + ": " + mhs[i].getnamaMahasiswa());
            i++;
        }
    }
}
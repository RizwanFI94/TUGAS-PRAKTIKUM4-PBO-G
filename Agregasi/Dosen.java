package Agregasi;
import Agregasi.Mahasiswa;

public class Dosen {
    private String NIDN;
    private String namaDosen;
    private Mahasiswa [] mhs;

    public Dosen(String NIDN, String namaDosen, int jumlahMhs) {
        this.NIDN = NIDN;
        this.namaDosen = namaDosen;
    }

    public void membimbingMahasiswa(Mahasiswa [] mhs) {
        this.mhs = mhs;
    }

    public void getinfoDosen() {
        System.out.println("NIDN: " + this.NIDN);
        System.out.println("Nama" + this.namaDosen);
    }

    public String getNamaDosen() {
        return this.namaDosen;
    }    

    public String getNIDN() {
        return this.NIDN;
    }

    public void daftarBimbingannya() {
        int panjang = this.mhs.length;
        int i = 0;
        while (i < panjang) {
            this.mhs[i].getinfoMahasiswa();
            i++;
        }
    }
}
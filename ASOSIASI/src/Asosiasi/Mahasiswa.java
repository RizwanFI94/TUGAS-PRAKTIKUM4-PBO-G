package Asosiasi;

public class Mahasiswa {
    private String NPM;
    private String namaMahasiswa;

    public Mahasiswa(String NPM, String namaMahasiswa) {
        this.NPM = NPM;
        this.namaMahasiswa = namaMahasiswa;
    }

    public void getInfoMahasiswa() {
        System.out.println("NPM " + this.NPM);
        System.out.println("Nama " + this.namaMahasiswa);
    }
}
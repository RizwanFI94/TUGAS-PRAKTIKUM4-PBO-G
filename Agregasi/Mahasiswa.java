package Agregasi;

public class Mahasiswa {
    private String NPM  ;
    private String namaMahasiswa;

    public Mahasiswa(String NPM, String namaMahasiswa) {
        this.NPM = NPM;
        this.namaMahasiswa = namaMahasiswa;
    }
    
    public String getNPM() {
        return this.NPM;
    }
    public String getnamaMahasiswa() {
        return this.namaMahasiswa;
    }
    public void getinfoMahasiswa() {
        System.out.println("NPM: " + this.NPM);
        System.out.println("Nama: " + this.namaMahasiswa);
    }
}

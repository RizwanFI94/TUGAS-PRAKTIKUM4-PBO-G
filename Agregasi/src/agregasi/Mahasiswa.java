package agregasi;

public class Mahasiswa {
    private String NPM;
    private String namaMahasiswa;

    public Mahasiswa(String NPM, String namaMahasiswa) {
        this.NPM = NPM;
        this.namaMahasiswa = namaMahasiswa;
    }

    public String getNPM() {
        return this.NPM;
    }

    public String getNamaMahasiswa() {
        return this.namaMahasiswa;
    }
}

import kendaraan.TipeMesin;
import kendaraan.Mesin;
import kendaraan.Mobil;

public class App {
    public static void main(String[] args) {
        Mobil pajero = new Mobil("Pajero", new Mesin(TipeMesin.DIESEL));
        Mobil avanza = new Mobil("Avanza", new Mesin(TipeMesin.BENSIN));

        avanza.getInfo();
        pajero.getInfo();
    }
}

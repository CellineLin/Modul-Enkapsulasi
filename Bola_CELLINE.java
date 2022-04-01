
public class Bola_CELLINE {

    private double jariJari;

    public void setJarijari(double jari) {
        this.jariJari = jari;
    }

    public double showDiameter() {
        return jariJari * 2;
    }

    public double showluasPermukaan() {
        //4 pi r kuadrat
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }

    public double showVolume() {
        return Math.PI * Math.pow(jariJari, 3) * 4 / 3;
    }
    
    public void cetak(){
        System.out.println("Diameter Bola\t : "+showDiameter());
        System.out.println("Luas Permukaan\t : "+showluasPermukaan());
        System.out.println("Volumw bola\t : "+showVolume());
    }
}

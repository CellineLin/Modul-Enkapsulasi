import java.util.Scanner;
public class limasSegitiga {

    public static void main(String[] args) {
        HitungLimasSegitiga limas = new HitungLimasSegitiga();
    }
}
class HitungLimasSegitiga {

    private double tinggiL;
    private double tinggiS;
    private double alasS;
    private double lS1;
    private double lS2;
    private double lS3;

    public Scanner input = new Scanner(System.in);

    public HitungLimasSegitiga() {
        this.showVolumeAndLuas();
    }
    public double getLuasAlas() {
        return (tinggiS * alasS) / 2;
    }
    public double getVolume() {
        return tinggiL * (getLuasAlas()) * 1 / 3;
    }
    public double getLuasPermukaan() {
        return (getLuasAlas()) + lS1 + lS2 + lS3;
    }
    public void showVolumeAndLuas() {
        System.out.print("Masukan Tinggi Limas : \t");
        this.tinggiL = input.nextDouble();

        System.out.print("Masukan Tinggi Segitiga : \t");
        this.tinggiS = input.nextDouble();

        System.out.print("Masukan Alas Segitiga : \t");
        this.alasS = input.nextDouble();

        System.out.print("Masukan Luas Segitiga 1 : \t");
        this.lS1 = input.nextDouble();

        System.out.print("Masukan Luas Segitiga 2 : \t");
        this.lS2 = input.nextDouble();

        System.out.print("Masukan Luas Segitiga 3 : \t");
        this.lS3 = input.nextDouble();

        System.out.println("================");
        System.out.println("LIMAS SEGITIGA");
        System.out.println("================");
        System.out.println("Volume Limas Segitiga :" + getVolume());
        System.out.println("Luas Permukaan Limas Segitiga :" + getLuasPermukaan());
    }
}

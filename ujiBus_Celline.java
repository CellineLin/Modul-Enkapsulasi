
public class ujiBus_Celline {

    public static void main(String[] args) {
        Bus_Celline busMini = new Bus_Celline(13);
        busMini.getPassword(90);
        busMini.getAverage();
        //busMini.getPassword(90);
        busMini.cetak();

        busMini.plusPenumpang(3);
        busMini.cetak();

        busMini.plusPenumpang(1);
        busMini.cetak();

        busMini.plusPenumpang(1);
        busMini.cetak();
    }
}

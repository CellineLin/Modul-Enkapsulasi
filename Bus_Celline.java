
public class Bus_Celline {
    private int penumpang, maxPenumpang, counter, penumpangBaru;
    //konstruktor
    public Bus_Celline(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    //method mutator
    public void plusPenumpang(int penumpang) {
        int temp;
        temp = this.penumpang + penumpang;
        if (temp >= maxPenumpang) {
            System.out.println("Overload Penumpang");
        } else {
            this.penumpang = temp;
        }
    }
    public void getAverage() {
        if (penumpang <= maxPenumpang) {
            System.out.println("Muatan cukup");
        } else {
            System.out.println("Muatan berlebih");
        }
    }
    public void getPassword(int password) {
        if (password == 90) {
            System.out.println("Password benar");
        } else {
            System.out.println("Password salah");
        }
    }
    public void cetak() {
        System.out.println("Penumpang sekarang = " + penumpang);
        System.out.println("Penumpang seharusnya adalah = " + maxPenumpang);
    }
}

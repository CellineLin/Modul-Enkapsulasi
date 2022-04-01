
public class testSiswa_Celline {

    public static void main(String[] args) {

        encapSiswa_Celline siswa = new encapSiswa_Celline();
        siswa.setName("Agus");
        siswa.setAge(20);
        siswa.setAddress("Malang");

        System.out.println("Nama : " + siswa.getName() + " alamat " + siswa.getAddress() + " berumur " + siswa.getAge() + " tahun");
    }
}

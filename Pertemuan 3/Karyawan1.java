public class Karyawan1 {
    protected String nama;
    protected String kodekaryawan;

    public Karyawan1(String nama, String kodekaryawan) {
        this.nama = nama;
        this.kodekaryawan = kodekaryawan;
    }

    public void absenpagi() {
        System.out.println("");
        System.out.println(this.nama + " : Absen Pagi");
    }

    public void Kerja() {
        System.out.println(this.nama + " : Sedang Bekerja");
    }

    public void absenpulang() {
        System.out.println(this.nama + " : Absen Pulang");
    }

    public void getinfo() {
        System.out.println("");
        System.out.println("Kode Karyawan   : " + this.kodekaryawan);
        System.out.println("Nama            : " + this.nama);
    }
}
public class Dosen1 extends Karyawan {
    private String NIDN;

    public Dosen1(String NIDN, String nama, String kodekaryawan) {
        super(nama, kodekaryawan);
        this.NIDN = NIDN;
    }

    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    public void getNIDN() {
        System.out.println("NIDN            : " + this.NIDN);
    }

    public void ngajar() {
        System.out.println(this.nama + " : Sedang Mengajar");
    }
}
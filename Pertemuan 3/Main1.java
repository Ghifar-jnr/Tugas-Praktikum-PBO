public class Main1 {
    public static void main(String[] args) {
        Karyawan1 ridho = new Karyawan1("Ridho", "12345");
        ridho.getinfo();
        ridho.absenpagi();
        ridho.Kerja();
        ridho.absenpulang();

        Karyawan1 melan = new Karyawan1("Melan", "123456");
        melan.getinfo();
        melan.absenpagi();
        melan.Kerja();
        melan.absenpulang();

        System.out.println("-------------------------");

        Dosen1 andiani = new Dosen1("23455", "Andiani", "332211");
        andiani.getinfo();
        andiani.getNIDN();
        andiani.absenpagi();
        andiani.ngajar();
        andiani.absenpulang();

        Dosen1 ionia = new Dosen1("23456", "Ionia", "332212");
        ionia.getinfo();
        andiani.getNIDN();
        ionia.absenpagi();
        ionia.ngajar();
        ionia.absenpulang();
    }        
}

public class Staff extends Karyawan {
    public Staff(String nama){
        super(nama);
    }
    public void kerja(){
        System.out.println(this.nama + " Bantu Dosen");
    }
}

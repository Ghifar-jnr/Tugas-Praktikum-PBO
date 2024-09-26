public class Segitiga extends BangunDatar {
    private int alas;
    private int tinggi;
    public float luas;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public float luas(){
        return this.alas * this.tinggi / 2;
    }
}

package Pertemuan_7;

public class App {
    public static void main(String[] args) throws Exception {
        Luar l = new Luar();
        Luar.Dalam d = l.new Dalam();

        d.bicara();

        Mouter that = new Mouter();
        that.go((int)(Math.random()*100), (int)(Math.random()*100));
    }
}

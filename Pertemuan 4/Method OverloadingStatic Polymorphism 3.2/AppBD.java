public class AppBD {
        public static void main(String[] args) throws Exception {
            BangunDatar bangunDatar = new BangunDatar();
            Persegi persegi = new Persegi(3);
            Segitiga segitiga = new Segitiga(4, 4);
            Lingkaran lingkaran = new Lingkaran(7);
            
            // memanggil method luas dan keliling
            bangunDatar.luas();
            bangunDatar.keliling();
            System.out.print("\n");
            System.out.println("Luas Persegi: " + persegi.luas());
            System.out.println("Keliling Persegi: " + persegi.keliling());
            System.out.print("\n");
            System.out.println("Luas Segitiga: " + segitiga.luas());
            System.out.print("\n");
            System.out.println("Luas Lingkaran: " + lingkaran.luas());
            System.out.println("keliling Lingkaran: " + lingkaran.keliling());
        }
    }


package Pertemuan_7;

public class Mouter {
    private int g = (int) (Math.random() * 100);

    public void go(int x, final int y) {
        int d = x + y;
        final int v = x - y;

        class Minner {
            public void method() {
                System.out.println("g = " + g);
                System.out.println("x = " + x);
                System.out.println("y = " + y);
                System.out.println("d = " + d);
                System.out.println("v = " + v);
                System.out.println("");
            }

        }
        Minner that = new Minner();
        that.method();
    }
}

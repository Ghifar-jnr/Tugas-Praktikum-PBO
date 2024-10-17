package Pertemuan_7;

public class Luar {
    private String outerVariable = "Variable Luar";

    public class Dalam {
        String innerVariable = "Variable Dalam";

        public void bicara() {
            System.out.println("");
            System.out.println(innerVariable);
            System.out.println(outerVariable);
            System.out.println("");
        }
    }

}

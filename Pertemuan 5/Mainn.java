public class Mainn {
    public static void main(String[] args) {
        Spider labalaba = new Spider();
        labalaba.eat();

        System.out.println("\n");

        Dog jek = new Dog();
        jek.setName("Jek");
        jek.getName();
        jek.play();
        jek.eat();
        jek.walk();

        System.out.println("\n");

        Cat garfil = new Cat();
        garfil.setName("Garfil");
        garfil.getName();
        garfil.play();
        garfil.eat();
        garfil.walk();
    }
}

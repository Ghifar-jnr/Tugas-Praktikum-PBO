abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public void walk() {
        System.out.println("Hewan Dengan " + legs + " Kaki Sedang Berjalan");
    }

    abstract void eat();
}
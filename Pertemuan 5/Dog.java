public class Dog extends Animal implements Pet {
    private String name;

    public Dog(){
        super(4);
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("Nama Anjing : " + name);
    }

    @Override
    public void play() {
        System.out.println("Sedang Bermain Lempar Tangkap Piring Plastik");
    }

    @Override
    public void eat() {
        System.out.println("Sedang Makan");
    }
}

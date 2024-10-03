public class Cat extends Animal implements Pet {
    private String name;
    
    public Cat(){
        super(4);
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void getName() {
        System.out.println("Nama Kucing : " + name);
    }
    @Override
    public void play() {
        System.out.println("Sedang Bermain Lempar Tangkap Bola Plastik");
    }

    @Override
    public void eat() {
        System.out.println("Sedang Makan");
    }
}

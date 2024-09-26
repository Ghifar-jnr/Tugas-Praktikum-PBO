public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ghifar", 18, "Bogor");
        person1.displayInfo();

        person1.setName("Div");
        person1.setage(20);
        person1.setaddress("Jakarta");

        System.out.println("Updated Information:");
        person1.displayInfo();
    }

}

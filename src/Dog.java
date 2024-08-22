public class Dog extends Animal{
    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println("bow bow");
    }
}

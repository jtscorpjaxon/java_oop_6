public class Cat extends Animal{
    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println("meow meow");
    }
}

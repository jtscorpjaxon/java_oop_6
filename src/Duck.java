public class Duck extends Animal{
    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println("quack quack");
    }
}

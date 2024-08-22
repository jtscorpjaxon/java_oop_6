//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(12,23);
        System.out.println(rect.area());
        System.out.println(rect.perimeter());

        Triangle uchburchak = new Triangle(12,23,34);
        System.out.println(uchburchak.area());
        System.out.println(uchburchak.perimeter());

        Trapezium trapetsiya=new Trapezium(5,7,7);
        System.out.println(trapetsiya.area());
        System.out.println(trapetsiya.perimeter());

        Cat kisa = new Cat("Kisa");
        System.out.println(kisa.getName());
        kisa.sound();

        Dog olopar=new Dog("Olopar");
        System.out.println(olopar.getName());
        olopar.sound();

        Duck sariq=new Duck("Sariq");
        System.out.println(sariq.getName());
        sariq.sound();
    }
}
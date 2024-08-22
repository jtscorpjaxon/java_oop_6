public class Trapezium extends GeometricFigure{
    double SideA;
    double SideB;
    double high;

    Trapezium(double SideA, double SideB, double high) {
        this.SideA = SideA;
        this.SideB = SideB;
        this.high = high;
    }

    // Trapetsiyaning yuzini hisoblash
    public double area() {
        return (SideA + SideB) / 2 * high;
    }

    // Trapetsiyaning perimetrini hisoblash methodi
    public double perimeter() {
        // Trapetsiyaning ikkita yon tomoni hisobga olinmagan, chunki ular kiritilmagan
        return SideA + SideB + 2 * high; // oddiy holatda bu noto'g'ri, lekin yon tomonlar haqida ma'lumot yo'q
    }
}

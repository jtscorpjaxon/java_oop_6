public class Rectangle extends GeometricFigure{
    double SideA;
    double SideB;
    Rectangle(double SideA, double SideB) {
        this.SideA = SideA;
        this.SideB = SideB;
    }

    // To'g'ri to'rtburchakning yuzini hisoblash
    public double area() {
        return SideA * SideB;
    }

    // To'g'ri to'rtburchakning perimetrini hisoblash
    public double perimeter() {
        return 2 * (SideA + SideB);
    }
}

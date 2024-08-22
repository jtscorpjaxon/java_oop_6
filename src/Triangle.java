public class Triangle extends GeometricFigure{
    double SideA;
    double SideB;
    double SideC;

    public Triangle(double SideA, double SideB, double SideC) {
        this.SideA = SideA;
        this.SideB = SideB;
        this.SideC = SideC;
    }


    public double area() {
        // Gerone formulasi orqali yuzani hisoblash
        double s = (SideA + SideB + SideC) / 2;
        return Math.sqrt(s * (s - SideA) * (s - SideB) * (s - SideC));
    }


    public double perimeter() {
        // Uchburchak perimetri
        return SideA + SideB + SideC;
    }
}

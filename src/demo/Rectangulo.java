package demo;

public class Rectangulo extends FiguraGeometrica
{

    private double base;
    private double altura;

    public Rectangulo(double base, double altura)
    {
        this.altura = altura;
        this.base = base;
    }


    @Override
    public double area() {
        return base * altura;
    }
}

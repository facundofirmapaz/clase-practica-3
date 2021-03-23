package demo;

public class Triangulo extends FiguraGeometrica
{

    private double base;
    private double altura;

    public Triangulo(double base, double altura)
    {
        this.altura = altura;
        this.base = base;
    }


    @Override
    public double area() {
        return base * altura * 0.5;
    }
}

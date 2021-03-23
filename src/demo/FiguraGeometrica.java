package demo;

import java.util.ArrayList;

public abstract class FiguraGeometrica
{
    public abstract double area();

    public static double areaPromedio(ArrayList<FiguraGeometrica> figuras)
    {

        double summ = 0;
        for (FiguraGeometrica fig : figuras)
        {
            summ += fig.area();
        }

        return summ / figuras.size();
    }
}

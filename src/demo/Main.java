package demo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
//        PasswordFuerte pf = new PasswordFuerte();
//        PasswordIntermedia pi = new PasswordIntermedia();
//        PasswordSimple ps = new PasswordSimple();
//
//        pf.setValue("1hola");
//        pi.setValue("123123Chau");
//        ps.setValue("1234");
//
//        System.out.println(pf.getPassword());
//        System.out.println(pi.getPassword());
//        System.out.println(ps.getPassword());


        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();

        figuras.add(new Circulo(4));
        figuras.add(new Circulo(4));
        figuras.add(new Triangulo(4, 5));
        figuras.add(new Rectangulo(4, 4));

        System.out.println(FiguraGeometrica.areaPromedio(figuras));

    }
}

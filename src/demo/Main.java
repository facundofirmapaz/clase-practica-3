package demo;

import javax.swing.text.Utilities;
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


//        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
//
//        figuras.add(new Circulo(4));
//        figuras.add(new Circulo(4));
//        figuras.add(new Triangulo(4, 5));
//        figuras.add(new Rectangulo(4, 4));
//
//        System.out.println(FiguraGeometrica.areaPromedio(figuras));


        Persona p1 = new Persona("Pepe", 33000000);
        Persona p2 = new Persona("Pepito", 32000000);
        Persona p3 = new Persona("Pepa", 34000000);

        System.out.println(p1.precedeA(p3));

        Persona arr [] = new Persona[3];

        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        SortUtil.ordenar(arr);

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i].getDni());
        }

        Celular otroArr [] = new Celular[3];

        otroArr[0] = new Celular(30000, "Movistar");
        otroArr[1] = new Celular(20000, "Claro");
        otroArr[2] = new Celular(50000, "Personal");

        SortUtil.ordenar(otroArr);

        for (int i = 0; i < otroArr.length; i++)
        {
            System.out.println(otroArr[i].getNumero());
        }


    }
}

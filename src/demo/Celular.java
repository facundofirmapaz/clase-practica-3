package demo;

public class Celular implements Precedable<Celular>
{

    private int numero;
    private String compania;


    public Celular(int numero, String compania)
    {
        this.numero = numero;
        this.compania = compania;
    }

    public int getNumero()
    {
        return numero;
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    public String getCompania()
    {
        return compania;
    }

    public void setCompania(String compania)
    {
        this.compania = compania;
    }

    @Override
    public int precedeA(Celular celular)
    {
        return Integer.compare(this.getNumero(), celular.getNumero());
    }
}

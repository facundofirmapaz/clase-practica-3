package demo;

public class PasswordIntermedia extends AbstractPassword
{
    public PasswordIntermedia()
    {
        String patron = "^[a-zA-Z]\\w{3,14}$";
        setPatron(patron);
    }
}

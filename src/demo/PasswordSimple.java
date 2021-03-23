package demo;

public class PasswordSimple extends AbstractPassword
{
    public PasswordSimple()
    {
        String patron = "^[a-zA-Z]\\w{3,14}$";
        setPatron(patron);
    }
}

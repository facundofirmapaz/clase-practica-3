package demo;

public class PasswordFuerte extends AbstractPassword
{

    public PasswordFuerte() {
        String patron = "^[a-zA-Z]\\w{3,14}$";
        setPatron(patron);
    }
}

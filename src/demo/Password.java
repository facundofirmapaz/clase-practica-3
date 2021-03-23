package demo;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Password
{
    private String password;

    private Pattern patron;

    public Password(String patron)
    {
        this.patron = Pattern.compile(patron);
    }

    public void setValue(String pwd)
    {
        if (patron.matcher(pwd).find())
            password = pwd;
        else
            throw new PatternSyntaxException("Formato de password Invalido", pwd, -1);
    }

    public String getPassword() { return password; }
}

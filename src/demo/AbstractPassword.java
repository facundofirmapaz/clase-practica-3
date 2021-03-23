package demo;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public abstract class AbstractPassword
{

    private String password;

    private Pattern patron;

    public void setValue(String pwd)
    {
        if (patron.matcher(pwd).find())
            password = pwd;
        else
            throw new PatternSyntaxException("Formato de password Invalido", pwd, -1);
    }

    public String getPassword() { return password; }

    public void setPatron(String pattern)
    {
        this.patron = Pattern.compile(pattern);
    }

}

package ch.heigvd.amt.project1.business;
import ch.heigvd.amt.project1.model.Authentification;
public class LoginChecker{
    public String login(String login,String password){
        Authentification auth = new Authentification();
        if(auth.isSame(login,password))
            return "You are connected";
        else
            return "retry";
    }
}
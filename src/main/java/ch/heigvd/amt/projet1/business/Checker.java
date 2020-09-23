package ch.heigvd.amt.project1.business;
import ch.heigvd.amt.project1.model.Authentification;
public class Checker{
    public String login(String login,String password){
        Authentification auth = new Authentification();
        if(auth.isSame(login,password))
            return "You are connected";
        else
            return "retry";
    }
    public String register(String login,String password){
        Authentification auth = new Authentification();
        if(auth.isExist(login))
            return "this login is already used";
        else
            auth.setAuth(login,password);
            return "your account has been created";
    }
}
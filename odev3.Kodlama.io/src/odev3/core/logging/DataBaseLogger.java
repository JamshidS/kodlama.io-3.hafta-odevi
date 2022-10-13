package odev3.core.logging;

public class DataBaseLogger implements MainLogger{
    @Override
    public void log(String data) {
        System.out.println("Logged in DataBase: "+data);
    }
}

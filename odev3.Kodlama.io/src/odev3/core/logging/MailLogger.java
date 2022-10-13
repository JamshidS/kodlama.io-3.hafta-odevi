package odev3.core.logging;

public class MailLogger implements MainLogger{
    @Override
    public void log(String data) {
        System.out.println("Logged in mail: "+data);
    }
}

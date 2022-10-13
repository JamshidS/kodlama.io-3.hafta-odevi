package odev3.core.logging;

public class FileLogger implements MainLogger{
    @Override
    public void log(String data) {
        System.out.println("Logged in Files: "+ data);
    }
}

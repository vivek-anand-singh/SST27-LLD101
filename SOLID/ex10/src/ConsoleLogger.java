public class ConsoleLogger extends Logger {
    public void log(String msg){ 
        System.out.println("[LOG] " + msg); 
    }
}
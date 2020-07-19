package streams;

class BaseLogger {
    private static BaseLogger log = new BaseLogger();
    private BaseLogger() {}
    public synchronized static BaseLogger getInstance() {
        return log;
    }
    private StringBuilder logMessage = new StringBuilder();
    public void addLog(String logMessage) {
        this.logMessage.append(logMessage + "|");
        //Logic to write log into file.
    }
    public void printLog() {
        System.out.println(logMessage.toString());//To print log.
    }

    public static void main(String[] args) {
        int[] abc = new int[10];
        System.out.println(abc[10]);
        System.out.println(abc.length);
    }
}
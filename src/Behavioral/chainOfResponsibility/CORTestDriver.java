package Behavioral.chainOfResponsibility;

public class CORTestDriver {
    /*
    Intent:

    Chain of Responsibility is a behavioral design pattern that lets you pass requests
    along a chain of handlers. Upon receiving a request, each handler decides either to process the request or
    to pass it to the next handler in the chain.
     */

    public void run() {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        System.out.println("");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");

        System.out.println("");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }

    private AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
}

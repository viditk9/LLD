package src.designPatterns.ChainOfResponsibilityPattern;

public class LoggingHandler extends Handler{
    LoggingHandler(Handler nextHandler) {
        super(nextHandler);
    }

    public void handleRequest(String req) {
        System.out.println("Loggin done for req : "+ req);
        super.handleRequest(req);
    }
}

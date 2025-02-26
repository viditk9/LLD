package src.designPatterns.ChainOfResponsibilityPattern;

public class AuthenticationHandler extends Handler{
    AuthenticationHandler(Handler nextHandler) {
        super(nextHandler);
    }

    public void handleRequest(String req) {
        System.out.println("Authentication successful for req : " + req);
        super.handleRequest(req);
    }
}

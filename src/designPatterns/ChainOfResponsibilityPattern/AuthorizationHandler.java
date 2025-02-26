package src.designPatterns.ChainOfResponsibilityPattern;

public class AuthorizationHandler extends Handler{
    AuthorizationHandler(Handler nextHandler) {
        super(nextHandler);
    }

    public void handleRequest(String req) {
        System.out.println("Authorization successful for req : " + req);
        super.handleRequest(req);
    }
}

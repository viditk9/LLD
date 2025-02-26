package src.designPatterns.ChainOfResponsibilityPattern;

public abstract class Handler {
    Handler nextHandler;
    Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(String req) {
        if( nextHandler != null) {
            nextHandler.handleRequest(req);
        }
    }
}

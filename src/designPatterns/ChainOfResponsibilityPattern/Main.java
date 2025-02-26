package src.designPatterns.ChainOfResponsibilityPattern;

public class Main {
    public static void main(String[] args) {
        // Create handlers
        Handler auth = new AuthenticationHandler(new AuthorizationHandler(new LoggingHandler(null)));
        // Send a request
        auth.handleRequest("User login request");
    }
}

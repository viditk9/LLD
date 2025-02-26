package src.LLDQuestions.CarRentalSystem.payment;

public class CreditCardPaymentProcessor implements PaymentProcessor{
    @Override
    public boolean processPayment(double amount) {
        // process payment
        return true;
    }
}

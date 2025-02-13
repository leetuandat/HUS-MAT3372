package lab10.Strategy.ex01;

public interface PayStrategy {
    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
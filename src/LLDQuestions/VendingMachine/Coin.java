package src.LLDQuestions.VendingMachine;

public enum Coin {
    PENNY(1),
    NICKEL(5),
    DIME(10),
    QUARTER(25);
    public int value;
    Coin(int val) {
        this.value = val;
    }
}

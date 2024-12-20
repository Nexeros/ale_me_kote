public record BankAccount(String accountNumber, double balance) {
    public BankAccount(String accountNumber) {
        this(accountNumber, 0.0);
        if(accountNumber == null || accountNumber.isBlank()) throw new IllegalArgumentException("Invalid account number");
    }

}

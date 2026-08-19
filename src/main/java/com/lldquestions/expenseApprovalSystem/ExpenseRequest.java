package main.java.com.lldquestions.expenseApprovalSystem;

public class ExpenseRequest {
    private final double amount;
    public ExpenseRequest(double amount){
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

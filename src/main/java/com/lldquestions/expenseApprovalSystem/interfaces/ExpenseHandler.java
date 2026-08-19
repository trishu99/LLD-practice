package main.java.com.lldquestions.expenseApprovalSystem.interfaces;

import main.java.com.lldquestions.expenseApprovalSystem.ExpenseRequest;

public interface ExpenseHandler {
    void setNext(ExpenseHandler handler);
    void handle(ExpenseRequest request);
}

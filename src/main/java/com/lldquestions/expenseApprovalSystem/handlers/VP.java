package main.java.com.lldquestions.expenseApprovalSystem.handlers;

import main.java.com.lldquestions.expenseApprovalSystem.ExpenseRequest;
import main.java.com.lldquestions.expenseApprovalSystem.interfaces.ExpenseHandler;

public class VP implements ExpenseHandler {
    private ExpenseHandler next;

    @Override
    public void setNext(ExpenseHandler handler){
        this.next = handler;
    }

    @Override
    public void handle(ExpenseRequest request){
        if(request.getAmount() >= 10000 && request.getAmount() <= 50000){
            System.out.println("VP approved request");
        }
        else
            System.out.println("This request can't be approved");
    }
}

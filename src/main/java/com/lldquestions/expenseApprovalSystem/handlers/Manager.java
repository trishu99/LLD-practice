package main.java.com.lldquestions.expenseApprovalSystem.handlers;

import main.java.com.lldquestions.expenseApprovalSystem.ExpenseRequest;
import main.java.com.lldquestions.expenseApprovalSystem.interfaces.ExpenseHandler;

public class Manager implements ExpenseHandler {
    private ExpenseHandler next;

    @Override
    public void setNext(ExpenseHandler handler){
        this.next = handler;
    }

    @Override
    public void handle(ExpenseRequest request){
        if(request.getAmount() <= 1000){
            System.out.println("Manager approved request");
        }
        else
            next.handle(request);
    }
}

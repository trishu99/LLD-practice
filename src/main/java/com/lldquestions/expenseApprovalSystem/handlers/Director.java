package main.java.com.lldquestions.expenseApprovalSystem.handlers;

import main.java.com.lldquestions.expenseApprovalSystem.ExpenseRequest;
import main.java.com.lldquestions.expenseApprovalSystem.interfaces.ExpenseHandler;

public class Director implements ExpenseHandler {
    private ExpenseHandler next;

    public void setNext(ExpenseHandler handler){
        this.next = handler;
    }

    public void handle(ExpenseRequest request){
        if(request.getAmount() <= 10000){
            System.out.println("Director approved request");
        }
        else
            next.handle(request);
    }
}

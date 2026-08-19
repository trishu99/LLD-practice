package main.java.com.lldquestions.expenseApprovalSystem.handlers;

import main.java.com.lldquestions.expenseApprovalSystem.ExpenseRequest;
import main.java.com.lldquestions.expenseApprovalSystem.interfaces.ExpenseHandler;

public class SeniorManager implements ExpenseHandler {
    private ExpenseHandler next;

    @Override
    public void setNext(ExpenseHandler handler){
        this.next = handler;
    }

    @Override
    public void handle(ExpenseRequest request){
        if(request.getAmount() <= 5000){
            System.out.println("SeniorManager approved request");
        }
        else
            next.handle(request);
    }
}

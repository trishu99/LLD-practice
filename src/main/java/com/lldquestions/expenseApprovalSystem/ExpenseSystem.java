package main.java.com.lldquestions.expenseApprovalSystem;

import main.java.com.lldquestions.expenseApprovalSystem.handlers.Director;
import main.java.com.lldquestions.expenseApprovalSystem.handlers.Manager;
import main.java.com.lldquestions.expenseApprovalSystem.handlers.SeniorManager;
import main.java.com.lldquestions.expenseApprovalSystem.handlers.VP;
import main.java.com.lldquestions.expenseApprovalSystem.interfaces.ExpenseHandler;

public class ExpenseSystem {
    ExpenseHandler manager;
    // creating the chain
    public ExpenseSystem() {
        manager = new Manager();
        ExpenseHandler seniorManager = new SeniorManager();
        ExpenseHandler director = new Director();
        ExpenseHandler vp = new VP();

        manager.setNext(seniorManager);
        seniorManager.setNext(director);
        director.setNext(vp);
    }

    public void addExpense(int amount){
        ExpenseRequest request = new ExpenseRequest(amount);
        manager.handle(request);
    }
}

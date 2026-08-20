import main.java.com.SOLID.LSP.models.VehicleService;
import main.java.com.behavioralpatterns.observer.StoreService;
import main.java.com.behavioralpatterns.strategy.VehicleStrategyService;
import main.java.com.lldquestions.expenseApprovalSystem.ExpenseSystem;
import main.java.com.lldquestions.loggerDesign.LoggerSystem;
import main.java.com.lldquestions.snakeNladder.Game;
import main.java.com.lldquestions.tictactoe.TicTacToeGame;
import main.java.com.structuralpatterns.abstractfactory.vehicle.VehicleFactory;
import main.java.com.structuralpatterns.abstractfactory.vehicle.VehicleFactoryFactory;
import main.java.com.structuralpatterns.abstractfactory.vehicle.interfaces.Vehicle;
import main.java.com.structuralpatterns.decorator.pizza.PizzaService;
import main.java.com.structuralpatterns.factory.shapesExample.ShapeFactory;
import main.java.com.structuralpatterns.factory.shapesExample.interfaces.Shape;

public class Main {
    public static void main(String[] args) {

//        VehicleService service = new VehicleService();
//        service.run();
//
//        VehicleStrategyService service1 = new VehicleStrategyService();
//        service1.run();
//
//        StoreService s1 = new StoreService();
//        s1.run();
//
//
//        PizzaService pizzaService = new PizzaService();
//        pizzaService.run();
//
//        ShapeFactory factory = new ShapeFactory();
//        Shape c = factory.getShape("Circle");
//        c.draw();
//
//        Shape r = factory.getShape("Rectangle");
//        r.draw();
//
//        Shape s = factory.getShape("Square");
//        s.draw();
//
//
//        // abstract factory
//
//        VehicleFactoryFactory vehicleFactoryFactory = new VehicleFactoryFactory();
//
//        VehicleFactory luxaryVehicleFactory = vehicleFactoryFactory.getVechicleFactory("LuxaryVehicles");
//        Vehicle v1 = luxaryVehicleFactory.getVehicle("LuxaryV1");
//        v1.run();
//
//        VehicleFactory ordinaryVehicleFactory = vehicleFactoryFactory.getVechicleFactory("OrdinaryVehicles");
//        Vehicle v2 = ordinaryVehicleFactory.getVehicle("OrdinaryV2");
//        v2.run();
//
//
//        LoggerSystem loggerSystem = new LoggerSystem();
//        loggerSystem.run();
//
//
//        TicTacToeGame game = new TicTacToeGame(2, 3);
//        String result = game.startGame();
//        System.out.println("Game Winner is: " + result);


//        ExpenseSystem expenseSystem = new ExpenseSystem();
//        expenseSystem.addExpense(80000);

        Game snakeLadder = new Game(10, 2, 1, 4,5);
        snakeLadder.startGame();
        System.out.println("Winner of the game is: " + snakeLadder.getWinner().name);
    }
}
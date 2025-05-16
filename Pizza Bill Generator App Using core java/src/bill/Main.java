package bill;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------Welcome To PizzaMania-------------------------------------------------\n");
        System.out.println("Which Pizza You Would Like To Have: (1.Veg Pizza 2.Non-Veg Pizza 3.Deluxe Veg Pizza 4.Deluxe Non-Veg Pizza) ===>");
        Scanner sc= new Scanner(System.in);
        int ch=sc.nextInt();

        switch (ch){
            case 1:
                pizza vegPizza = new pizza(true);
                vegPizza.addExtraToppings();
                vegPizza.addExtraCheese();
                vegPizza.takeAway();
                vegPizza.getBill();
                break;
            case 2:
                pizza nonVegPizza = new pizza(false);
                nonVegPizza.addExtraToppings();
                nonVegPizza.addExtraCheese();
                nonVegPizza.takeAway();
                nonVegPizza.getBill();
                break;
            case 3:
                DeluxPizza veg = new DeluxPizza(true);
                veg.basePizzaPrice=550;
                veg.addExtraToppings();
                veg.addExtraCheese();
                veg.takeAway();
                veg.getBill();
                break;
            case 4:
                DeluxPizza nonVeg=new DeluxPizza(false);
                nonVeg.basePizzaPrice=650;
                nonVeg.addExtraToppings();
                nonVeg.addExtraCheese();
                nonVeg.takeAway();
                nonVeg.getBill();
                break;
        }
    }
}
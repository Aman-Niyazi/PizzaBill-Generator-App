package bill;
public class DeluxPizza extends pizza{
    public DeluxPizza(boolean veg){
        super(veg);
    }
    @Override
    public void addExtraCheese(){
        this.price += extraCheesePrice;
    }
    @Override
    public void addExtraToppings(){
        this.price += extraToppingsPrice;
    }

}

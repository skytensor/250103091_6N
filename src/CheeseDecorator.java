public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza wrapper) {
        super(wrapper);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 3;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " & Cheese";
    }
}

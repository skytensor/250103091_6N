public class PineappleDecorator extends PizzaDecorator {

    public PineappleDecorator(Pizza wrapper) {
        super(wrapper);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " & Pineapple";
    }
}

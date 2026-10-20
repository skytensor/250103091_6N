public class OliveDecorator extends PizzaDecorator {

    public OliveDecorator(Pizza wrapper) {
        super(wrapper);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " & Olives";
    }
}

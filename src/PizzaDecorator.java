public abstract class PizzaDecorator implements Pizza {
    private final Pizza wrapper;

    public PizzaDecorator(Pizza wrapper) {
        if (wrapper == null) {
            throw new IllegalArgumentException();
        }

        this.wrapper = wrapper;
    }


    @Override
    public double getPrice() {
        return this.wrapper.getPrice();
    }

    @Override
    public String getDescription() {
        return this.wrapper.getDescription();
    }
}

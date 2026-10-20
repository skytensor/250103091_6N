public class PlainPizza implements Pizza {
    private final int price;
    private final String description;

    public PlainPizza(int price, String description) {
        if (price < 0) {
            throw new IllegalArgumentException();
        }

        this.price = price;
        this.description = description;
    }


    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}

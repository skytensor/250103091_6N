public class Main {
    public static void main(String[] args) {
        PlainPizza plainPizza = new PlainPizza(5, "Plain Dough & Sauce");
        CheeseDecorator pizza = new CheeseDecorator(plainPizza);
        OliveDecorator olive = new OliveDecorator(pizza);
        PineappleDecorator pineapple = new PineappleDecorator(olive);

        System.out.println(pineapple.getDescription() + " $" + pineapple.getPrice());
    }
}

package vendingmachine.Domain;

public class Product {
    private String name;
    private int cost;
    private int count;

    public Product(String name, int cost, int count) {
        this.name = name;
        this.cost = cost;
        this.count = count;
    }

    public boolean isSameName(String name) {
        return this.name.equals(name);
    }

}
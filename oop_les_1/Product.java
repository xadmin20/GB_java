public class Product {
    private String name;
    private int cost;
    private int quantity;
    private String measure;

    protected Product(String name, int cost, int quantity, String measure){
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        this.measure = measure;
    }

    public String getName() {
        return this.name;
    }

    public int getCost() {
        return this.cost;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String getMeasure() {
        return this.measure;
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Количество: %d; Еденица измерения: %s;", this.name,
        this.cost, this.quantity, this.measure);
    }


}

public class Eggs extends Eat {
    private int packages;
    protected Eggs(String name, int cost, int quantity, String measure, String date, int packages) {
        super(name, cost, quantity, measure, date);
        this.packages = packages;
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Количество: %d; Еденица измерения: %s; Срок годности: %s; Количество в уп.: %d;", super.getName(),
        super.getCost(), super.getQuantity(), super.getMeasure(), super.getDate(), this.packages);
    }
    
}

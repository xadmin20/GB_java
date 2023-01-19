public class Masks extends ForBath {

    protected Masks(String name, int cost, int quantity, String measure, int size) {
        super(name, cost, quantity, measure, size);
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Количество: %d; Еденица измерения: %s; Количество в уп.: %d", 
        super.getName(), super.getCost(), super.getQuantity(), super.getMeasure(), super.getSize());
    }
    
}

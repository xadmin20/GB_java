public class Diapers extends ForChildren {
    private int size;
    private int minWeight;
    private int maxWeight;
    private String type;
    protected Diapers(String name, int cost, int quantity, String measure, int minAge, String hypoallergenic,
    int size, int minWeight, int maxWeight, String type) {
        super(name, cost, quantity, measure, minAge, hypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Количество: %d; Еденица измерения: %s; Минимальный возраст: %d; Гипоаллергенность: %s; Размер: %d; Мин. вес: %d; Макс. вес: %d; Тип: %s", 
        super.getName(), super.getCost(), super.getQuantity(), super.getMeasure(), super.getMinAge(), super.getHypoallergenic(), 
        this.size, this.minWeight, this.maxWeight, this.type);
    }
    
}

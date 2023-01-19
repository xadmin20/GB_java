public class Nipple extends ForChildren {

    protected Nipple(String name, int cost, int quantity, String measure, int minAge, String hypoallergenic) {
        super(name, cost, quantity, measure, minAge, hypoallergenic);
    }
    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Количество: %d; Еденица измерения: %s; Мин. возраст: %d; Гипоаллергенность: %s;", 
        super.getName(), super.getCost(), super.getQuantity(), super.getMeasure(), super.getMinAge(), getHypoallergenic());
    }
    
}

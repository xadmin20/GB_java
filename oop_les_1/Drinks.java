public class Drinks extends Product {
    private int volume;
    
    protected Drinks(String name, int cost, int quantity, String measure, int volume) {
        super(name, cost, quantity, measure);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;        
    }
    
}

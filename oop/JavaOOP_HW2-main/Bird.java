public abstract class Bird extends Animal{
    protected int hightFly;

    public int getHightFly() {
        return this.hightFly;
    }

    protected Bird(int height, int weight, String colorEye, int hightFly) {
        super(height, weight, colorEye);
        this.hightFly = hightFly;
    }
    
    public abstract void toFly();
}

public class Cat extends HomeAnimal {
    private final String wool;
    
    protected Cat(String name, String breed, String vaccination, String color, String dateBirthday, int height,
            int weight, String colorEye, String wool) {
        super(name, breed, vaccination, color, dateBirthday, height, weight, colorEye);
        this.wool = wool;

    }

    @Override
    public void caressing() {
        System.out.println("Кошка хочет ласки!");
        
    }

    @Override
    public void animalSay() {
        System.out.println("Кошка сказала - мяу");
        
    }

    @Override
    public String toString() {
        return String.format(
            "Кот; %s; Наличие шерсти: %s;", 
            super.toString(), this.wool);
    }
    
}

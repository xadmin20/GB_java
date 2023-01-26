public class Wolf extends WildAmimal{
    
    private final String leader;
    
    protected Wolf(int height, int weight, String colorEye, String place, String date, String leader) {
        super(height, weight, colorEye, place, date);
        this.leader = leader;

    }

    @Override
    public void animalSay() {
        System.out.println("Волк сказал - УУУуууу");        
    }

    @Override
    public String toString() {
        return String.format("Волк; %s; Вожак стаи: %s", super.toString(), this.leader);
       }
    
}

public abstract class HomeAnimal extends Animal implements Home {
    private String name;
    private String breed;
    private String vaccination;
    private String color;
    private String dateBirthday;


    protected HomeAnimal(String name, String breed, String vaccination, String color, String dateBirthday, int height, int weight, String colorEye) {
        super(height, weight, colorEye);
        this.name = name;
        this.breed = breed;
        this.vaccination = vaccination;
        this.color = color;
        this.dateBirthday = dateBirthday;
    }


    @Override
    public String toString() {
        return String.format(
            "Имя: %s; Порода: %s; Наличие прививок: %s; Цвет шерсти: %s; Дата рождения: %s; %s;", 
            this.name, this.breed, this.vaccination, this.color, this.dateBirthday, super.toString());
    }

    @Override
    public abstract void caressing();

    @Override
    public abstract void animalSay();

}

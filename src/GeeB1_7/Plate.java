package GeeB1_7;

public class Plate {
    private int food;
    public Plate(int food){
        this.food = food;
    }

    public void info(){
        System.out.println("Plate: " + food);
    }

    public void decreaseFood(Cat cat, int n){
        if (cat.satiety)
            return;
        int appetite = cat.getAppetite();
        if (food >= appetite) {
            food -= n;
            cat.satiety = true;
            System.out.println(cat.getName() + " " + "поел");
        }else {
            System.out.println(cat.getName() + " " + "не поел");
        }
    }

    public void addFood(int n){
        food += n;
    }

}

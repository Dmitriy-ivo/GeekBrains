package GeeB1_7;

public class Cat {
    private String name;
    private int appetite;
    public boolean satiety;

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate p){
        System.out.println(this.name + " " + "подошел к тарелке");
        p.decreaseFood(this,appetite);
    }

    public void info(){
        System.out.println(name + " " + satiety);
    }

    public String getName(){
        return name;
    }

}

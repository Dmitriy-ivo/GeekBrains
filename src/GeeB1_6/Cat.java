package GeeB1_6;

public class Cat extends Animal {

    Cat(int leghtSwim, int lenghtRun, int height){
        this.maxHeight = height;
        this.maxLenghtRun = lenghtRun;
        this.maxLenghtSwim = leghtSwim;
    }

    @Override
    public void run(int a) {
        if (this.maxLenghtRun > a){
            System.out.println("Бегу");
        }
        else {
            System.out.println("Не смогу столько пробежать");
        }
    }

    @Override
    public void jump(int a) {
        if (this.maxHeight > a){
            System.out.println("Прыгаю");
        }
        else {
            System.out.println("Не смогу так прыгнуть");
        }
    }

    @Override
    public void swim(int a) {
        if (this.maxLenghtSwim > a){
            System.out.println("Плыву");
        }
        else {
            System.out.println("Не смогу столько плыть");
        }
    }
}

package GeeB2_1;

public class Human implements Competitor {
    String name;
    int maxSwim;
    int maxRun;
    int maxJump;
    boolean isOnDistance;

    Human(String name, int maxJump, int maxRun, int maxSwim){
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.isOnDistance = true;
    }

    @Override
    public void jump(int dist) {
        if (dist <= maxJump){
            System.out.println("Перепрыгнул");
        }else {
            System.out.println("НЕ Перепрыгнул");
            isOnDistance = false;
        }
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRun){
            System.out.println("Пробежал");
        }else {
            System.out.println("НЕ пробежал");
            isOnDistance = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (dist <= maxSwim){
            System.out.println("Проплыл");
        }else {
            System.out.println("НЕ проплыл");
            isOnDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return isOnDistance;
    }

    @Override
    public void info() {
        System.out.println(name + " - " + isOnDistance);
    }
}

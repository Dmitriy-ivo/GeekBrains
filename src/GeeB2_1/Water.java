package GeeB2_1;

public class Water extends Obstacle {
    int param;

    Water(int param){
        this.param = param;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(param);
    }
}

package GeeB2_1;

public class Wall extends Obstacle {
    int param;

    Wall(int param){
        this.param = param;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(param);
    }
}

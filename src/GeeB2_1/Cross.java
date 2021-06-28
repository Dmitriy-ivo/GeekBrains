package GeeB2_1;

public class Cross extends Obstacle {
    int param;

    Cross(int param){
        this.param = param;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(param);
    }
}


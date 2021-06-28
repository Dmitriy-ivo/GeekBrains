package GeeB2_1;

public class Course {
    public Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team){
        for (Competitor c:team.competitors) {
            for (Obstacle o:obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()){
                    break;
                }
            }
        }
    }
}

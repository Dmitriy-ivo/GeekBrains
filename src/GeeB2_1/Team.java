package GeeB2_1;

public class Team {
    public String name;
    Competitor[] competitors = new Competitor[4];

    public Team(String name){
        this.name = name;
        competitors[0] = new Cat("Vasja",1,30,0);
        competitors[1] = new Dog("Sharik",2,40,10);
        competitors[2] = new Human("Alex",2,15,5);
        competitors[3] = new Human("Victor",3,45,10);
    }

    public void infoAllPerson(){
        for (Competitor c:competitors) {
            c.info();
        }
    }

    public void infoPersonOnDistance(){
        for (Competitor c:competitors) {
            if (c.isOnDistance())
                c.info();
        }
    }

}

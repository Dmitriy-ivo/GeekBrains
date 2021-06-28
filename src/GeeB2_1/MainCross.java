/*
1. Разобраться с имеющимся кодом.
2. Добавить класс Team, который будет содержать название команды, массив из 4-х участников
(т.е. в конструкторе можно сразу всех участников указывать), метод для вывода информации
о членах команды, прошедших дистанцию, метод вывода информации обо всех членах
команды.
3. Добавить класс Course (полоса препятствий), в котором будут находиться: массив
препятствий, метод, который будет просить команду пройти всю полосу.
 */
package GeeB2_1;

public class MainCross {
    public static void main(String[] args) {

        Competitor[] competitors = new Competitor[3];
        competitors[0] = new Cat("Vasja",1,30,0);
        competitors[1] = new Dog("Sharik",2,40,10);
        competitors[2] = new Human("Alex",2,15,5);

        Obstacle[] obstacles = new Obstacle[3];
        obstacles[0] = new Wall(1);
        obstacles[1] = new Water(3);
        obstacles[2] = new Cross(20);

        for (Competitor c: competitors) {
            for (Obstacle o: obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()){
                    break;
                }
            }
        }

        for (Competitor c: competitors) {
            c.info();
        }
    }

}

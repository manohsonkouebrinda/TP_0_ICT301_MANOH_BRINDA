package ISP.Avant;

public class MainISP {
    public static void main(String[] args) {

        Worker human = new HumanWorker();
        human.work();
        human.eat();

        Worker robot = new RobotWorker();
        robot.work();
        // robot.eat(); → provoque une erreur logique
    }
}

public class FanMain {
    public static void main(String[] args) {
        Fan fan3 = new Fan();
        Fan fan1 = new Fan();
        fan1.setColor("Purple");
        fan1.setOn(true);
        fan1.setRadius(9.5);
        fan1.setSpeed(1);
        Fan fan2 = new Fan();
        fan2.setColor("Brown");
        fan2.setOn(false);
        fan2.setRadius(7.2);
        fan2.setSpeed(2);

        fan3.toString(fan1);
        System.out.println("Gulu guluuuu");


    }





}

public class App {
    public static void main(String[] args) throws Exception {
        motor motor = new motor();
        motor aerox = new motor();
    
        motor.color = "Hitam";
        motor.type = "Jazz";

        motor.klakson();
        motor.nyala();
        motor.mati();
    
    }

}

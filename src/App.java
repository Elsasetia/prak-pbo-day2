public class App {
    public static void main(String[] args) throws Exception {
        iphone iphone1 = new iphone();
        iphone iphone2 = new iphone();
    
        iphone1.color = "Hitam";
        iphone2.color = "Silver";

        iphone1.berdering();
        iphone1.nyala();
        iphone1.mati();

        iphone2.berdering();
        iphone2.nyala();
        iphone2.mati();

            }

}
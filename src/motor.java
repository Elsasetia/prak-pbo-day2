public class motor {
    
    String color;
    String type;

    public void nyala() { 
        System.out.println ("motor warna" + this.color + this.type + "menyalakan mesin");
    }
    public void mati() {
        System.out.println("motor warna" + this.color + this.type +"matikan mesin");
    }
    public void klakson() {
        System.out.println("motor warna" + this.color + this.type + " bunyi klakson"); 
    
    }

}

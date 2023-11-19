public class Park {
    public static void main(String[] args){
        Park park = new Park();
        Park.Attraction parkForChildren = park.new Attraction("Trailers", "10:00-20:00", 12.60);
        parkForChildren.info();
    }

    public class Attraction{
       private String name;
       private String hours;
       private double price;

    public Attraction(String name, String hours, double price) {
        this.name = name;
        this.hours = hours;
        this.price = price;
    }

        public void info(){
        System.out.println("Attraction: "+ name +", working hours is: " + hours + ", costs: " + price);
    }
    }
}

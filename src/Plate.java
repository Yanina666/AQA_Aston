public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

   public void decreaseFood(int n) {
        food -= n;
    }

    public void increaseFood() {
        this.food += 30;
        System.out.println("There are 30 in the plate");
    }

    public boolean checkFood(int n) {
        return (food - n) >= 0;
    }
}

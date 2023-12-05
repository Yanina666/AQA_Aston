public class Cat extends Animal {
    public String name;
    private final int maxRunLength = 200;
    private static int count;
    private boolean satiate;
    private int appetite;

    public Cat(String name, int appetite, boolean satiate) {
        this.name = name;
        this.appetite = appetite;
        this.satiate = satiate;
    }


    public Cat() {
        this.name = name;
        this.satiate = false;
        this.appetite = appetite;
        count++;
    }

    String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    @Override
    public void run(int length) {
        if ((length >= 0) && (length <= maxRunLength))
            System.out.println("Cat run: " + length);
        else System.out.println("A cat can't run that far");
    }

    @Override
    public void swim(int length) {
        System.out.println("A cat can't swim");
    }

    public static int getCount() {
        return count;
    }

    public boolean satiate() {
        return satiate;
    }

    int setSatiate(int satiate) {
        return satiate;
    }

    int getSatiate(int satiate) {
        return satiate;
    }

    public void eat(Plate p) {
        if (!satiate)
            if (p.decreaseFood(appetite)) {
                satiate = true;
            }
    }
}

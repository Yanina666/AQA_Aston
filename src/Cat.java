public class Cat extends Animal {
    private final int maxRunLength = 200;
    private static int count;
    private boolean satiate;

    public Cat(){
        this.satiate = false;
        count++;
    }

    @Override
    public void run(int length){
    if((length >= 0) && (length <= maxRunLength))
        System.out.println("Cat run: " + length);
    else System.out.println("A cat can't run that far");
    }

    @Override
    public void swim(int length){
        System.out.println("A cat can't swim");
    }

    public static int getCount(){
        return count;
    }

    public boolean satiate() {
        return satiate;
    }

    public void getInfo(){
        System.out.println(!this.satiate ? "satiate" : "didn't satiate");
    }

}

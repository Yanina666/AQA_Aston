public class Cat extends Animal {
    private final int maxRunLength = 200;

    @Override
    public void run(int length){
    if((length >= 0) && (length <= maxRunLength))
        System.out.println("Cat run: " + length);
    else System.out.println("A cat can't run that far");
    }
}

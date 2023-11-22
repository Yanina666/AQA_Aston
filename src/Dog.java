public class Dog extends Animal {
    private final int maxRunLength = 500;

    @Override
    public void run(int length){
        if((length >= 0) && (length <= maxRunLength))
            System.out.println("Dog run: " + length);
        else System.out.println("A dog can't run that far");
    }
}

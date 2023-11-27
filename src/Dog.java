public class Dog extends Animal {
    private final int maxRunLength = 500;
    private final int maxSwimLength = 10;
    private static int count;

  @Override
    public void run(int length){
        if((length >= 0) && (length <= maxRunLength))
            System.out.println("Dog run: " + length);
        else System.out.println("A dog can't run that far");
    }

    @Override
    public void swim(int length){
        if((length >= 0) && (length <= maxSwimLength))
            System.out.println("Dog swim: " + length);
        else System.out.println("A dog can't swim that far");
    }

    public static int getCount(){
        return count;
    }
}

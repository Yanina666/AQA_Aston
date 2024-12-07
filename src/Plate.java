public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    int getFood() {
        return food;
    }

   //уменьшаем еду в тарелке усатым
    public boolean decreaseFood(int n) {
        if(n <= food){
            food -= n;
            return true;
        }
       return false;  //еды не хватило, пусть ловит мышей
   }

    public void increaseFood(int n) {
        this.food += n;
    }

    public boolean checkFood(int n) {
        return (food - n) >= 0;
    }
}

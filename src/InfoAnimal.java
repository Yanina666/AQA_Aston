public class InfoAnimal {
    public static void main(String[] args) {
        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Lucky", 57, false);
        allCats[1] = new Cat("Ozzy", 12, false);
        allCats[2] = new Cat("Blacky", 10, false);
        allCats[3] = new Cat("Maks", 45, false);

        Dog Reks = new Dog();
        Reks.run(30);
        Reks.swim(11);



        Plate plate = new Plate(50);
        plate.checkFood(8);

        System.out.println("You has four cats: " + allCats[0].getName() + ", "
                + allCats[1].getName() + " and " + allCats[2].getName() + ", "
                + allCats[3].getName());

        System.out.println("Now we have: " + plate.getFood() + "g. of food\n");

        for (Cat i : allCats) {

            //если кот не сыт
            if (i.satiate() == false) {

                //если в миске не хватает еды, чтобы накормить кота, она будет добавлена
                if (!plate.checkFood(i.getAppetite())) {
                    plate.increaseFood(50);
                }
            }
//кот ест
            i.eat(plate);
            System.out.println("Cat " + i.getName() + " ate " + i.getAppetite() + " g.of food ");

            //декрементация показателя сытости
            i.setSatiate(i.getSatiate(40) - 1);
        }
        System.out.println("In the plate we have: " + plate.getFood() + " g.of food.\n");
    }
}

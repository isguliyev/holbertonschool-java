public class Program {
    public static void main(String[] args) {
        Food food1 = new Food("rice", 100.0d, 15.9d);
        Food food2 = new Food("beans", 80.0d, 23.0d);
        Food food3 = new Food("peanut", 165.0d, 7.5d);

        Electronic electronic1 = new Electronic("Smart TV LED 32 HD LG", 1452.55d);
        Electronic electronic2 = new Electronic("Nintendo Switch", 2990.0d);

        ElectronicWarehouse warehouse1 = new ElectronicWarehouse();
        warehouse1.addToInventory("TV LG", electronic1);
        warehouse1.addToInventory("Switch", electronic2);

        Electronic searchedElectronic1 = warehouse1.getFromInventory("Switch");

        System.out.println(searchedElectronic1);

        FoodWarehouse warehouse2 = new FoodWarehouse();
        warehouse2.addToInventory("beans", food2);
        warehouse2.addToInventory("peanut", food3);

        Food searchedFood1 = warehouse2.getFromInventory("beans");

        System.out.println(searchedFood1);
    }
}
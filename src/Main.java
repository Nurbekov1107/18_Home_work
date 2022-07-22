import com.company.*;

public class Main {
    public static void main(String[] args) {

        Cow cow1 = new Cow("Cow1", 85.5, 5, 'M');
        Sheep sheep1 = new Sheep("Sheep1", 50, 2, 'F');
        Horse horse1 = new Horse("Horse1", 100.6, 3, 'M');

        Farm farm2 = new Farm("Kant", "Asan", new Cow[]{cow1}, new Sheep[]{sheep1}, new Horse[]{horse1});
        System.out.println(farm2);
        System.out.println();

        Sheep sheep2 = new Sheep("Sheep2", 50, 1, 'F');
        Sheep sheep3 = new Sheep("Sheep3", 50, 2, 'F');
        Sheep sheep4 = new Sheep("Sheep4", 50, 3, 'F');
        Cow cow2 = new Cow("Cow2", 78.5, 6, 'M');
        Cow cow3 = new Cow("Cow3", 85.5, 5, 'M');
        Cow cow4 = new Cow("Cow4", 95.5, 3, 'M');
        Cow cow5 = new Cow("Cow5", 90.5, 5, 'M');
        Cow cow6 = new Cow("Cow6", 60.5, 4, 'M');
        Horse horse2 = new Horse("Horse2", 120.6, 4, 'M');
        Horse horse3 = new Horse("Horse3", 100.6, 3, 'M');

        Cow[] cowArray2 = {cow2, cow3, cow4, cow5, cow6};
        Sheep[] sheepArray2 = {sheep2, sheep3, sheep4};
        Horse[] horseArray2 = {horse2, horse3};
        Farm farm1 = new Farm("Tokmok", "Uson", cowArray2, sheepArray2, horseArray2);
        System.out.println(farm1);
    }
}
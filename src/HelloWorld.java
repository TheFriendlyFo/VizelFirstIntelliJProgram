import java.util.Random;
import java.util.ArrayList;

public class HelloWorld {
    public static ArrayList<Rabbit> genRabitts(int amtRabbits){
        ArrayList<Rabbit> Rabbits = new ArrayList<>();

        for (int i=0; i<amtRabbits; i++) {
            double rabbitSpeed = Math.random() * 10;
            double rabbitSize = Math.random() * 10;
            Rabbits.add(new Rabbit(i, rabbitSpeed, rabbitSize));
        }

        return Rabbits;
    }
    public static void main(String[] args) {
        ArrayList<Rabbit> Rabbits = genRabitts(2);
        Random random = new Random();

        for (int i=0; i<100; i++) {
            Rabbits.get(random.nextInt(Rabbits.size())).breed(Rabbits);
        }

        for (Rabbit rabbit: Rabbits) {
            System.out.println(rabbit.id);
            System.out.println(rabbit.speed);
            System.out.println(rabbit.size);
            System.out.println();
        }
    }
}

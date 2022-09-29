import java.util.Random;
import java.util.ArrayList;

public class Rabbit {
    int id;
    double speed;
    double size;
    double hunger=0;
    double thirst=0;
    Random random = new Random();

    Rabbit(int inId, double inSpeed, double inSize) {
        id = inId;
        speed = inSpeed;
        size = inSize;
    }

    double average(double gene1, double gene2) {
        double newGene = (gene1 + gene2) / 2;
        return newGene -2 + Math.random()*4;
    }

    public void act() {
        hunger += random.nextDouble(1.5);
        thirst += random.nextDouble(2);


    }

    void breed (ArrayList<Rabbit> mates) {
        int newId = mates.size();

        mates.remove(id);
        Rabbit mate = mates.get(random.nextInt(mates.size()));
        mates.add(id, this);

        double newSpeed = average(speed, mate.speed);
        double newSize = average(size, mate.size);

        mates.add(new Rabbit(newId, newSpeed, newSize));
    }
}

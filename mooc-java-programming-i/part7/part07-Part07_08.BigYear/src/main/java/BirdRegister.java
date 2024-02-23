
import java.util.ArrayList;
import java.util.List;

public class BirdRegister {

    private List<Bird> birds;
    private int observations;

    public BirdRegister() {
        this.birds = new ArrayList<>();
    }

    public List<Bird> getBirds() {
        return birds;
    }

    public void setBirds(List<Bird> birds) {
        this.birds = birds;
    }

    public void addBird(Bird bird) {
        this.birds.add(bird);
    }

    public void addObservation(String birdName) {

        for (Bird bird : birds) {

            if (bird.getName().equals(birdName)) {
                bird.addObservation();
            } else {
                System.out.println("Not a bird!");
            }
        }
    }

    public void getBirdAfterName(String birdName) {

        for (Bird bird : birds) {

            if (bird.getName().equals(birdName)) {
                System.out.println(bird);
            }
        }

    }

    public void printAllBirds() {

        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
}

package Wildcards;

import java.util.Random;

public class WarehouseService {

    public Crate<?> fetchRandomCrate() {
        Random random = new Random();
        int randomIndex = random.nextInt(3);


        switch (randomIndex) {
            case 0:
                return new Crate<>("Random String Crate");
            case 1:
                return new Crate<>(42);  // Integer Crate
            case 2:
                return new Crate<>(3.14); // Double Crate
            default:
                return new Crate<>("Unknown");
        }
    }

    public Crate<? extends Animal> fetchRandomAnimalCrate() {
        Random random = new Random();
        int randomIndex = random.nextInt(2);

        switch (randomIndex) {
            case 0:
                return new Crate<>(new Dog());  // Crate met een Dog
            case 1:
                return new Crate<>(new Cat());  // Crate met een Cat
            default:
                return new Crate<>(new Dog());  // fallback (noodzakelijk voor Java)
        }
    }
}
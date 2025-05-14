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
}

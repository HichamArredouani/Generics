package Wildcards;

public class CrateApp {
    public static void main (String[] args) {
        WarehouseService warehouseService = new WarehouseService();

        Crate<? extends Animal> animalCrate = warehouseService.fetchRandomAnimalCrate();

       Animal animal = animalCrate.getContents();
       animal.feed();

       animalCrate.ship();
    }
}

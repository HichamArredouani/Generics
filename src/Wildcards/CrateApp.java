package Wildcards;

public class CrateApp {
    public static void main (String[] args) {
        WarehouseService warehouseService = new WarehouseService();
        Crate<?> crate = warehouseService.fetchRandomCrate();

        System.out.println(crate);

        Object contents = crate.getContents();
        System.out.println("Verwerkte inhoud: " + contents);
    }
}

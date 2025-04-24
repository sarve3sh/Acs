public class GarageTest {
    public static void main(String[] args) {
        for (Garage brand : Garage.values()) {
            System.out.println("Brand: " + brand.name());
            System.out.println("Founded Year: " + (int)brand.getYear());
            System.out.println("2024 Revenue (in CAD billions): $" + brand.getRevenue());
            System.out.println("----------------------------------");
        }
    }
}
public class GarageTest {
    public static void main(String[] args) {
        for (Garage team : Garage.values()) {
            System.out.println("Team: " + team.name());
            System.out.println("Best Race Year: " + (int)team.getYear());
            System.out.println("Best Driver:" + team.getDriver());
            System.out.println("2024 Spendings (in USD millions): $" + team.getSpending());
            System.out.println("----------------------------------");
        }
    }
}
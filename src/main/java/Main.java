import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, List<String>> countries = new HashMap<>();
        Scanner in = new Scanner(System.in);

        readCountries(countries, in);

        printSummary(countries);
    }

    private static void readCountries(Map<String, List<String>> countries, Scanner in) {

        String countryName;

        System.out.println("Wpisz pierwszy kraj, lub wciśnij (k), by zakończyć");
        while (!(countryName = in.nextLine()).equals("k")) {

            System.out.println("Wpisz pierwsze miasto, lub wciśnij (w), by wyjechać z kraju");
            String cityName;
            List<String> cities = new ArrayList<>();

            readCities(in, cities);

            if (cities.size() > 0) {
                countries.put(countryName, cities);
            }

            System.out.println("Wpisz kolejny kraj, lub wciśnij (k), by zakończyć");
        }
    }

    private static void readCities(Scanner in, List<String> cities) {
        String cityName;
        while (!(cityName = in.nextLine()).equals("w")) {
            cities.add(cityName);
            System.out.println("Wpisz kolejne miasto, lub wciśnij (w), by wyjechać z kraju");
        }
    }

    private static void printSummary(Map<String, List<String>> countries) {
        System.out.println("Liczba odwiedzonych krajów: " + countries.size());

        if (countries.size() > 0) {
            System.out.println("Odwiedzone kraje:");

            for (Map.Entry<String, List<String>> country : countries.entrySet()) {
                System.out.println(country.getKey());

                for(String city: country.getValue()) {
                    System.out.println("\t" + city);
                }
            }
        }
    }


}

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        String countryName;

        System.out.println("Wpisz pierwszy kraj, lub wciśnij (k), by zakończyć");

        while(!(countryName = in.nextLine()).equals("k")){
            countries.add(countryName);

            System.out.println("Wpisz kolejny kraj, lub wciśnij (k), by zakończyć");
        }

        printSummary(countries);
    }

    private static void printSummary(List<String> countries) {
        System.out.println("Liczba odwiedzonych krajów: " + countries.size());

        if(countries.size() > 0){
            System.out.println("Odwiedzone kraje:");

            for(String country: countries) {
                System.out.println(country);
            }
        }
    }


}

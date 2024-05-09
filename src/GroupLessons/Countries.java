package GroupLessons;

public class Countries {
    /*
        Task:
                 Given a String array of countries: String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Portugal", "Philippines", "Armenia", "Colombia", "Honduras", "Indonesia", "United States"
                };
                - Find and print all the first and last characters of each country
                - Find and print all the countries that end with the letter ‘a’
                - Create “contains logic” to check if there is a certain country in the array. Can check for the United States, or use Scanner to check any country
     */
    public static void main(String[] args) {
        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Portugal", "Philippines", "Armenia", "Colombia", "Honduras", "Indonesia", "United States"};
        for (int i = 0; i < countries.length; i++) {
            String country = countries[i];
            char firstCharacter = country.charAt(0);
            char lastCharacter = country.charAt(country.length() - 1);
            System.out.println("Country " + country + "\nFirst character: " + firstCharacter + "\nLast Character: " + lastCharacter);
            System.out.println("=================================================");
            for (String each : countries) {
                if (each.endsWith("a")) {
                    System.out.println(each);
                    System.out.println("=================================================");
                }
                for (String country1 : countries) {
                    if (country1.contains("United States")) {
                        System.out.println(country1);

                    }


                }

            }
        }
    }
}
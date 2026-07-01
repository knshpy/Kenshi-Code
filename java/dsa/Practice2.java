
public class Practice2 {

    // Linear search
    // Searching into array's column without skipping any elements until target is found
    // Ex:
    // Target: 10
    // Process: 1 2 3 4 5 6 7 8 9 [10] - target found!
    // If target is 1 Million steps will be also 1 million

    public static void Names() {

        String[] names = {"Ronaldo", "Leclerc", "Napoleon", "Michael", "Alexander", "Job"};

        for (int i = 0; i < names.length; i++) {

            int attempt = i + 1;
            System.out.println("\nAttempt: " + (i + 1));

            if ("Alexander".equals(names[i])) {
                System.out.println("Found at index: [" + i + "]");
                return;
            }
        }
            System.out.print("Not found");
    }

    public static void Cars() {

        String[][] cars = {
                            {"Audi", "Mercedes", "Ferrari", "Aston martin"},
                            {"Chevrolet", "Ford", "Cadillac", "Dodge"}};

        int attempts = 0;

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {

                attempts ++;
                System.out.println("\nAttempts: " + (attempts));

                if ("Ford".equals(cars[i][j])) {
                    System.out.println("Found at index: [" + i +"][" + j + "]");
                    return;
                }
            }
                System.out.print("Not found");
        }
    }

    public static void Countries() {

        String[][][] Countries = {

                // Asia
                {
                        {"China", "Japan", "India", "South Korea"},
                        {"Thailand", "Vietnam", "Indonesia", "Malaysia"},
                        {"Philippines", "Singapore", "Pakistan", "Bangladesh"},
                        {"Saudi Arabia", "Israel", "Turkey", "United Arab Emirates"}
                },

                // Europe
                {
                        {"France", "Germany", "Italy", "Spain"},
                        {"United Kingdom", "Netherlands", "Belgium", "Switzerland"},
                        {"Austria", "Sweden", "Norway", "Denmark"},
                        {"Finland", "Poland", "Greece", "Portugal"}
                },

                // Africa
                {
                        {"Nigeria", "Egypt", "South Africa", "Kenya"},
                        {"Ghana", "Morocco", "Ethiopia", "Uganda"},
                        {"Tanzania", "Algeria", "Senegal", "Tunisia"},
                        {"Zimbabwe", "Rwanda", "Sudan", "Botswana"}
                },

                // North America
                {
                        {"United States", "Canada", "Mexico", "Cuba"},
                        {"Jamaica", "Haiti", "Dominican Republic", "Panama"},
                        {"Costa Rica", "Guatemala", "Belize", "Honduras"},
                        {"Nicaragua", "El Salvador", "Bahamas", "Barbados"}
                },

                // South America
                {
                        {"Brazil", "Argentina", "Colombia", "Chile"},
                        {"Peru", "Ecuador", "Bolivia", "Uruguay"},
                        {"Paraguay", "Venezuela", "Guyana", "Suriname"},
                        {"French Guiana", "Falkland Islands", "Trinidad & Tobago", "Paraguay"}
                },

                // Oceania
                {
                        {"Australia", "New Zealand", "Fiji", "Papua New Guinea"},
                        {"Samoa", "Tonga", "Vanuatu", "Solomon Islands"},
                        {"Kiribati", "Tuvalu", "Palau", "Micronesia"},
                        {"Nauru", "Marshall Islands", "New Caledonia", "French Polynesia"}
                }
        };

        int attempts = 0;

        for (int i = 0; i < Countries.length; i++) { // Tables
            for (int j = 0; j < Countries[i].length; j++) { // Rows
                for (int k = 0; k < Countries[i][j].length; k++) { // Columns

                    attempts ++;
                    System.out.println("\nAttempts: " + (attempts));

                    if ("Cuba".equals(Countries[i][j][k])) {
                        System.out.println("Found at index: [" + i + "][" + j + "][" + k + "]");
                        return;
                    }
                }
                System.out.print("Not found");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Names output: ");
        Practice2.Names();

        System.out.println("\nCars output: ");
        Practice2.Cars();

        System.out.println("\nCountries output: ");
        Practice2.Countries();
    }
}

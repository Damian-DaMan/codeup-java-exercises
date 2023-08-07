import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {

        String[] adjectives = {
                "Solid",
                "Liquid",
                "Venomous",
                "Naked",
                "Cunning",
                "Sniper",
                "Thunder",
                "Big Boss",
                "Grey Fox",
                "Quiet"
        };

        // Array of nouns (Metal Gear code names)
        String[] nouns = {
                "Snake",
                "Ocelot",
                "Octopus",
                "Patriot",
                "Cyborg",
                "Raven",
                "Diamond Dogs",
                "Philanthropy",
                "FOXHOUND",
                "XOF"
        };


        for (int i = 0; i < 10; i++) {
            String adjective = getRandomElement(adjectives);
            String noun = getRandomElement(nouns);
            System.out.println(adjective + " " + noun);
        }

    } // =========================================== END of Main

    // method used to get the random index of the Strings[]'s,
    public static String getRandomElement(String[] array) {
        Random random = new Random();
        int randomIndex = random.nextInt(array.length);
        return array[randomIndex];
    }






}



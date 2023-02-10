package nl.novi.jp.methods.senior;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Gegeven: een lijst met namen zonder hoofdletters van klanten.
 * Opdracht: Een luie stagiair heeft alle klanten in het systeem gezet, maar deze kon de Shift-knop niet vinden.
 * Het is aan jou om alle namen van een hoofdletter aan het begin te voorzien. Maak een methode die een List als
 * parameter ontvangt en de inhoud vervolgens van hoofdletters voorziet.
 *
 * Bonus 1: Zorg ervoor dat tussenvoegsels geen hoofdletter krijgen.
 * Bonus 2: Zorg ervoor dat de eerste letter na een '-' wel een hoofdletter krijgt.
 *
 *
 */

public class SeniorOne {
    public static void main(String[] args) {
        List<String> customerNames = new ArrayList<>();

        customerNames.add("nick piraat");
        customerNames.add("michael jackson");
        customerNames.add("glennis grace");
        customerNames.add("dreetje hazes");
        customerNames.add("robbie williams");
        customerNames.add("michiel de ruyter");
        customerNames.add("sjaak polak");
        customerNames.add("jan van jansen");
        customerNames.add("henk den hartog");
        customerNames.add("mo el-mecky");
        customerNames.add("fredje kadetje");

        List<String> upperCaseList = upperCustNames(customerNames);

        // Print out names, first- and lastname capitalized
        for (String name: upperCaseList
             ) {
            System.out.println(name);
        }
    }

    public static String capitalize(String name) {

        // Set first char to upper case
        return name.substring(0, 1).toUpperCase() + name.substring(1);

    }

    // Spelling according to Dutch System:  https://taaladvies.net/de-villepin/
    public static List<String> upperCustNames(List<String> oldList) {
        List<String> newList = new ArrayList<String>();

        // Loop through list and get each full name
        for (int i = 0; i < oldList.size(); i++) {

            // Split each name by space or dash into array of separate strings
            String[] fullName = oldList.get(i).split("[- ]");
            for (String name: fullName
                 ) {
                System.out.println(name);
            }
            System.out.println("*********");

            //Set first letter of first and last string to upper case.
            fullName[0] = capitalize(fullName[0]);//first name
            fullName[fullName.length - 1] = capitalize(fullName[fullName.length - 1]);// last name

            // Join names to String to make new full name and add to new list
            newList.add(String.join(" ", fullName));
        }
        return newList;
    }
}
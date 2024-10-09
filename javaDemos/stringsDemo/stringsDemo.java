package stringsDemo;

public class stringsDemo {
    public static void main(String[] args) {

        String mesaj = "Good morning you all";
        System.out.println(mesaj);

        int eleman = mesaj.length(); // How many characters does the entered word consist of?
        System.out.println("Eleman sayisi: " + eleman); 
        System.out.println("5. Eleman: " + mesaj.charAt(4)); // What is the character in the entered index?

        System.out.println(mesaj.concat(" everyone")); // adding new string to old string

        System.out.println(mesaj.startsWith("G")); // is string starts with G?
        System.out.println(mesaj.endsWith("A")); // is string ends with A?

        char[] karakterler = new char[5];
        mesaj.getChars(0, 4, karakterler, 0); // Transfers received characters to another sentence
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf("o")); // Searches for the entered character from the beginning
        System.out.println(mesaj.lastIndexOf("o")); // Searches for the entered character from the end

        String yeniMesaj = mesaj.replace('o', 'a'); // replace old char with new one
        System.out.println(yeniMesaj);

        System.out.println(mesaj.substring(1, 3)); // Returns the characters between the entered indexes

        for (String kelime : mesaj.split(" ")) { // splitting words according to spaces or anything
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase()); // doing lower case all data
        System.out.println(mesaj.toUpperCase()); // doing upper case all data

        System.out.println(mesaj.trim()); // removing spaces

    }
}

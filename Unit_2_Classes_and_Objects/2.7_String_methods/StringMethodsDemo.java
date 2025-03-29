public class StringMethodsDemo {
    public static void main(String[] args) {
        // Initialize a string
        String name = "KarelTheDog";

        // Creating a new String object
        String str2 = new String(name);
        System.out.println("New String object: " + str2);

        // Length of the string
        System.out.println("Length of the string: " + name.length());

        // Substring from index 2 to 6
        System.out.println("Substring (2,6): " + name.substring(2, 6));

        // Extracting a single character as a substring
        int index = 4;
        System.out.println("Single character substring at index " + index + ": " + name.substring(index, index + 1));

        // Index of a character ('d')
        System.out.println("Index of 'd': " + name.indexOf("d"));

        // Checking equality with "Karel"
        System.out.println("Equals 'Karel'? " + name.equals("Karel"));

        // Comparing to "Karel"
        System.out.println("CompareTo 'Karel': " + name.compareTo("Karel"));
    }
}

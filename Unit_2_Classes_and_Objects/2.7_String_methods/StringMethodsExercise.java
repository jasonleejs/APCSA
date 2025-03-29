public class StringMethodsExercise {
    
    public static void main(String[] args) {
        // 1. String Construction
        // What is the difference between these two string declarations?
        String str1 = "Hello";
        String str2 = new String("Hello");
        
        // Compare them using == and .equals()
        System.out.println(str1 == str2);  // Expected: ???
        System.out.println(str1.equals(str2));  // Expected: ???

        // 2. String Length
        // Predict the output of this code
        String name = "Programming";
        System.out.println(name.length());  // Expected: ???

        // 3. Extracting Substrings
        // What will be printed?
        String word = "engineering";
        System.out.println(word.substring(3, 7));  // Expected: ???

        // 4. Single Character Substring
        // What will be printed?
        String word2 = "example";
        System.out.println(word2.substring(2, 3));  // Expected: ???

        // 5. Finding an Index
        String phrase = "hello world";
        System.out.println(phrase.indexOf("o"));  // Expected: ???
        System.out.println(phrase.indexOf("z"));  // Expected: ???

        // 6. Checking String Equality
        String name1 = "Karel";
        String name2 = "Karel";
        String name3 = new String("Karel");

        System.out.println(name1.equals(name2));  // Expected: ???
        System.out.println(name1.equals(name3));  // Expected: ???
        System.out.println(name1 == name2);  // Expected: ???
        System.out.println(name1 == name3);  // Expected: ???

        // 7. Comparing Strings
        String fruit = "Apple";
        System.out.println(fruit.compareTo("Banana")); // Expected: ???
        System.out.println(fruit.compareTo("Apple")); // Expected: ???
        System.out.println(fruit.compareTo("Apricot")); // Expected: ???

        // 8. Extract Initials (Fill in the method)
        System.out.println(getInitials("John Doe"));  // Expected: "J.D."

        // 9. Find the First and Last Character of a String
        System.out.println(firstAndLast("Programming")); // Expected: "Pg"

        // 10. Count Occurrences of a Character
        System.out.println(countOccurrences("banana", 'a')); // Expected: ???
    }

    // 8. Method to get initials from full name
    public static String getInitials(String fullName) {
        // TODO: Implement logic to extract initials
        return "";
    }

    // 9. Method to return the first and last character of a string
    public static String firstAndLast(String str) {
        // TODO: Implement logic
        return "";
    }

    // 10. Method to count occurrences of a character in a string
    public static int countOccurrences(String str, char ch) {
        // TODO: Implement logic
        return 0;
    }
}

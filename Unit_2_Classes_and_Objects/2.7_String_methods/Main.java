class Box {
    int width;
    int length;

    public Box(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public String toString() {
        String stringRepresentation = "(" + this.width + "x" + this.length + ")";
        return stringRepresentation;
    }
}

class Dragon {
    ...
}

public class Main {
    public static void main(String[] args) {
        Nickname theRock = new Nickname("Dwyane", "Johnson", "the Rock");

        // Guess
       // System.out.println(); // (the Rock) Dwyane Johnson
        
        // // Guess
        Dragon d = new Dragon(...);
        System.out.println(d);
        
        String result = theRock + " went to the gym"; // (the Rock) Dwyane Johnson went to the gym
        System.out.println(result);
    }
}

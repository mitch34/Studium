public class Aemon {
    public static void main(String[] args) {
        int alter = 41;
        int delta = 10;

	System.out.println("Du bist " + alter + " Jahre alt.");
        if (alter > 29) {
            System.out.println("Aemon!");
            alter = alter + delta;
            System.out.println("In " + delta + " Jahren bist Du schon " + alter);
        } else {
            System.out.println("Arya!");
        }

    }
}

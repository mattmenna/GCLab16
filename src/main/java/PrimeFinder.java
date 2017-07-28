import java.util.Scanner;

public class PrimeFinder {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("What sequenced prime number do you want? For example, for the 3rd enter 3.");
        int sequence = scnr.nextInt();
        Prime prime = new Prime();
        System.out.println("The" + sequence + "th number is ");
        System.out.println(prime.getSequence(sequence));

    }
}

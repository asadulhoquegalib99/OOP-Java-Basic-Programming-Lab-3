import java.util.Scanner;

public class labtask27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a octal number : ");
        String octal = input.nextLine();

        int decimal = Integer.parseInt(octal, 8);
        String hex = Integer.toHexString(decimal).toUpperCase();
        System.out.println("Hexadecimal number: " + hex);
    }
}

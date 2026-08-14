import java.util.Scanner;

public class labtask20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a decimal number: ");
        int decimal = input.nextInt();

        String hex = Integer.toHexString(decimal).toUpperCase();
        System.out.println("Hexadecimal number is : " + hex);
    }
}
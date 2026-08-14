import java.util.Scanner;

public class labtask23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a Binary Number: ");
        String binary = input.nextLine();

        int decimal = Integer.parseInt(binary, 2);
        String hex = Integer.toHexString(decimal).toUpperCase();
        System.out.println("HexaDecimal value: " + hex);
    }
}

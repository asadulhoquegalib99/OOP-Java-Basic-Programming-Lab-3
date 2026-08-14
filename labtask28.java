import java.util.Scanner;

public class labtask28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a hexadecimal number: ");
        String hex = input.nextLine();

        int decimal = Integer.parseInt(hex, 16);
        System.out.println("decimal number is: " + decimal);
    }
}
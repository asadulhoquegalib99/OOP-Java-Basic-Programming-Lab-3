import java.util.Scanner;

public class labtask29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Hexadecimal Number : ");
        String hex = input.nextLine();

        int decimal = Integer.parseInt(hex, 16);
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary Number is: " + binary);
    }
}

import java.util.Scanner;

public class labtask30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a hexadecimal number: ");
        String hex = input.nextLine();

        int decimal = Integer.parseInt(hex, 16);
        String octal = Integer.toOctalString(decimal);
        System.out.println("octal number is: " + octal);
    }
}

import java.util.Scanner;

public class labtask18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the first binary number: ");
        String bi1 = input.nextLine();

        System.out.print("Input the second binary number: ");
        String bi2 = input.nextLine();

        int num1 = Integer.parseInt(bi1, 2);
        int num2 = Integer.parseInt(bi2, 2);
        int multiple = num1 * num2;

        String bimult = Integer.toBinaryString(multiple);
        System.out.println("Multiplication of two binary numbers: " + bimult);
    }
}

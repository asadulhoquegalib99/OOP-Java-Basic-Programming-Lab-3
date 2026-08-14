import java.util.Scanner;

public class labtask17 {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        String bi1 = input.nextLine();

        System.out.print("Input second binary number: ");
        String bi2 = input.nextLine();

        int num1 = Integer.parseInt(bi1, 2);
        int num2 = Integer.parseInt(bi2, 2);
        int sum = num1 + num2;

        String biSum = Integer.toBinaryString(sum);
        System.out.println("Addition of two binary numbers: " + biSum);
    }
}

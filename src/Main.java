import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz : ");
        int number = input.nextInt();
        int sum = 0;


        while (number != 0) {
            sum = sum + (number % 10);
            number = number / 10;
        }

        System.out.println("Basamak sayıları toplamı : " + sum);
    }
}

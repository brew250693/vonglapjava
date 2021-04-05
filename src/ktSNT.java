import java.util.Scanner;

public class ktSNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        if (number < 2)
            System.out.println(number + " is not a prime");
        else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }i++;
            }
            int count = 0;

            while (count<=20)
            if (check){
                count++;
            }
            System.out.println("20 SNT:"+ );



        }
    }
}

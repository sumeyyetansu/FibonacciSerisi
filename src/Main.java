import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Serinin eleman sayısı : ");
        int number = scanner.nextInt();
        int total = 0 ;
        int result = 1 ;

        for (  int i = 1 ; i <= number; i++){
            System.out.print(total + " ");
            int sum = total + result;
            total = result ;
            result = sum;

        }

    }
}
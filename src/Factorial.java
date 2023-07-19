import java.util.Scanner;

public class Factorial {
    public static int factorial(int Number)
    {
        if(Number==1)
        {
            return 1;
        }

        return factorial(Number-1)*(Number);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Number= scanner.nextInt();
        System.out.println(factorial(Number));
    }
}

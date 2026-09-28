import java.util.Scanner;
public class Assignment6E{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        boolean value = true;
        boolean value2 = true;
        int number = 0;
        int number2 = 0;
        int number3 = 0;
        int one = 0;
        int two = 0;
        while(value = true){
            System.out.println("Input a number");
            number = input.nextInt();
            while(value2 = true){
                number2 = number % 10;
                if(number2==1){
                    one = one + 1;
                }
                if(number2==2){
                    two = two + 1;
                }
                if(number==0){
                    value2 = false;
                    break;
                }
                number = number / 10;
            }
            if(one == two + 1){
                System.out.println("Yes");
            }
            if(one != two + 1){
                System.out.println("No");
            }
            System.out.println("Do you want to stop if yes input 0");
            number3 = input.nextInt();
            if(number3 == 0){
                System.out.println("Goodbye");
                System.exit(0);
            }
            if(number3 != 0){
                one = 0;
                two = 0;
                value2 = true;
            }
        }
    }
}
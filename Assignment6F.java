import java.util.Scanner;
public class Assignment6F {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean value = true;
        boolean value2 = false;
        int num = 0;
        int one = 0;
        int two = 0;
        int num2 = 1;
        int num3 = 0;
        int num4 = 0;
        int score = 0;
        while(value=true){
            while(value2 == true){
                System.out.println("Do you want to continue");
                num4 = input.nextInt();
                if(num4 == 1){
                    value2 = false;
                    num = 10000000;
                    break;
                }
                if(num4 == 2){
                    System.exit(0);
                }
                }
                while(num > 10001 || num <= 0){
                    System.out.println("Input a number between 1 10000");
                    num = input.nextInt();
                    num3 = num;
                }
            while(num != 0){
                num2 = num3 % 10;
                num3 = num3 / 10;
                if(num2==2){
                    two = two + 1;
                }
                if(num2==1){
                    one = one + 1;
                }
                if(num3 == 0){
                    if(one == two + 1){
                        score = score + 1;
                    }
                    num = num - 1;
                    num3 = num;
                    two = 0;
                    one = 0;
                }
                if(num == 0){
                    System.out.println(score);
                    score = 0;
                    value2 = true;
                }
                }
            }
        }
    }
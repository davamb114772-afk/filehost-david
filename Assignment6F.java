import java.util.Scanner;
public class Assignment6F {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean value = true;
        int num = 0;
        int one = 0;
        int two = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        while(value=true){
            System.out.println("Input a nubmer between 0 and 10000");
            num = input.nextInt();
            num3 = num;
            while(num3 != 0){
                if(num == 0){
                    num = num3 - 1;
                    num3 = num;
                }
                num2 = num % 10;
                num = num / 10;
                if(num2 == 2){
                    two = two + 1;
                }
                if(num2 == 1){
                    one = one + 1;
                }
                
            }
            if(one == two + 1){
                System.out.println("Yes");
            }
            if(one != two + 1){
                System.out.println("No");
            }
            System.out.println("If you want to stop input 1 if you want to continue input anything else");
            num4 = input.nextInt();
            if(num4 == 1){
                System.exit(0);
            }
    }
}
}
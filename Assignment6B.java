import java.util.Scanner;
public class Assignment6B
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean value = true;
        boolean value2 = true;
        boolean value3 = false;
        int value4 = 0;
        int num = 0;
        int num2 = 0;
        while(value = true){
            System.out.println("Input a number");
            int number= input.nextInt();
            value2 = true;
            while(value2 = true){
                num = number %10;
                number = number / 10;
                num2 = num2 + num;
                if(number==0){
                    System.out.println(num2);
                    value3 = true;
                }
                while(value3 = true){
                    System.out.println("Do you want to continue. 1=Yes. 2=No");
                    value4 = input.nextInt();
                    if(value4==1){
                        value3 = false;
                        value2 = false;
                        value4 = 0;
                    }
                    if (value4==2){
                        value = false;
                        value2 = false;
                        value3 = false;
                        value4 = 0;
                    }
                    
                }
            }
        }
        
    }
}
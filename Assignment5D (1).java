import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Assignment5D {
    public static void main(String[] args){
        Scanner input = new java.util.Scanner(System.in);
        boolean value = true;
        boolean value3 = true;
        int value2 = 2;
        String CEO = "nothing";
        int random = 1;
        int score = 0;
        while(value == true){;
            if(random == 1){
                System.out.println("Who is the CEO of Anthropic");
                CEO = input.nextLine();
                if(CEO.equalsIgnoreCase("Dario Amodei")){
                    System.out.println("Correct");
                    score = score + 1;

                }
                if(!CEO.equalsIgnoreCase("Dario Amodei")){
                    System.out.println("Incorrect");
                }
            }
            if(random == 2){
                System.out.println("Who is the CEO of Palantir");
                CEO = input.nextLine();
                if(CEO.equalsIgnoreCase("Alex Karp")){
                    System.out.println("Correct");
                    score = score + 1;
                }
                if(!CEO.equalsIgnoreCase("Alex Karp")){
                    System.out.println("Incorrect");
                }
            }
            if(random == 3){
                System.out.println("Who is the CEO of Dell Technologies");
                CEO = input.nextLine();
                if(CEO.equalsIgnoreCase("Michael Dell")){
                    System.out.println("Correct");
                    score = score + 1;
                }
                if(!CEO.equalsIgnoreCase("Michael Dell")){
                    System.out.println("Incorrect");
                }
            }
            if(random == 4){
                System.out.println("Who is the CEO of OpenAI");
                CEO = input.nextLine();
                if(CEO.equalsIgnoreCase("Sam Altman")){
                    System.out.println("Correct");
                    score = score + 1;
                }
                if(!CEO.equalsIgnoreCase("Sam Altman")){
                    System.out.println("Incorrect");
                }
            }
            if(random == 5){
                System.out.println("Who is the CEO of Telsa, SpaceX and xAi");
                CEO = input.nextLine();
                if(CEO.equalsIgnoreCase("Elon Musk")){
                    System.out.println("Correct");
                    score = score + 1;
                }
                if(!CEO.equalsIgnoreCase("Elon Musk")){
                    System.out.println("Incorrect");
                }
            }
            if(random == 6){
                System.out.println("Who is the CEO of Google");
                CEO = input.nextLine();
                if(CEO.equalsIgnoreCase("Sundar Pichai")){
                    System.out.println("Correct");
                    score = score + 1;
                }
                if(!CEO.equalsIgnoreCase("Sundar Pichai")){
                    System.out.println("Incorrect");
                }
            }
            if(random == 7){
                System.out.println("Who is the CEO of Meta");
                CEO = input.nextLine();
                if(CEO.equalsIgnoreCase("Mark Zuckerberg")){
                    System.out.println("Correct");
                    score = score + 1;
                }
                if(!CEO.equalsIgnoreCase("Mark Zuckerberg")){
                    System.out.println("Incorrect");
                }
            }
            if(random == 8){
                System.out.println("Who is the CEO of AMD");
                CEO = input.nextLine();
                if(CEO.equalsIgnoreCase("Lisa Su")){
                    System.out.println("Correct");
                    score = score + 1;
                }
                if(!CEO.equalsIgnoreCase("Lisa Su")){
                    System.out.println("Incorrect");
                }
            }
            if(random == 9){
                System.out.println("Who is the CEO of Apple");
                CEO = input.nextLine();
                if(CEO.equalsIgnoreCase("Tim Cook")){
                    System.out.println("Correct");
                    score = score + 1;
                }
                if(!CEO.equalsIgnoreCase("Tim Cook")){
                    System.out.println("Incorrect");
                }
            }
            if(random == 10){
                System.out.println("Who is the CEO of Microsoft");
                CEO = input.nextLine();
                if(CEO.equalsIgnoreCase("Satya Nadella")){
                    System.out.println("Correct");
                    score = score + 1;
                }
                if(!CEO.equalsIgnoreCase("Satya Nadella")){
                    System.out.println("Incorrect");
                }
            }
            if(random == 11){
                System.out.println("Who is the CEO of Nvidia");
                CEO = input.nextLine();
                if(CEO.equalsIgnoreCase("Jensen Huang")){
                    System.out.println("Correct");
                    score = score + 1;
                }
                if(!CEO.equalsIgnoreCase("Jensen Huang")){
                    System.out.println("Incorrect");
                }
            }
            if(random == 12){
                System.out.println("Who is the CEO of Valve");
                CEO = input.nextLine();
                if(CEO.equalsIgnoreCase("Gabe Newell")){
                    System.out.println("Correct");
                    score = score + 1;
                }
                if(!CEO.equalsIgnoreCase("Gabe Newell")){
                    System.out.println("Incorrect");
                }
            }
            random = random + 1;
            if(random == 13){
            System.out.println("Input 1 if you want to stop input any other number to continue");
            value2 = input.nextInt();
            input.nextLine();
            if(value2 == 1){
                System.out.printf("You got %f out of 12 questions right", score);
                System.exit(0);
            }
        }
            score = 0;
        }
    }

}
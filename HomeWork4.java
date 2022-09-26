import java.util.Random;
import java.util.Scanner;
/**
 *Java basic: HomeWork4
 *
 @author Muzaffar Eshonqulov
 @todo 14.09.2022
 @date 27.09.2022
 *Please check line from 40 to 90
 *
*/
class HomeWork4 {
    public static void main (String[] args) {
        //level 1
        Random random =new Random();
        Scanner scanner = new Scanner(System.in);
        /*int number = 0;
        int guess =-1;
        do {
            number = random.nextInt(10);
            for (int i =0; i < 3; i++) {
                System.out.print("Guess number [0...9]:");
                guess = scanner.nextInt();
                if (guess <number) {
                    System.out.println("Your number is less");
                }else if (guess > number) {
                    System.out.println("Your number is bigger");
                } else {
                    System.out.println("You win, you guess my number");
                    break;
                }
            }
            if (number !=guess) {
                System.out.println("You lose");
            }
            System.out.print("Repeat game : Yes-1: No-0:" );
        } while(scanner.nextInt()==1);
    */
    
    //level2
    //task1
        int number = 0;
        int guess =-1;
        do {
            number = random.nextInt(10);
            for (int i =0; i < 3; i++) {
                System.out.print("Guess number [0...9]:");
                guess = scanner.nextInt();
                if (guess <number) {
                    System.out.println("Your number is less");
                }else if (guess > number) {
                    System.out.println("Your number is bigger");
                } else {
                    System.out.println("You win, you guess my number");
                    break;
                }
            }
            if (number !=guess) {
                System.out.println("You lose");
            }
            System.out.print("Repeat game : Yes-Y: No-N:" );
        } while(scanner.next().equals("Y"));

    
    
    //task 2
        int colors = 0;
        int find =-1;
        do {
            colors = random.nextInt(6);
            for (int i =0; i < 3; i++) {
                System.out.print("Guess color [white,blue,green,dark,yellow,red]:");
                find = scanner.nextInt();
                if (find <colors) {
                    System.out.println("Your color is white");
                }else if (find > colors) {
                    System.out.println("Your color is green");
                } else {
                    System.out.println("You win, you guess color");
                    break;
                }
            }
            if (colors !=find){
                System.out.println("You lose");
            }
            System.out.print("Repeat game : Yes-Y: No-N:" );
        } while(scanner.next().equals("Y"));
    }
}

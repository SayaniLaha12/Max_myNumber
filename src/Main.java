
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //MINI PROJECT
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()* 100);
        int userNumber = 0;
        do {
            System.out.println("Guess my Number(1-100) : ");
            userNumber = sc.nextInt();
            if (userNumber == myNumber) {
                System.out.println("Correct number");
                break;
            } else if (userNumber < myNumber)
            {
                System.out.println("The number is too Large");
            }
            else {
                System.out.println("The number is too Small");
            }
        }while(userNumber >= 0) ;
            System.out.println("My number was:");
            System.out.println(myNumber);
        }

    }

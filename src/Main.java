import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int attempts = 1; //in very first attempt will be zero
        Random rand = new Random();
        int randInt = rand.nextInt(100) + 1; //this will create random number. Every time the program will run create random number between 1-100

        System.out.println("Please Enter a Number");
        while (true) {

            int n = sc.nextInt();

            if(n==randInt){
                System.out.println("You Have Guessed The Number in "+attempts+" attempts");
                break;
            }
            if(n<randInt){
                System.out.println("Please Enter a Higher Number");
            }
            if(randInt<n){
                System.out.println("Please Enter a Lower Number");
            }
            attempts++;
        }


    }
}
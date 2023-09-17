import java.util.Scanner;

public class guessTheNumber {
    public static void main(String[] args){

        /* generate a random number. Actually the class Math.random() generates value which are by default, doubles
        so i'll later cast the random value to an integer before using it in the program
         */

        int random_number = (int) (Math.random() * 101);
        //System.out.println(random_number);

        // create a new scanner to accept input form the user
        Scanner newinput = new Scanner(System.in);
        System.out.println("Ding! Ding! Ding!, Are you ready to make a lucky guess!!!!. The ball lies in your court now.");

        int user_input = (int) newinput.nextDouble();


        if (user_input == random_number) {
            System.out.println("You are smart. You made a good guess.");
        } else if (user_input == -1) {
            System.out.println("");

        } else {
            while (user_input != random_number) {
                System.out.println("Don't give up.Try again");
                user_input = (int)newinput.nextDouble();
            }
            System.out.println("You are smart. You made a good guess.");
        }

    };

}

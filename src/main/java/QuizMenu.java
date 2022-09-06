
import Model.QuizModel;
import Util.ConnectionUtil;

import java.sql.Connection;
import java.util.Scanner;

public class QuizMenu {

    public static void main(String[] args) {
        Connection conn = ConnectionUtil.getConnection();

        Boolean takingQuiz = true;
        while (takingQuiz) {
//
           Scanner sc = new Scanner(System.in);
//            String name = sc.nextLine();
//            System.out.println("Hello " + name + ", let's begin.");
//            // start the quiz by calling it with a method here for abstraction
            System.out.println("Hello, let's figure out what video games you might like! What is your name?");
          String userInput = sc.nextLine();
            if (userInput.equals("quit")) {
                takingQuiz = false;
            }else if(userInput.equals("Take quiz")){
                QuizModel quiz = new QuizModel();
                String videoGameInfo = sc.nextLine();
                //method for adding video games and inserting into dbs
        }else if(userInput.equals("x")){

        }
        // open the quiz in a while loop, begin first question roll
        //

        /*
        questions
        answers

         */
        //ConnectionUtil Try = new ConnectionUtil() {


        };
    }
}

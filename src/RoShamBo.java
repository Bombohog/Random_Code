/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 18-09-2020
 *
 * Description of program
 ********************************************/

import java.util.*;

public class RoShamBo {

    public static void main(String[] args) {
        RockPaperScissors();
    }
    
    public static void RockPaperScissors() {

        Scanner input = new Scanner(System.in);

        // The player chooses
        System.out.print("Choose rock(1), paper(2) or scissors(3): ");
        int player = input.nextInt();
        String playerChoice = null;

        if (player <= 3 && player >= 1){
            if (player == 1) {

                playerChoice = "rock";

            } else if (player == 2) {

                playerChoice = "paper";

            } else {

                playerChoice = "scissors";

            }
        } else {

            System.out.println("Something went wrong.");

        }

        // The computer chooses
        String computerChoice = null;

        Random rand = new Random();
        int randomNum = rand.nextInt((3 - 1) + 1) + 1;

        if (randomNum == 1){

            computerChoice = "rock";

        } else if (randomNum == 2){

            computerChoice = "paper";

        } else {

            computerChoice = "scissors";

        }

        // Funny loading so to speak
        System.out.println("Ro...Sham...Bo...\n" +
                "---'   ____)       (____   '---\n" +
                "      (_____)     (_____)      \n" +
                "      (_____)     (_____)      \n" +
                "      (____)       (____)      \n" +
                "---.__(___)         (___)__.---\n");

        // Result
        System.out.println("You choose: " + playerChoice + ", and the computer choose: " + computerChoice);

        String winLoose = null;
        
        if (player == 1 && randomNum == 1){

            winLoose = "Draw";
            System.out.println(
                    "---'   ____)       (____   '---\n" +
                    "      (_____)     (_____)      \n" +
                    "      (_____)     (_____)      \n" +
                    "      (____)       (____)      \n" +
                    "---.__(___)         (___)__.---");

        } else if (player == 1 && randomNum == 2){

            winLoose = "Lost";
            System.out.println(
                    "---'   ____)        ____(____   '---\n" +
                    "      (_____)      (______          \n" +
                    "      (_____)     (_______          \n" +
                    "      (____)       (_______         \n" +
                    "---.__(___)          (__________.---");

        } else if (player == 1 && randomNum == 3){

            winLoose = "Won";
            System.out.println(
                    "---'   ____)        ____(____   '---\n" +
                    "      (_____)      (______          \n" +
                    "      (_____)     (__________       \n" +
                    "      (____)            (____)      \n" +
                    "---.__(___)              (___)__.---");

        } else if (player == 2 && randomNum == 1){

            winLoose = "Won";
            System.out.println(
                    "---'   ____)____        (____   '---\n" +
                    "          ______)      (_____)      \n" +
                    "          _______)     (_____)      \n" +
                    "         _______)       (____)      \n" +
                    "---.__________)          (___)__.---");

        } else if (player == 2 && randomNum == 2){

            winLoose = "Draw";
            System.out.println("\n" +
                    "---'   ____)____         ____(____   '---\n" +
                    "          ______)       (______          \n" +
                    "          _______)     (_______          \n" +
                    "         _______)       (_______         \n" +
                    "---.__________)           (__________.---");

        } else if (player == 2 && randomNum == 3){

            winLoose = "Lost";
            System.out.println("\n" +
                    "---'   ____)____         ____(____   '---\n" +
                    "          ______)       (______          \n" +
                    "          _______)     (__________       \n" +
                    "         _______)            (____)      \n" +
                    "---.__________)               (___)__.---");

        } else if (player == 3 && randomNum == 1){

            winLoose = "Lost";
            System.out.println(
                    "---'   ____)____        (____   '---\n" +
                    "          ______)      (_____)      \n" +
                    "       __________)     (_____)      \n" +
                    "      (____)            (____)      \n" +
                    "---.__(___)              (___)__.---");

        } else if (player == 3 && randomNum == 2){

            winLoose = "Won";
            System.out.println(
                    "---'   ____)____         ____(____   '---\n" +
                    "          ______)       (______          \n" +
                    "       __________)     (_______          \n" +
                    "      (____)            (_______         \n" +
                    "---.__(___)               (__________.---");

        } else if (player == 3 && randomNum == 3){

            winLoose = "Draw";
            System.out.println(
                    "---'   ____)____         ____(____   '---\n" +
                    "          ______)       (______          \n" +
                    "       __________)     (__________       \n" +
                    "      (____)                 (____)      \n" +
                    "---.__(___)                   (___)__.---");

        }

        if (winLoose == "Won") {

            System.out.println("You win!!!");
            
        } else if (winLoose == "Lost") {

            System.out.println("You lost to the computer!!!");

        } else {

            System.out.println("!!!It's a Draw!!!");
            
        }
        
    }

}

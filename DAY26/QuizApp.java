import java.util.Scanner;
public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;//stores the user's score.
        int queschoice = 1;//track current ques no.
        int answer;//takes the answer from the user.
        System.out.println("\n===== QUIZ GAME =====");
        System.out.println("Welcome to the Quiz Application!");
        System.out.println("Total Questions: 5");
        System.out.println("Each correct answer gives 1 point.");
        System.out.print("\nAre you ready to start the quiz? (Y/N): ");
        char choice = sc.next().charAt(0);
        if(choice != 'Y' && choice != 'y'){//Ask the user to star the quiz.
            System.out.println("Quiz cancelled.");
            sc.close();
            return;
        }
        System.out.println("Let's Begin!!");
        while(queschoice <=5){//loop for all the questions.
            switch (queschoice){//display corresponding question.
                case 1:
                    System.out.println("\nQuestion "+queschoice+" of 5");
                    System.out.println("Q1. What is the capital of India?");
                    System.out.println("1. Mumbai");
                    System.out.println("2. New Delhi");
                    System.out.println("3. Kolkata");
                    System.out.println("4. Chennai");
                    System.out.print("Give your answer : ");
                    answer = sc.nextInt();
                    while(answer < 1 || answer > 4){//validation.
                        System.out.print("Invalid choice! Enter again (1-4): ");
                        answer = sc.nextInt();
                    }
                    if(answer == 2){//if correct answer given by user.
                        System.out.println("Correct answer!!");
                        score++;//it increase by 1 when a correct answer is given.
                        System.out.println("Current Score : "+score+"/5");
                    }else{
                        System.out.println("Wrong Answer! Correct answer is option 2.");
                        System.out.println("Current Score : "+score+"/5");
                    }
                    break;
                case 2:
                    System.out.println("\nQuestion "+queschoice+" of 5");
                    System.out.println("Q2. Which language is used for Android development?");
                    System.out.println("1. Java");
                    System.out.println("2. Python");
                    System.out.println("3. C");
                    System.out.println("4. HTML");
                    System.out.print("Give your answer : ");
                    answer = sc.nextInt();
                    while(answer < 1 || answer > 4){//validation.
                        System.out.print("Invalid choice! Enter again (1-4): ");
                        answer = sc.nextInt();
                    }
                    if(answer == 1){//if correct answer given by user.
                        System.out.println("Correct answer!!");
                        score++;//it increase by 1 when a correct answer is given.
                        System.out.println("Current Score : "+score+"/5");
                    }else{
                        System.out.println("Wrong Answer! Correct answer is option 1.");
                        System.out.println("Current Score : "+score+"/5");
                    }
                    break;
                case 3:
                    System.out.println("\nQuestion "+queschoice+" of 5");
                    System.out.println("Q3. How many bits are there in a byte?");
                    System.out.println("1. 4");
                    System.out.println("2. 16");
                    System.out.println("3. 8");
                    System.out.println("4. 32");
                    System.out.print("Give your answer : ");
                    answer = sc.nextInt();
                    while(answer < 1 || answer > 4){//validation.
                        System.out.print("Invalid choice! Enter again (1-4): ");
                        answer = sc.nextInt();
                    }
                    if(answer == 3){//if correct answer given by user.
                        System.out.println("Correct answer!!");
                        score++;//it increase by 1 when a correct answer is given.
                        System.out.println("Current Score : "+score+"/5");
                    }else{
                        System.out.println("Wrong Answer! Correct answer is option 3.");
                        System.out.println("Current Score : "+score+"/5");
                    }
                    break;
                case 4:
                    System.out.println("\nQuestion "+queschoice+" of 5");
                    System.out.println("Q4. How many continents are there on Earth?");
                    System.out.println("1. 5");
                    System.out.println("2. 6");
                    System.out.println("3. 7");
                    System.out.println("4. 8");
                    System.out.print("Give your answer : ");
                    answer = sc.nextInt();
                    while(answer < 1 || answer > 4){//validation.
                        System.out.print("Invalid choice! Enter again (1-4): ");
                        answer = sc.nextInt();
                    }
                    if(answer == 3){//if correct answer given by user.
                        System.out.println("Correct answer!!");
                        score++;//it increase by 1 when a correct answer is given.
                        System.out.println("Current Score : "+score+"/5");
                    }else{
                        System.out.println("Wrong Answer! Correct answer is option 3.");
                        System.out.println("Current Score : "+score+"/5");
                    }
                    break;
                case 5: 
                    System.out.println("\nQuestion "+queschoice+" of 5");     
                    System.out.println("Q5. Which keyword is used to create an object in Java?");
                    System.out.println("1. class");
                    System.out.println("2. new");
                    System.out.println("3. static");
                    System.out.println("4. void");  
                    System.out.print("Give your answer : ");
                    answer = sc.nextInt();
                    while(answer < 1 || answer > 4){//validation.
                        System.out.print("Invalid choice! Enter again (1-4): ");
                        answer = sc.nextInt();
                    }
                    if(answer == 2){//if correct answer given by user.
                        System.out.println("Correct answer!!");
                        score++;//it increase by 1 when a correct answer is given.
                        System.out.println("Current Score : "+score+"/5");
                    }else{
                        System.out.println("Wrong Answer! Correct answer is option 2.");
                        System.out.println("Current Score : "+score+"/5");
                    }    
                    break;
            }
            queschoice++;//move to next question untill all questions are attempted.
        }
        System.out.println("\n===== RESULT =====");
        System.out.println("Your Score: "+score+"/5");
        double percentage = (score*100.0)/5;//score in percentage.
        System.out.println("Percentage : "+percentage+"%");
        //feedback.
        if(score==5){
            System.out.println("Excellent!");
        }else if(score>=3){
            System.out.println("Good Job!");
        }else{
            System.out.println("Keep Practicing!");
        }
        sc.close();
    }
}
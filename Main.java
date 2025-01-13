import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        Scanner scan = new Scanner(System.in);
        System.out.println("Pick a level to play: Easy, Medium, Hard");
        String level = scan.nextLine();
        level = level.toLowerCase();
        if(level.equals("easy")){
           System.out.println("Guess my number from 1 to 20. You have 4 chances. Hints will come :)."); 
            int a = scan.nextInt();
        
            int round = 1;

            int ran = (int)(Math.random()*20 + 1);
            if(a>=1 && a<=20){
                if(a > ran){
                    System.out.println("HINT: too high");
                }
                else if(a == ran){
                    System.out.println("Correct. You have guessed the number. Wanna replay?");
                }
                else{
                    System.out.println("HINT: too low");
                }
            }
            else{
                System.out.println("Out of range.");
            }

            if((a != ran) && a>=1 && a<=20){
                while(round <4 && a !=ran){
                    round++;
                    a = scan.nextInt();
                    if(a<0 || a>20){
                        System.out.println("Out of range.");
                    }
                    else if(a > ran){
                        System.out.println("HINT: too high");
                    }
                    else if(a == ran){
                        System.out.println("Correct. You have guessed the number.");
                    }
                    else{
                        System.out.println("HINT: too low");
                    }
                    if(round == 4 && a != ran){
                        System.out.println("Sorry, you ran out of chances. Try again. Your number was " + ran + ".");
                    }                    
                    if(round == 3 && a != ran && ran%2 == 0){
                        System.out.println("Your number is even.");
                    }
                    if(a != ran && round == 3 && ran%2 != 0){
                        System.out.println("HINT: Your number is odd.");
                    }
                }
    
            }
        
        }
        if(level.equals("medium")){
            System.out.println("Guess my number from 1 to 500. You have 7 chances. Hints will come :).");
            int a = scan.nextInt();
        
            int round = 1;

            int ran = (int)(Math.random()*500 + 1);
            if(a>=1 && a<=500){
                if(a > ran){
                    System.out.println("HINT: too high");
                }
                else if(a == ran){
                    System.out.println("Correct. You have guessed the number. Wanna replay?");
                }
                else{
                    System.out.println("HINT: too low");
                }
            }
            else{
                System.out.println("Out of range.");
            }

            if((a != ran) && a>=1 && a<=500){
                while(round <7 && a !=ran){
                    round++;
                    a = scan.nextInt();
                    if(a<0 || a>500){
                        System.out.println("Out of range.");
                    }
                    else if(a > ran){
                        System.out.println("HINT: too high");
                    }
                    else if(a == ran){
                        System.out.println("Correct. You have guessed the number.");
                    }
                    else{
                        System.out.println("HINT: too low");
                    }
                    if(round == 7 && a != ran){
                        System.out.println("Sorry, you ran out of chances. Try again. Your number was "+ ran +".");
                    }                   
                    if(round == 4 && a != ran && ran%2 == 0){
                        System.out.println("HINT: Your number is even.");
                    }
                    if(a != ran && round == 4 && ran%2 != 0){
                        System.out.println("HINT: Your number is odd.");
                    }
                    if(round == 5 && a != ran && ran%3 == 0){
                        System.out.println("HINT: Your number is a multiple of 3.");
                    } 
                    if(round == 6 && a != ran && (Math.abs(ran-a)<=5)){
                        System.out.println("HINT: Your number is within 5 interval. (From 1 to 5, you can either subtract or add from the number.) ");
                    } 
                }
            }
        
        }
        if(level.equals("hard")){
            System.out.println("Guess my number from 1 to 1500. You have 10 chances. Hints will come :).");
            int a = scan.nextInt();
        
            int round = 1;

            int ran = (int)(Math.random()*1500 + 1);
            if(a>=1 && a<=1500){
                if(a > ran){
                    System.out.println("HINT: too high");
                }
                else if(a == ran){
                    System.out.println("Correct. You have guessed the number. Wanna replay?");
                }
                else{
                    System.out.println("HINT: too low");
                }
            }
            else{
                System.out.println("Out of range.");
            }

            if((a != ran) && a>=1 && a<=1500){
                while(round <10 && a !=ran){
                    round++;
                    a = scan.nextInt();
                    if(a<0 || a>1500){
                        System.out.println("Out of range.");
                    }
                    else if(a > ran){
                        System.out.println("HINT: too high");
                    }
                    else if(a == ran){
                        System.out.println("Correct. You have guessed the number.");
                    }
                    else{
                        System.out.println("HINT: too low");
                    }
                    if(round == 10 && a != ran){
                        System.out.println("Sorry, you ran out of chances. Try again. Your number was " + ran+".");
                    }
                    if(round == 4 && a != ran && ran%2 == 0){
                        System.out.println("HINT: Your number is even.");
                    }
                    if(a != ran && round == 4 && ran%2 != 0){
                        System.out.println("HINT: Your number is odd.");
                    }
                    if(round == 5 && a != ran && ran%3 == 0){
                        System.out.println("HINT: Your number is a multiple of 3.");
                    } 
                    if(round == 6 && a != ran && ran%5 == 0){
                        System.out.println("HINT: Your number is a multiple of 5.");
                    } 
                    if(round == 7 && a != ran && (Math.abs(ran-a)<=5)){
                        System.out.println("HINT: Your number is within 5 interval. (From 1 to 5, you can either subtract or add from the number.)");
                    }
                }
            }
        }
    }    
}

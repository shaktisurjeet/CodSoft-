import java.util.Random;
import java.util.*;

public class random_number_practice {
    public static void main (String args[]){

     Scanner sc = new Scanner (System.in);
     Random rand = new Random();
     
     int b,a;
     
     System.out.println("YOU HAVE 5 ROUND TO GUESS THE NUMBER");
     int count = 0;
      for(int n = 1; n<6; n++){
        a = rand.nextInt(100);
     System.out.println(n+".Guess the number: ");
      b = sc.nextInt();
      if(a==b){
        System.out.println("CORRECT "+ a +"=" +b);
        count++;
      }
      else {
        System.out.println("Its incorrect");
        System.out.println("Random number is :"+a);
      }
    }
     System.out.println(" GAME OVER ");

     System.out.println("you WON "+ count+" match");


   
    }
  }


    

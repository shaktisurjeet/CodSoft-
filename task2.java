import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks of English ");
        int a=sc.nextInt();
        System.out.println("Enter Marks of Hindi ");
        int b=sc.nextInt();
        System.out.println("Enter Marks of Math ");
        int c=sc.nextInt();
        System.out.println("Enter Marks of Science ");
        int d=sc.nextInt();
        System.out.println("Enter Marks of Social Studies");
        int e=sc.nextInt();
        int sum=a+b+c+d+e;  
        System.out.println("Total marks scored out of 500 is"+sum);
        int ads= sum/5;
        System.out.println("Percentage is"+ads);
        if(ads>=90)
            System.out.println("A grade obtained");
        
        else if(ads<90 && ads>=80)
            System.out.println("B grade obtained");
        
        else if (ads<80)
            System.out.println("C grade obtained");
        }
    
    }
    


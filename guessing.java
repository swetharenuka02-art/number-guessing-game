import java.util.*;

public class guessing{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        Random random=new Random();
        int number=random.nextInt(100)+1;
        while(true){
        System.out.println("enter the guessing value");

        int guess=s.nextInt();
        
            if(guess>number){
                System.out.println("too high value "+random);
            }
            else if(guess<number){
                System.out.println("too low value "+random);
            }
            else{
                System.out.println("correct"+random);
                break;
            }
        }
        s.close();

    }
}


package guseeing_game;
import static java.lang.Math.random;
import static java.lang.System.exit;
import java.util.Random;
import java.util.Scanner;



class guess
{
    int user;
    int system;
    int trail=0;
    guess()
    {
     Random r=new Random();
     system=r.nextInt(100);
    }
    
    public void  user()
    {
            if(trail<10)
            {
                boolean s=true;
                while(s)
                {
                Scanner sc =new Scanner(System.in);
                
                    System.out.println("enter number between 1 to 100:");
                    trail++;
                    user=sc.nextInt();

                    if(system==user)
                    {
                     
                        System.out.println("you guessed the number " +system+ "in " +trail+" trial");
                        switch(trail)
                        {
                            case 1:
                                System.out.println("you get 1000 points");
                                break; 
                            case 2:
                                System.out.println("you get 900 points");
                                break;
                            case 3:
                                System.out.println("you get 800 points");
                                break;
                            case 4:
                                System.out.println("you get 700 points");
                                break; 
                            case 5:
                                System.out.println("you get 600 points");
                                break; 
                            case 6:
                                System.out.println("you get 500 points");
                                break; 
                            case 7:
                                System.out.println("you get 400 points");
                                break; 
                            case 8:
                                System.out.println("you get 300 points");
                                break; 
                            case 9:
                                System.out.println("you get 200 points");
                                break;     
                            case 10:
                                System.out.println("you get 100 points");
                                break; 
                        }
                       s=false;
                    }

                    else if(trail<10 && user>system)
                    {
                        if(user-system>10)
                        {
                            System.out.println("too high");
                        }
                        else
                        {
                            System.out.println("little high"); 
                        }   
                    }

                    else if(trail<10 && user<system)
                    {
                        if(system-user>10)
                        {
                            System.out.println("too low");
                        }
                        else
                        {
                            System.out.println("little low"); 
                        }   
                    }


                else
                {
                    System.out.println("your attempt is out of trail");
                    s=false;
                }
                }
        }
    }
}   

public class game 
{
    public static void main(String args[])
    {
        int choice=0;
        boolean a=true;
       Scanner sc =new Scanner(System.in);
       while(a)
       { 
            System.out.println("enter a number:\n 1) for play \n 2)exit");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                     guess g=new guess();
                     g.user();
                     break;
                case 2:
                    System.out.println("you just exited the game");
                    a=false;
                    break;
                default:
                    System.out.println("invalid choice");
            }
       }
        
        
    }
    
}

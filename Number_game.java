import java.util.Scanner;
public class Number_Game{
	public static void main(String[]args){
		Scanner S= new Scanner(System.in);
		int chances=6;
		int finals=0;
		boolean playAgain=true;
		System.out.println("***** Welcome to the number game! *****");
		System.out.println("Hello Gamer you have about "+chances+" chances to win the game");
		while(playAgain){
			int rand=getrandN(1,100);
			boolean guess=false;
			for(int i=0;i<chances;i++){
				
		        System.out.println("chance "+(i+1)+" Enter your guess:");
		        int user=S.nextInt();
		        if(user==rand){
		        	guess=true;
		        	finals+=1;
		        	System.out.println("You Won it.");
		        	break;
		        }
		        else if(user>rand){
		        	System.out.println("Too High");

		        }
		        else{
		        	System.out.println("Too Low");
		        }
		   	}
		   	if(guess==false){
		   		System.out.println("Sorry Gammer you Lost the chnaces.The number is "+rand);
		   	}
		   	System.out.println("Do You Want To Play Again ?");
		   	String pA=S.next();
		   	playAgain=pA.equalsIgnoreCase("yes");
		   }
		   System.out.println("That's it Gammer , Hope you Enjoy the game");
		   System.out.println("Here is your Score Gammer "+finals);
	}
		   public static int getrandN(int min,int max){
		   	return(int)(Math.random()*(max-min+1)+min);
          }
}
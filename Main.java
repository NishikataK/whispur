import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int x,db=1,nu;
		String co;
		double a=0,b=0,d=0,i,c=0;
		char ch;
		System.out.println("Welcome to Whispur ChatBot");
		System.out.println("This bot was created by nishiwata-kun \n"+"check him on github");
		System.out.println("Also check out the sponsor on youtube: Dash Minecrafter");
		System.out.println("This is just a Pet Project the actual project might vary");
		System.out.println("Would you like to start?"); 
		System.out.println("Type y for Yes and n for no"); 
		ch=sc.next(".").charAt(0);
		if(ch=='y')
		{
			System.out.println("Welcome to Whispur");
			System.out.println("Here is a List of my basic tasks I am programmed to perform:-");
			System.out.println("1. Calculator: Gives you a simple menu based calculator!");
			System.out.println("2. Game: Plays a guessing game with you and keeps score apart");
			System.out.println("3. Joke: Tells a joke from its jokebook containing lots of dank jokes");
			System.out.println("4. Fun Fact: Tells a fun fact basing on the topic chosen!");
			System.out.println("5. Store: Stores your info you give and will print on leaving!");
			System.out.println("6: Taunt: Says whatever you say");
			System.out.println("7. Roast: Roast you like a small boy or gives you lines to roast");
			System.out.println("8. Chat: Chats on various topics- Feature coming soon!");
			System.out.println("Enter the required number");
			x=sc.nextInt();
			switch(x){
			
				case 1:System.out.println("Welcome to calculator");
						System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Square Root");
		System.out.println("6. Cube Root");
		
		System.out.println("Enter Your Choice");
		i=sc.nextInt();
		if(i==1)
		{
			System.out.println("Enter two Numbers to add");
			a=sc.nextDouble();
			b=sc.nextDouble();
			c=a+b;
		}
		if(i==2)
		{
			System.out.println("Enter two numbers two Substract");
			a=sc.nextDouble();
			b=sc.nextDouble();
			c=a-b;
		}
		if(i==3)
		{
			System.out.println("Enter to Numbers to Multiply");
			a=sc.nextDouble();
			b=sc.nextDouble();
			c=a*b;
		}
		if(i==4)
		{
			System.out.println("Enter two Numbers to Divide");
			a=sc.nextDouble();
			b=sc.nextDouble();
			c=a/b;
		}
		if(i==5)
		{
			System.out.println("Enter a number for square root");
			a=sc.nextDouble();
			c=Math.sqrt(a);
		}
		if(i==6)
		{
			System.out.println("Enter a Number for cube root");
			a=sc.nextDouble();
			c=Math.cbrt(a);
		}
		System.out.println(c);
		if(i==4)
		{
			System.out.println("Do you want the remainder?");
			System.out.println("Press 1 for yes and 2 for no");
			int c2=sc.nextInt();
			if(c2==1)
			{
				d=a%b;
			    System.out.println("The Remainder is="+d);
			}
			else
			{System.out.println("Nevermind");
		        System.out.println("Thanks for using!");}
				       
				
			}
			 break;
		case 2:System.out.println("Welcome to guessing game!");
		System.out.println("Here are the rules:");
	    int ar=0; System.out.println("1.You have to guess the number and you have 5 tries");
		System.out.println("2.Numbers between 1 to 10");
		System.out.println("3. Only press numbers between 1 and 10");
		System.out.println("4. Each round number will be changed");
		System.out.println("5. For pressing the correct number, you will recieve get a point");
		while(db!=0){
		for(i=0;i<5;i++){
			System.out.println("Guess a number and type");
			int ru=(int)(Math.random()*10)+1;
			nu=sc.nextInt();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			
			System.out.println("Correct Number was "+ru);
			System.out.println();
			System.out.println();
			System.out.println();
			
			if(nu==ru){System.out.println("Correct!");
		ar=ar+1;}}System.out.println(); System.out.println(); System.out.println(); System.out.println();
	System.out.println("Points: "+ar);
	System.out.println();
	System.out.println();
	System.out.println();
	
	    if(ar==5)
			System.out.println("GENIUS!!!");
		else if(ar==4)
		System.out.println("Impressive!");
		else if(ar==3)
		System.out.println("Amazing");
		else if(ar==2)
		System.out.println("Good work there");
		else if(ar==1)
		System.out.println("Well atleast you tried!?");
		else 
			System.out.println("Better luck next time");
		 System.out.println("Wanna play again?, 1 for yes 0 for no");
		db=sc.nextInt();break;}
			}			
			
		}
		
	}
}
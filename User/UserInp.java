package User;

import java.util.Scanner;

public class UserInp {
	
	public static int superSwitch(int g,int t){
		int a=100,b=45,c=65,option=g,Total=t;
	Scanner input = new Scanner (System.in);
		
	switch(option) {
	case 1:
		System.out.println(a+" lei");
		System.out.println("How much?");
		int quan = input.nextInt();
		int x = mySecondFunction (a,quan);
		Total=Total+x;
		
		break;
	
	case 2:
		System.out.println(b+" lei");
		System.out.println("How much?");
		int quan1 = input.nextInt();
		int y = mySecondFunction (b,quan1);
		Total=Total+y;
		
		break;
	
	case 4:
		System.out.println(c+" lei");
		System.out.println("How much?");
		int quan2 = input.nextInt();
		int l = mySecondFunction (c,quan2);
		Total=Total+l;
		
		break;
	
	case 3:
		System.out.println("No sushi today, choose salad\n [ Yess=1 or No=0]");
		int e = input.nextInt();
		if(e==1){
			System.out.println("This will be cost "+c+" lei");
			System.out.println("How much?");
			int quan3 = input.nextInt();
			int k = mySecondFunction (c,quan3);
			Total=Total+k;
		
		} else {	
			break;
		}
	break;
	default: System.out.println("Whaaat?");
	}
return Total; 
	}
//second function order Sum
		public static int mySecondFunction(int c,int x){
		
		return c*x;	
		}
		public static void myFunction(){	
			System.out.println("Would you like \nto make a new order?\n (Yes=1/No=0)");
		}




}

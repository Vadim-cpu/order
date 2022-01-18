package User;
import java.util.Scanner;
public class MainMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
					int z=0,Total=0;
					Scanner input = new Scanner( System.in );
					Otput.menuFirst();
					int or = input.nextInt();
					
					while (or==1){
						User.UserInp.myFunction();
						int order = input.nextInt();
						or=order;
						if(order==1) {
					Otput.menuSecond();
					 int zakaz = input.nextInt();
					
					 	while (z<zakaz) {
					 		System.out.println("What point?");
					 		int option = input.nextInt();
				
					 		int f = User.UserInp.superSwitch(option,Total);
					 		Total=f;
					 		z++;
					 	}
					 	if (z>=3){
							
							System.out.println("****Free delivery!!!<<===");
							}
							else {
								System.out.println("****No delivery<<===");
							}

							System.out.println("Total of order="+Total+"\n\n");
							
								}
								else {
									System.out.println("End of the order!!!!");
								}
							}
							
				}			 
					
		
}



import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListLab {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>() ;
		Integer request;
		Integer number;
		do {
			display();
			request = input.nextInt();
		
				switch(request){
				case 1:
					System.out.println("Enter the number you want to add:");
					number = input.nextInt();
					list.add(number);
					break;
				case 2:
					System.out.println("Enter the number you want to remove from the ArrayList");
					number = input.nextInt();
					int i = 0;
					while(i< list.size()){
						if(list.get(i) == number){
							list.remove(i);
						}
						else {
							i++;
						}
					}
					break;
				case 3:
					
						System.out.println("The size of the ArrayList is: "+list.toString() +list.size());
					
					break;
					
				default:
					System.out.println("Warning!Please enter a valid number!");
					break;
				}
			
			
		}while(request != 0);
		
	}
	public static void display(){
		System.out.println("Please enter what you want to do to the ArrayList:");
		System.out.println("0. Exit.\n"
				+ "1. Add a number to the ArrayList.\n"
				+ "2. Remove all of a number of the ArrayList.\n"
				+ "3. Get the size of the ArrayList");
	}
	public static void displayInfo2(){
		System.out.println("");
	}
}

import java.util.Scanner;
//this is a basic program for get if input year is Leap or Not.
class Leap
{
	public static void main(String[] args)
	{
		System.out.println("Enter Year : ");
		Scanner sc1=new Scanner(System.in);
		int year=sc1.nextInt();
		if (year%4==0){
			if (year %100==0){
				if(year %400==0){
					System.out.println("Leap Year.");
				}
				else{
					System.out.println("Not a Leap Year.");
				}
			}
			else{
				System.out.println("Leap Year.");
			}
		}
		else{
			System.out.println("Not a Leap Year.");
		}
		
	}

}

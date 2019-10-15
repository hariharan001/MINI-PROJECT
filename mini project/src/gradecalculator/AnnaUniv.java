package gradecalculator;
import java.util.Scanner;


public class AnnaUniv 
	{
	

	public static void main(String[]args)
	{

				System.out.println("1. TO CALCULATE YOUR GPA FOR 3 SUBJECTS");
				System.out.println("2. TO CALCULATE YOUR GPA FOR 8 SUBJECTS");
				System.out.println("3. TO CALCULATE YOUR GPA FOR 9 SUBJECTS");
				System.out.print("Enter your choice:");
				Scanner r = new Scanner(System.in);
				int option=r.nextInt();
				
				
				switch(option)
				{
				case 1:
					
					System.out.print("ENTER THE GRADE OF SUBJECT 1: ");
					int  x1=r.nextInt();
				
						
					System.out.print("ENTER THE CREDITS OF SUBJECT 1: ");
					int x2=r.nextInt();
					int x3=x1*x2;
					
				
					
					System.out.print("ENTER THE GRADE OF SUBJECT 2: ");
					int  x4=r.nextInt();
					System.out.print("ENTER THE CREDITS OF SUBJECT 2: ");
					int x5=r.nextInt();
					int x6=x4*x5;
					
				
					
					System.out.print("ENTER THE GRADE OF SUBJECT 3: ");
					int x7=r.nextInt();
					System.out.print("ENTER THE CREDITS OF SUBJECT 3: ");
					int x8=r.nextInt();
					int x9=x7*x8;
					int gpa=(x3+x6+x9)/(x2+x4+x8);
					System.out.println("GPA :"+gpa);
					break;
				
				case 2:
				
					System.out.println("ENTER THE GRADE OF SUBJECT 1: ");
					int  x10=r.nextInt();
					System.out.print("ENTER THE CREDITS OF SUBJECT 1: ");
					int x11=r.nextInt();
					int x12=x10*x11;
					
				
					
					System.out.print("ENTER THE GRADE OF SUBJECT 2: ");
					int  x13=r.nextInt();
					System.out.print("ENTER THE CREDITS OF SUBJECT 2: ");
					int x14=r.nextInt();
					int x15=x13*x14;
					
				
					
					System.out.print("ENTER THE GRADE OF SUBJECT 3: ");
					int x16=r.nextInt();
					System.out.print("ENTER THE CREDITS OF SUBJECT 3: ");
					int x17=r.nextInt();
					int x18=x16*x17;
					
					System.out.print("ENTER THE GRADE OF SUBJECT 4: ");
					int  x19=r.nextInt();
				    System.out.print("ENTER THE CREDITS OF SUBJECT 4: ");
					int x20=r.nextInt();
					int x21=x19*x20;
					
				
					
					System.out.print("ENTER THE GRADE OF SUBJECT 5: ");
					int  x22=r.nextInt();
					System.out.print("ENTER THE CREDITS OF SUBJECT 5: ");
					int x23=r.nextInt();
					int x24=x22*x23;
					
				
					
					System.out.print("ENTER THE GRADE OF SUBJECT 6: ");
					int x25=r.nextInt();
					System.out.print("ENTER THE CREDITS OF SUBJECT 6: ");
					int x26=r.nextInt();
					int x27=x25*x26;
					
					System.out.print("ENTER THE GRADE OF SUBJECT 7: ");
					int  x28=r.nextInt();
					System.out.print("ENTER THE CREDITS OF SUBJECT 7: ");
					int x29=r.nextInt();
					int x30=x28*x29;
					
				
					
					System.out.print("ENTER THE GRADE OF SUBJECT 8: ");
					int  x31=r.nextInt();
					System.out.print("ENTER THE CREDITS OF SUBJECT 8: ");
					int x32=r.nextInt();
					int x33=x31*x32;
					
					
					double gpa1=(x12+x15+x18+x21+x24+x27+x30+x33)/(x11+x14+x17+x20+x23+x26+x29+x32);
					System.out.println(" GPA: "+gpa1);
					break;
	
				case 3:
					
					System.out.println("ENTER THE GRADE OF SUBJECT 1: ");
					int  x37=r.nextInt();
					System.out.print("ENTER THE CREDITS OF SUBJECT 1: ");
					int x38=r.nextInt();
					int x39=x38*x37;
					
				
					
					System.out.print("ENTER THE GRADE OF SUBJECT 2: ");
					int  x40=r.nextInt();
					System.out.print("ENTER THE CREDITS OF SUBJECT 2: ");
					int x41=r.nextInt();
					int x42=x40*x41;
					
				
					
					System.out.print("ENTER THE GRADE OF SUBJECT 3: ");
					int x43=r.nextInt();
					System.out.print("ENTER THE CREDITS OF SUBJECT 3: ");
					int x44=r.nextInt();
					int x45=x43*x44;
					
					System.out.print("ENTER THE GRADE OF SUBJECT 4: ");
					int  x46=r.nextInt();
				    System.out.print("ENTER THE CREDITS OF SUBJECT 4: ");
					int x47=r.nextInt();
					int x48=x46*x47;
					
				
					
					System.out.print("ENTER THE GRADE OF SUBJECT 5: ");
					int  x49=r.nextInt();
					System.out.print("ENTER THE CREDITS OF SUBJECT 5: ");
					int x50=r.nextInt();
					int x51=x49*x50;
					
				
					
					System.out.print("ENTER THE GRADE OF SUBJECT 6: ");
					int x52=r.nextInt();
					System.out.print("ENTER THE CREDITS OF SUBJECT 6: ");
					int x53=r.nextInt();
					int x54=x52*x53;
					
					System.out.print("ENTER THE GRADE OF SUBJECT 7: ");
					int  x55=r.nextInt();
					System.out.print("ENTER THE CREDITS OF SUBJECT 7: ");
					int x56=r.nextInt();
					int x57=x55*x56;
					
				
					
					System.out.print("ENTER THE GRADE OF SUBJECT 8: ");
					int  x58=r.nextInt();
					System.out.print("ENTER THE CREDITS OF SUBJECT 8: ");
					int x59=r.nextInt();
					int x60=x58*x59;
					
					System.out.print("ENTER THE GRADE OF SUBJECT 9: ");
					int  x61=r.nextInt();
					System.out.print("ENTER THE CREDITS OF SUBJECT 9: ");
					int x62=r.nextInt();
					int x63=x61*x62;
					
					System.out.print("ENTER THE GRADE OF SUBJECT 9: ");
					int  x64=r.nextInt();
					System.out.print("ENTER THE CREDITS OF SUBJECT 9: ");
					int x65=r.nextInt();
					int x66=x64*x65;
					double gpa2=(x39+x42+x45+x48+x51+x54+x57+x60+x63+x66)/(x38+x41+x44+x47+x50+x53+x56+x59+x62+x65);
					System.out.println(" GPA: "+gpa2);
					break;
				default:
					System.out.println("Please enter a valid data!!!");
				
				}

		     }
    	}
				
				
			

		
	



	

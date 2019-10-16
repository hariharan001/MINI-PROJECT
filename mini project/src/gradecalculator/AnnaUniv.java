package gradecalculator;
import java.util.Scanner;


public class AnnaUniv 
	{
	

	public static void main(String[]args)
	{

				System.out.println("1. TO CALCULATE YOUR GPA FOR 3 SUBJECTS");
				System.out.println("2. TO CALCULATE YOUR GPA FOR 8 SUBJECTS");
				System.out.println("3. TO CALCULATE YOUR GPA FOR 9 SUBJECTS");
				System.out.println("4. TO CALCULATE YOUR CGPA ");
				System.out.print("Enter your choice:");
				Scanner r = new Scanner(System.in);
				int option=r.nextInt();
				
				
				switch(option)
				{
				case 1:
					
					System.out.print("ENTER THE GRADE OF SUBJECT 1: ");
					String  x1=r.next();
				    System.out.print("ENTER THE CREDITS OF SUBJECT 1: ");
					float x2=r.nextFloat();
					float a11=Conversion.strtoINT(x1,x2);
					
					
				
					
					System.out.print("ENTER THE GRADE OF SUBJECT 2: ");
					String x4=r.next();
					System.out.print("ENTER THE CREDITS OF SUBJECT 2: ");
					float x5=r.nextFloat();
					float a12=Conversion.strtoINT(x4,x5);
					
				
					
					System.out.print("ENTER THE GRADE OF SUBJECT 3: ");
					String x7=r.next();
					System.out.print("ENTER THE CREDITS OF SUBJECT 3: ");
					float x8=r.nextFloat();
					float a13=Conversion.strtoINT(x7,x8);
					float gpa=(a11+a12+a13)/(x2+x5+x8);
					System.out.println("GPA :"+gpa);
					break;
				
				case 2:
				
					System.out.println("ENTER THE GRADE OF SUBJECT 1: ");
					String  x10=r.next();
					System.out.print("ENTER THE CREDITS OF SUBJECT 1: ");
					float x11=r.nextFloat();
					float a14=Conversion.strtoINT(x10,x11);
					
					
				
					
					System.out.print("ENTER THE GRADE OF SUBJECT 2: ");
					String  x13=r.next();
					System.out.print("ENTER THE CREDITS OF SUBJECT 2: ");
					float x14=r.nextFloat();
					float a15=Conversion.strtoINT(x13,x14);
					
					
				
					
					System.out.print("ENTER THE GRADE OF SUBJECT 3: ");
					String x16=r.next();
					System.out.print("ENTER THE CREDITS OF SUBJECT 3: ");
					float x17=r.nextFloat();
					float a16=Conversion.strtoINT(x16,x17);
					
					System.out.print("ENTER THE GRADE OF SUBJECT 4: ");
					String  x19=r.next();
				    System.out.print("ENTER THE CREDITS OF SUBJECT 4: ");
				    float x20=r.nextFloat();
					float a17=Conversion.strtoINT(x19,x20);
				 
					
				
					
					System.out.print("ENTER THE GRADE OF SUBJECT 5: ");
					String x22=r.next();
					System.out.print("ENTER THE CREDITS OF SUBJECT 5: ");
					float x23=r.nextFloat();
					float a18=Conversion.strtoINT(x22,x23);
					
					
				
					
					System.out.print("ENTER THE GRADE OF SUBJECT 6: ");
					String x25=r.next();
					System.out.print("ENTER THE CREDITS OF SUBJECT 6: ");
					float x26=r.nextFloat();
					float a19=Conversion.strtoINT(x25,x26);
					
					
					System.out.print("ENTER THE GRADE OF SUBJECT 7: ");
					String  x28=r.next();
					System.out.print("ENTER THE CREDITS OF SUBJECT 7: ");
					float x29=r.nextFloat();
					float a20=Conversion.strtoINT(x28,x29);
					
					
				
					
					System.out.print("ENTER THE GRADE OF SUBJECT 8: ");
					String  x31=r.next();
					System.out.print("ENTER THE CREDITS OF SUBJECT 8: ");
					float x32=r.nextFloat();
					float a21=Conversion.strtoINT(x31,x32);
					
					
					
					double gpa1=(a14+a15+a16+x17+a18+a19+a20+a21)/(x11+x14+x17+x20+x23+x26+x29+x32);
					System.out.println(" GPA: "+gpa1);
					break;
	
				case 3:
					
					System.out.println("ENTER THE GRADE OF SUBJECT 1: ");
					String  x37=r.next();
					System.out.print("ENTER THE CREDITS OF SUBJECT 1: ");
					float x38=r.nextFloat();
					float a22=Conversion.strtoINT(x37,x38);
					
					
				
					
					System.out.print("ENTER THE GRADE OF SUBJECT 2: ");
					String  x40=r.next();
					System.out.print("ENTER THE CREDITS OF SUBJECT 2: ");
					float x41=r.nextFloat();
					float a23=Conversion.strtoINT(x40,x41);
					
				
					
					System.out.print("ENTER THE GRADE OF SUBJECT 3: ");
					String x43=r.next();
					System.out.print("ENTER THE CREDITS OF SUBJECT 3: ");
					float x44=r.nextFloat();
					float a24=Conversion.strtoINT(x43,x44);
					
					System.out.print("ENTER THE GRADE OF SUBJECT 4: ");
					String  x46=r.next();
				    System.out.print("ENTER THE CREDITS OF SUBJECT 4: ");
				    float x47=r.nextFloat();
				    float a25=Conversion.strtoINT(x46,x47);
					
				
					
					System.out.print("ENTER THE GRADE OF SUBJECT 5: ");
					String  x49=r.next();
					System.out.print("ENTER THE CREDITS OF SUBJECT 5: ");
					float x50=r.nextFloat();
					float a26=Conversion.strtoINT(x49,x50);
					
				
					
					System.out.print("ENTER THE GRADE OF SUBJECT 6: ");
					String x52=r.next();
					System.out.print("ENTER THE CREDITS OF SUBJECT 6: ");
					float x53=r.nextFloat();
					float a27=Conversion.strtoINT(x52,x53);
					
					System.out.print("ENTER THE GRADE OF SUBJECT 7: ");
					String  x55=r.next();
					System.out.print("ENTER THE CREDITS OF SUBJECT 7: ");
					float x56=r.nextFloat();
					float a28=Conversion.strtoINT(x55,x56);
					
				
					
					System.out.print("ENTER THE GRADE OF SUBJECT 8: ");
					String  x58=r.next();
					System.out.print("ENTER THE CREDITS OF SUBJECT 8: ");
					float x59=r.nextFloat();
					float a29=Conversion.strtoINT(x58,x59);
					
					System.out.print("ENTER THE GRADE OF SUBJECT 9: ");
					String  x61=r.next();
					System.out.print("ENTER THE CREDITS OF SUBJECT 9: ");
					float x62=r.nextFloat();
					float a30=Conversion.strtoINT(x61,x62);
					
					
					float gpa2=(a22+a23+a24+a25+a26+a27+a28+a29+a30)/(x38+x41+x44+x47+x50+x53+x56+x59+x62);
					System.out.println(" GPA: "+gpa2);
					break;
				case 4:
					System.out.println("ENTER THE NUMBER OF COMPLETED SEMESTERS");
					float g=r.nextFloat();
					float b1=Conversion.cgpa(g);
					System.out.println("YOUR CGPA IS:"+b1);
					break;
					
				default:
					System.out.println("Please enter a valid data!!!");
				
				}

		     }
    	}
				
				
			

		
	



	

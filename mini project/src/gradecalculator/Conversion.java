package gradecalculator;
import java.lang.*;
import java.util.Scanner;

public class Conversion 
	{
	public static float strtoINT(String x1,float x2)
	{
		
		float j1,x=0;
		
		
		if(x1.equals("b"))
		{
			j1=6.0f;	
			x=j1*x2;
		}    
		
		else if (x1.equals("bplus"))
		{
			j1=7.0f;
		    x=j1*x2;
		}
		
		
		else if (x1.equals("a"))
		{
			j1=8.0f;
			x=j1*x2;
		}
		
		else if (x1.equals("aplus"))
		{
			j1=9.0f;
			x=j1*x2;
		}
		else if (x1.equals("o"))
		{
			j1=10.0f;
			x=j1*x2;
		}
		else
		{
			System.out.println("Enter a valid grade");
			return (Float) null;
		}
		return x;		
	}
	public static float cgpa(float g)
	{
		float f1=0;
		Scanner sc=new Scanner(System.in);
		if(g==2)
		{
			
			
			System.out.println("ENTER THE GPA OF SEM 1 :");
			 float q1=sc.nextFloat();
			System.out.println("ENTER THE GPA OF SEM 2 :");
			float q2=sc.nextFloat();
			 f1=(q1+q2)/2;
		}    
		
		else if (g==3)
		{

			System.out.println("ENTER THE GPA OF SEM 1 :");
			 float q1=sc.nextFloat();
			System.out.println("ENTER THE GPA OF SEM 2 :");
			float q2=sc.nextFloat();
			System.out.println("ENTER THE GPA OF SEM 3 :");
			 float q3=sc.nextFloat();
			 f1=(q1+q2+q3)/3;
		}
		
		else if (g==4)
		{

			System.out.println("ENTER THE GPA OF SEM 1 :");
			 float q1=sc.nextFloat();
			System.out.println("ENTER THE GPA OF SEM 2 :");
			float q2=sc.nextFloat();
			System.out.println("ENTER THE GPA OF SEM 3 :");
			 float q3=sc.nextFloat();
			 System.out.println("ENTER THE GPA OF SEM 4 :");
			 float q4=sc.nextFloat();
		 f1=(q1+q2+q3+q4)/4;
		}
		
		
		else if (g==5)
		{

			System.out.println("ENTER THE GPA OF SEM 1 :");
			float q1=sc.nextFloat();
			System.out.println("ENTER THE GPA OF SEM 2 :");
			float q2=sc.nextFloat();
			System.out.println("ENTER THE GPA OF SEM 3 :");
			float q3=sc.nextFloat();
			 System.out.println("ENTER THE GPA OF SEM 4 :");
			 float q4=sc.nextFloat();
			System.out.println("ENTER THE GPA OF SEM 5 :");
			float q5=sc.nextFloat();
			 f1=(q1+q2+q3+q4+q5)/5;
		}
		
		else if (g==6)
		{

			System.out.println("ENTER THE GPA OF SEM 1");
			float q1=sc.nextFloat();
			System.out.println("ENTER THE GPA OF SEM 2");
			float q2=sc.nextFloat();
			System.out.println("ENTER THE GPA OF SEM 3");
			float q3=sc.nextFloat();
			 System.out.println("ENTER THE GPA OF SEM 4");
			 float q4=sc.nextFloat();
			System.out.println("ENTER THE GPA OF SEM 5");
			float q5=sc.nextFloat();
			System.out.println("ENTER THE GPA OF SEM 6");
			float q6=sc.nextFloat();
			 f1=(q1+q2+q3+q4+q5+q6)/6;
		}
		
		else if (g==7)
		{

			System.out.println("ENTER THE GPA OF SEM 1 :");
			float q1=sc.nextFloat();
			System.out.println("ENTER THE GPA OF SEM 2 :");
			float q2=sc.nextFloat();
			System.out.println("ENTER THE GPA OF SEM 3 :");
			float q3=sc.nextFloat();
			 System.out.println("ENTER THE GPA OF SEM 4 :");
			 float q4=sc.nextFloat();
			System.out.println("ENTER THE GPA OF SEM 5 :");
			float q5=sc.nextFloat();
			System.out.println("ENTER THE GPA OF SEM 6 :");
			float q6=sc.nextFloat();
			System.out.println("ENTER THE GPA OF SEM 7 :");
			float q7=sc.nextFloat();
			
			 f1=(q1+q2+q3+q4+q5+q6+q7)/7;
		}
		
		else if (g==8)
		{

			System.out.println("ENTER THE GPA OF SEM 1 :");
			float q1=sc.nextFloat();
			System.out.println("ENTER THE GPA OF SEM 2 :");
			float q2=sc.nextFloat();
			System.out.println("ENTER THE GPA OF SEM 3 :");
			float q3=sc.nextFloat();
			 System.out.println("ENTER THE GPA OF SEM 4 :");
			 float q4=sc.nextFloat();
			System.out.println("ENTER THE GPA OF SEM 5 :");
			float q5=sc.nextFloat();
			System.out.println("ENTER THE GPA OF SEM 6 :");
			float q6=sc.nextFloat();
			System.out.println("ENTER THE GPA OF SEM 7 :");
			float q7=sc.nextFloat();
			System.out.println("ENTER THE GPA OF SEM 8 :");
			float q8=sc.nextFloat();
			 f1=(q1+q2+q3+q4+q5+q6+q7+q8)/8;
		}
		
		return f1;
	
		
			}
	}

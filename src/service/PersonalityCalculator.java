package service;
import java.util.Arrays;
public class PersonalityCalculator{
	
	
	public int[] findAnswers(String str)
	{
		String s[]=str.split(",");
		int n=s.length;
		int a[]=new int[n];
		int i=0;
		for(String s1:s)
		{
			a[i]=Integer.parseInt(s1);
			i++;
			
		}
		return a;
		
	}
	
	public String findYourBrainType(String str)
	{ 
		int a[]=findAnswers(str);
		int x=a[0]+a[1]+a[2]+a[4]+a[7]+a[9]+a[10]+a[11]+a[13]+a[17]+a[19];
		int y=a[3]+a[5]+a[6]+a[12]+a[14]+a[15]+a[16]+a[18];
		int z=66-x+y;
		System.out.println("Yor total score "+z);
		if((z>=22)&&(z<=55))
			return "Left-brained ";
		if((z>=56)&&(z<=64))
			return "No clear preference ";
		if((z>=65)&&(z<=100))
             return "Right-brained";
		return "false";		
				
	}
	
	
}


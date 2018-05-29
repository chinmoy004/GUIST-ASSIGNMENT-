import java.util.Scanner; //Submitted by Chinmoy Medhi , Roll -150103001
public class main {
	public static void main(String args[])
	{
		String S; int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 if u want to see  FREQUENCY of characters in a String or Enter 2 to the see  ALTERNATING String");
		x= sc.nextInt();
		System.out.println("Enter the String");
		S= sc.next();
		sc.close();
		switch(x)
		{
		case 1 : { Freq(S);break;}
		case 2 :{ Alter(S);break;}
		}
		
		
		
	}
// FUNCTION TO COUNT THE NO. OF UNIQUE CHARACTERS	
public static void Freq(String S)
{
	char String_Arr[] = new char[100];
	char String_Uniq[] = new char[100];	
	int str_Counter[] = new int[100];
	
	for(int i=0;i<S.length();i++)
		String_Arr[i] = S.charAt(i);
		
	Boolean IsUniq;
	int i,j,k=0;
	for(i=0;i<S.length();i++) // HERE WE ARE FINDING THE UNIQUE CHARACTER IN THE STRING
	{
		IsUniq=false;
		for(j=0;j<k;j++)
		{
			if(String_Uniq[j]==String_Arr[i])
			{
				IsUniq=true;
				break;
			}
		}
		if(!IsUniq)
		{
			String_Uniq[k]=String_Arr[i];
			k++;
		}	
	}
	
	for(i=0;i<k;i++)
		str_Counter[i] = 0;
	
	for(i=0;i<k;i++) // HERE WE ARE COUNTING
	{	
		for(j=0;j<S.length();j++)
		{
			if(String_Uniq[i]==String_Arr[j])
			{
				str_Counter[i]+=1;
			}
		}
	}
	
	for(i=0;i<k;i++)
	{
		System.out.println("Freq of  "+String_Uniq[i]+" is  = "+str[i]);
	}

}
// FUNCTION TO CAPITALIZE THE ALTERNATING LETTERS	
public static void Alter(String S)
{
	char String_Arr[] = new char[100];
	S=S.toLowerCase();
	for(int i=0;i<S.length();i++)
		String_Arr[i] = S.charAt(i);	
		
	int c;
	for(int i=0;i<S.length();i++)
	{
		if(String_Arr[i]>=97 && String_Arr[i]<=123 && i%2==0)// CHECKING STRING CONTAINS ALPHABETS OR NOT. IF PRSENT THEN CAPITALSIE IT
		{
			c =String_Arr[i];
			String_Arr[i]= (char)(c-32);
			i=i+2;
		}
		
		
			
		
	}
	
	for(int i=0;i<S.length();i++)
		System.out.print(String_Arr[i]);
	
}

}




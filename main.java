import java.util.*;
public class main
{
	public static void main(String args[])
	{
		String S; int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 if u want to see  FREQUENCY of characters in a String or Enter 2 to the see  ALTERNATING String");
		x= sc.nextInt();
		System.out.println("Enter the String");
		S= sc.next();
		sc.close();
		
		switch(x){
		    case 1 : { Freq(S);break;}
		    case 2 :{ Alter(S);}
		}
	}
// FUNCTION TO COUNT THE NO. OF UNIQUE CHARACTERS	
public static void Freq(String S)
{
	Set<Character> set = new HashSet<Character>();

	for(int i=0; i<S.length();i++){
		set.add(S.charAt(i));
	}

	System.out.println(set.toString());
}

// FUNCTIO TO CAPATILIZE ALTERNATE LETTERS OF A STRING
public static void Alter(String S)
{
	String newstr = new String();
	
	for(int i=0;i<S.length();i++){
		if(i%2 == 0){
		    newstr += S.substring(i,i+1).toUpperCase();
		}
		else{
		    newstr += S.substring(i,i+1).toLowerCase();
		}
	}
	
    System.out.println(newstr);
}
}
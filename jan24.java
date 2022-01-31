
/* STRING */

package jan24;

public class string {

	
	public static void main(String[] args) {
		String s1;
		s1 = new String("VIT Bhopal University");
		String s2 = "Welcome to Java Programming";

		System.out.println(s1);
		System.out.println("s2 contains " + s2);
		int len = s1.length();
		for(int i=0; i<len;i++)
		System.out.println(s1.charAt(i));
		if(s1.equals("VIT Bhopal University"))
		System.out.println("Both are equal");
		else
		System.out.println("Both are differnt");
		System.out.println("Apple".compareTo("Ape"));
		if ("Apple".startsWith("Ap"))
		System.out.println("Yes");
		if (s1.endsWith("University"))
		System.out.println("Yes");
		System.out.println(s1.indexOf("Big"));
	}

}




OUTPUT:

VIT Bhopal University
s2 contains Welcome to Java Programming
V
I
T
 
B
h
o
p
a
l
 
U
n
i
v
e
r
s
i
t
y
Both are equal
11
Yes
Yes
-1
  
  
------------------------------------------------------------------------------------------------------------------------------------------------------------------  
  
  
/* EXTENSION */
  
	

package jan24;

import java.util.Scanner;

public class extension {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the file name : ");
		String s= sc.nextLine();
		int index = s.lastIndexOf('.');
		if(index > 0) {
		String extension = s.substring(index + 1);
		System.out.println("File extension is : " + extension);
		  }
		}
}


OUTPUT :

Enter the file name : 
word.sft
File extension is : sft

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

/* CITIES*/


package jan24;

public class City {

	public static void main(String[] args) {
		String city = "Bhopal";
		String cityUppercase = city.toUpperCase(); // toLowerCase() is also available
		System.out.println("city = " + city);
		System.out.println("cityUppercase = "+ cityUppercase);
		city = "Chennai";
		city.replace('e', 'E');
		System.out.println("city = " + city);
		System.out.println(city.replace('e', 'E'));
	}

}


OUTPUY:
city = Bhopal
cityUppercase = BHOPAL
city = Chennai
ChEnnai

--------------------------------------------------------------------------------------------------------------------------------------------------------------

/* STRING DEMO */

package jan24;

public class Stringdemo {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		if(str1 == str2)
		System.out.println("Both are same");
		else
		System.out.println("Both are different");
		String str3 = new String("Hello");
		if(str1 == str3)
		System.out.println("Both are same");
		else
		System.out.println("Both are different");
		if(str1.equals(str3))
		System.out.println("Both are equal");
		else
		System.out.println("Both are different");

	}

}


OUTPUT:

Both are same
Both are different
Both are equal


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


/* ARRAY DEMO */


package jan24;

public class Arraydemo {

	public static void main(String[] args) {
		int x; // x is a variable that can hold only one integer value
		int xa[]; // xa is a variable that can hold many integer values
		xa = new int[5];
		xa[0] = 10;
		xa[1] = 20;
		xa[2] = 30;
		xa[3] = 40;
		xa[4] = 50;
		// xa[5] = 100;
		x = xa[3];
		if(x > xa[4])
		System.out.println("x is greater");
		else
		System.out.println("x is smaller");
		for(int i = 0; i<xa.length;i++)
		System.out.println(xa[i]);
		for(int value : xa)
		System.out.println(value);

	}

}


OUTPUT:

x is smaller
10
20
30
40
50
10
20
30
40
50

-----------------------------------------------------------------------------------------------------------------------------------------------------

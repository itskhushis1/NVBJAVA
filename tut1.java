/* NAME IN UPPERCASE */

package jan18;

public class tutorial1 {

	public static void main(String[] args) {
		System.out.println("Khushi Sharma");
	}
}

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  OUTPUT :
  Khushi Sharma
  
  
  


/* ADDRESS */

package jan18;

public class Address {

	public static void main(String[] args) {
		        System.out.println("Miss. Khushi,");
		        System.out.println("Door No - 202/2,");
		        System.out.println("Street No. - 23,");
		        System.out.println("City - HYDERABAD,");
		        System.out.println("Pin - 509301.");
		   }
	}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
OUTPUT:
Miss. Khushi,
Door No - 202/2,
Street No. - 23,
City - HYDERABAD,
Pin - 509301.
	
/* VARIABLES */
 
 package jan18;

public class Variables {

	public static void main(String[] args) {
		byte a = 10;
        short b = 10000;
        int c = 56;
        long d = 100;
        char e = '2';
        float f = 43.56f;
        double g = 12.3;
        boolean h = false;
        f = c;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        System.out.println("e = "+e);
        System.out.println("f = "+f);
        System.out.println("g = "+g);
        System.out.println("h = "+h);

	}

}

  
  OUTPUT:
a = 10
b = 10000
c = 56
d = 100
e = 2
f = 56.0
g = 12.3
h = false
  
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/* VALUES */
  
package jan18;
public class Values {

	public static void main(String[] args) {
        int x = 5;
        int a = 2;
        int b = 4;
        int c = 3;
        int d = 1;
        int y = x * x * a * x;
        int z = b * x * x;
        int v = c * x;
        System.out.println("The value of the first part is: "+ (y + z + v + d));
        System.out.println("The value of the second part is: "+(a * b / d + c - a * 2));
        int t = c - a;
        int e = d + t;
        System.out.println("The value of third part is: " +(a * b / e * 2));

	}

}

OUTPUT:
The value of the first part is: 366
The value of the second part is: 7
The value of third part is: 8

------------------------------------------------------------------------------------------------------------------------------------------
 
 /* SQUARES */

package jan18;

public class Squares {

	public static void main(String[] args) {
        int a,b,c,d,x,y,t;
        a = 4;
        b = 4;
        c = 800;
        d = 700;
        x = a*b;
        y = c*d;

        System.out.println(x);
        System.out.println(y);
        t = y/x;
        System.out.println(t);

	}

}

OUTPUT:

16
560000
35000

--------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
/* Swaps */
  
package jan18;

public class Swaps {

	public static void main(String[] args) {
        int a,b,t,v,w;
        a = 4;
        b = 5;
        t = a;
        a = b;
        b = t;
        System.out.println(a);
        System.out.println(b);
        int d = 10;
        int e = 9;
        int f = 2;
        v = e;
        w = f;
        e = d;
        f = v;
        d = w;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

	}

}

OUTPUT:
5
4
2
10
9

----------------------------------------------------------------------------------------------------------------------------------------------

 /* Numbers */
    

package jan18;

public class Numbers {

	public static void main(String[] args) {
        int n = 45;
        int m = 39;
        int v = 25;
        int t = 99;

        if ( n > m)
            System.out.println(n +" is the biggest. ");

        else
            System.out.println(m+ "is the biggest. ");

        if( n >= m && n >= v)
            System.out.println(n + " is the biggest number.");

        else if (m >= n && m >= v)
            System.out.println(m + " is the biggest number.");

        else
            System.out.println(v + " is the biggest number.");

        if( n >= m && n >= v && n >=t)
            System.out.println(n + " is the biggest number.");

        else if (m >= n && m >= v && m >= t)
            System.out.println(m + " is the biggest number.");

        else if (v >= n && v >= m && v >= t)
            System.out.println(v + " is the biggest number.");

        else
            System.out.println(t + " is the biggest number.");

	}

}


OUTPUT:
45 is the biggest. 
45 is the biggest number.
99 is the biggest number.


------------------------------------------------------------------------------------------------------------------------------------------------------
  
 /* PATTERNS*/
  



  
  
  



  
  
  
  

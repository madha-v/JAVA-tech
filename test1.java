/* number of pallindrone in the word*/
import java.util.*;
public class count{
    
    public static int  str(String input)
    {
        int n=input.length();
        int c=0;
        for(int i=0;i<n;i++)
        {
        
            for(int j=i+1 ;j<=n;j++)
            {
                String sub=input.substring(i, j);
                if(ispallindrone(sub))
                {
                    c++;
                }
            }
            
        }
       return c;
    }

   public static  Boolean ispallindrone(String input)
    {
        int l=0 , r=input.length()-1;
        while(l<r)
        {
            if(input.charAt(l)!=input.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string to count pallindrone ");
        String input=sc.nextLine();
        String res=str(input);

        System.out.println("the number of pallindrone in the string is ::-> "+res);
        sc.close();
    }
}



  /*  count the number of the pallindrone in the sentence  alternate way */

import java.util.*;

public class CountPalindromes {
    
    // Method to count the number of palindrome words in the input string
    public static int countPalindromes(String input) {
        // Split the input string into words using space as delimiter
        String[] words = input.split(" ");
        int palindromeCount = 0;
        
        // Loop through each word and check if it's a palindrome
        for (String word : words) {
            if (isPalindrome(word)) {
                palindromeCount++;  // Increment the count if it's a palindrome
            }
        }
        
        return palindromeCount;  // Return the total count
    }

    // Helper method to check if a word is a palindrome
    private static boolean isPalindrome(String word) {
        int left = 0, right = word.length() - 1;
        
        // Compare characters from both ends of the word
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;  // If any characters don't match, return false
            }
            left++;
            right--;
        }
        
        return true;  // Return true if it's a palindrome
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input string from user
        System.out.println("Enter a string to count palindromes in words: ");
        String input = sc.nextLine();
        
        // Count palindromes using the countPalindromes method
        int palindromeCount = countPalindromes(input);
        
        // Output the result
        System.out.println("No. of palindromes: " + palindromeCount);
        
        sc.close();
    }
}


/* remove duplicates in the string  */


import java.util.*;
public class test{

    public static String str(String input)
    {
               int n=input.length();
               StringBuilder res= new StringBuilder();
               
               for(int i=0;i<n;i++)
             {
                boolean isduplicate=false;
                for(int j=0;j<res.length();j++)
                {
                    if(input.charAt(i)==res.charAt(j))
                    {
                         isduplicate=true;
                         break;
                    }
                }
              
              if(!isduplicate)
              {
                res.append(input.charAt(i));
              }
            }
            return res.toString();
    }
    public static void main(String[] args) 
    {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to remove duplicates: ");
        String input = sc.nextLine();
       String res=str(input);
       System.out.println("after removing duplicates :: " + res);
       sc.close();
    }
}




 /* retunr the  charcter having maximum frequency  */


import java.util.*;

public class test1 {

    public static String str(String input) {
        int n = input.length();
        int maxCount = 0;
        char maxChar = ' ';
        
        // Traverse the string
        for (int i = 0; i < n; i++)
         {
            char ch = input.charAt(i);
            int count = 0;
            
            // Count the occurrences of this character
            for (int j = 0; j < n; j++) 
            {
                if (input.charAt(j) == ch) {
                    count++;
                }
            }
            
            // If the current character's frequency is greater than the current max, update max
            if (count > maxCount)
             {
                maxCount = count;
                maxChar = ch;
            }
        }
        
        // Return the character with the maximum frequency and its count
        return maxChar + " : " + maxCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input string from user
        System.out.println("Enter a string to return maximum frequency character: ");
        String input = sc.nextLine();
        
        // Get the result and display
        String res = str(input);
        System.out.println("Maximum frequency character is (repeated): " + res);
        
        sc.close();
    }
}



/* to return  element having least frequency */

import java.util.*;

public class test1
 {

    public static String str(String input) {
        int n = input.length();
        int minCount = Integer.MAX_VALUE;  // Initialize to a large number
        char minChar = ' ';

        // Traverse the string
        for (int i = 0; i < n; i++) {
            char ch = input.charAt(i);
            int count = 0;
            
            // Count the occurrences of this character
            for (int j = 0; j < n; j++) {
                if (input.charAt(j) == ch) {
                    count++;
                }
            }

            // Update if the current count is less than the minimum found so far
            if (count < minCount) {
                minCount = count;
                minChar = ch;
            }
        }

        // Return the character with the minimum frequency and its count
        return minChar + " : " + minCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input string from user
        System.out.println("Enter a string to return minimum frequency character: ");
        String input = sc.nextLine();
        
        // Get the result and display
        String res = str(input);
        System.out.println("Minimum frequency character is (not repeated): " + res);
        
        sc.close();
    }
}



/*  total number of the vowel and consunant */

import java.util.*;

public class test1 {

    public static String str(String input) {
        int n = input.length();
        int c1=0 , c2=0;
        String res=" ";
        for(int i=0;i<n;i++)
        {
            char ch=input.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
             ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
             {
                c1++;
             }
             else{
                c2++;
             }
        }
        return res+=c1 + " :"+c2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input string from user
        System.out.println("Enter a string to count vowel and consunant : ");
        String input = sc.nextLine();
        
        // Get the result and display
        String res = str(input);
        System.out.println("count of vowel and consunant is ::: " + res);
        
        sc.close();
    }
}



/* remove vowel from the sentece and arrange in sorted order */

import java.util.*;

public class test1 {

    public static String str(String input) {
        int n = input.length();
        int c1=0 , c2=0;
        String res=" ";
        for(int i=0;i<n;i++)
        {
            char ch=input.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
             ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
             {
              continue;
             }
             else{
                res+=ch;
            }
       
        }
        char []strarray =res.toCharArray();
        Arrays.sort(strarray);

      
        return new String(strarray); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input string from user
        System.out.println("Enter a string to count vowel and consunant : ");
        String input = sc.nextLine();
        
        // Get the result and display
        String res = str(input);
        System.out.println("count of vowel and consunant is ::: " + res);
        
        sc.close();
    }
}




/* remove consnunant and sort them in a ascending order  */

import java.util.*;

public class test1 {

    public static String str(String input) {
        int n = input.length();
        String res=" ";
        for(int i=0;i<n;i++)
        {
            char ch=input.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
             ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
             {
              res+=ch;
             }
             else{
                continue;
            }
         
        }
        char []strarray=res.toCharArray();
        System.out.println("sorting in ascending order ::-> ");
        Arrays.sort(strarray);

        for(int i=0;i<strarray.length;i++)  // reverse to sort in descending order
        {
            for(int j=0;j<strarray.length;j++)
            {
                char t=strarray[i];
                strarray[i]=strarray[j];
                strarray[j]=t;
            }
        }
         return new String(strarray);

 

         
         
 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input string from user
        System.out.println("Enter a string to remove consunant : ");
        String input = sc.nextLine();
        
        // Get the result and display
        String res = str(input);
        System.out.println("after removing consunant and in sorted way::: " + res);
        
        sc.close();
    }
}



/* sum of the digits present in the string  */




import java.util.*;

public class test1 {

    public static String str(String input) 
    {
      
        char[] strarray=input.toCharArray();
        Arrays.sort(strarray);

        return new String(strarray);

       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input string from user
        System.out.println("Enter a string to calculate sum of digits: ");
        String input = sc.nextLine();
        
        // Get the result and display
        String res = str(input);
        System.out.println("Sum of digits in the string: " + res);
        
        sc.close();
    }
}



/* count the number of vowel at even place and odd place  */

import java.util.*;

public class test1 {

    public static String str(String input) 
    {
      int c1=0 , c2=0;
      int n =input.length();
      String res=" ";
      for(int i=0;i<n;i++)
      {
        char ch=input.charAt(i);
        if(i%2==0 && (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
        ch=='A' || ch=='E' || ch=='E' || ch=='O' || ch=='U'))
        {
            c1++;
        }
        if(i%2!=0 && (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
        ch=='A' || ch=='E' || ch=='E' || ch=='O' || ch=='U'))
        {
            c2++;
        } 

     }
     return "Vowels at even positions: " + c1 + ", Vowels at odd positions: " + c2;
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input string from user
        System.out.println("Enter a string to calculate vowel at places : ");
        String input = sc.nextLine();
        
        // Get the result and display
        String res = str(input);
        System.out.println("vowel at even and odd places : " + res);
        
        sc.close();
    }
}



/* anagram string  */

import java.util.Arrays;

public class AnagramCheck {

    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase for uniformity
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are different, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert both strings to character arrays and sort them
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}


 

/* convert uppercase to lower and vive versa  */


import java.util.*;

public class test1 {

    public static String str(String input) 
    {
      int n=input.length();
      String res=" ";
      for(int i=0;i<n;i++)
      {
        char ch=input.charAt(i);
        if(ch>='A' && ch<='Z')
        {
            ch+=32;
        }
        else if(ch>='a' && ch<='z')
        {
            ch-=32;
        }
      
       
       res+=ch;
    }
             return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input string from user
        System.out.println("Enter a string ->: ");
        String input = sc.nextLine();
        
        // Get the result and display
        String res = str(input);
        System.out.println("result string is here ->: " + res);
        
        sc.close();
    }
}


// /* to find the books details with the help of book code  */

import java.util.*;

class Book {
    String name;
    String type;
    int pages;
    int price;

    // Constructor to initialize the book
    public Book(String name, String type, int pages, int price) {
        this.name = name;
        this.type = type;
        this.pages = pages;
        this.price = price;
    }

    // Method to display the details of the book
    public void display()
     {
        System.out.println("Name of the book is: " + name);
        System.out.println("Type of the book is: " + type);
        System.out.println("Number of pages is: " + pages);
        System.out.println("Price of the book is: " + price);
    }
}

public class book1 {
    public static void main(String[] args) {
        // Initialize an array of books
        Book[] books = {
            new Book("Joshwa", "Maths", 500, 250),
            new Book("Joshwa1", "English", 80, 49),
            new Book("Joshwa2", "Science", 300, 140),
            new Book("Joshwa3", "Computer", 500, 2500)
        };

        // Scanner for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book name to search: ");
        String n = sc.nextLine();

        boolean found = false;

        // Search for the book by name
        for (Book book : books) {
            if (n.equals(book.name)) {  // Use .equals() for string comparison
                book.display();  // Display book details
                found = true;
                break;  // Exit loop once the book is found
            }
        }

        // If book is not found, print an error message
        if (!found) {
            System.out.println("No book found with the name: " + n);
        }

        sc.close();
    }
}



 /* have to search details of the employee based on the given id  */

import java.util.*;
class employee{
                 String name;
                 int age;
                 int salary;
                 int id;


                public  employee(String name , int age , int salary ,int id)
                {
                  this.name=name;
                  this.age=age;
                  this.salary=salary;
                  this.id=id;
                }

                public void display()
                {
                  System.out.println("name of the employee is ::-> "+name);
                  System.out.println("age of the employee is ::-> "+age);
                  System.out.println("salary of the employee is ::-> "+salary);
                  System.out.println("id of the employee is ::-> "+id);
                }
}
public class test1{


             public static void main(String [] args)
             {
               Scanner sc=new Scanner(System.in);

               employee [] emp={new employee("madhav",22,150000,202),
                                 new employee("vansaj",22,120000,212),
                                 new employee ("ashmit",23,180000,278),
                                 new employee ("akhil",23,78000,215)};
               System.out.println("enter the id of the employee you want to search::->");
               int id1=sc.nextInt();
               boolean found=false;
              for(employee e:emp)
              {
               if(id1==e.id)
               {
               e.display();
               found=true;
               break;
               }
              }

              if(!found)
              {
                System.out.println("not valid id given by you , kyu time waste kr re mera yr ::");
              }
               sc.close();
               

             }
}

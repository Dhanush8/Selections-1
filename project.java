package abc;

import java.util.Scanner;

public class Abc {

    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);

      System.out.print("Enter the marks: ");
      int marks=sc.nextInt();

      if(marks>100 || marks<0)
      {
        System.out.print("Invalid marks");
      }
      else if(marks>=75)
      {
        System.out.print("Your credit is: A");
      }
      else if(marks>=65)
      {
        System.out.print("Your credit is: B");
      }
      else if(marks>=55)
      {
        System.out.print("Your credit is: C");
      }
      else if(marks>=35)
      {
        System.out.print("Your credit is: S");
      }
      else
      {
        System.out.print("Your credit is: F");
      }

}

}

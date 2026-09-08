 import java.util.Scanner;

public class methodsDemo {
    
      static void message(String name , int age) {
        System.out.println("Hello guys, This is " + name + ". I am " + age + " Years old ");
    }        
      static int calculateRealAge(int currentYear, int birthYear ){ 
            return currentYear - birthYear;
    }        
      public static void main(String[] args)  {
          message("Renante", 19);
          
//           Scanner sc = new Scanner(System.in);
//           System.out.println("enter your name: ");
//           String name = sc.nextLine();
//           
//           System.out.println("enter your age: ");
//           int age = sc.nextInt();
//           
//           message(name, age);
           int calculatedAge = calculateRealAge(2026, 2007);
           
           System.out.println("my real age is " + calculatedAge + (" 2026, 2007"));
           
           Scanner sc = new Scanner(System.in);
           System.out.println("\nwho are you?");
           System.out.print("enter your name: ");
           String name = sc.nextLine();
           
           System.out.println("enter your age: ");
           int age = sc.nextInt();
           
//           System.out.println("Hello guys, This is " + name + ". I am " + age + " Years old ");
           
           message(name, age);
         
//       if(age== calculated){
//           System.out.println("honest");


       if (age <15)  { System.out.println("you aare too young?"); }
       else if (age > 15 && age < 20) { System.out.println("you are ulitaho"); }
       else { System.out.println("your pogi"); }
       
       System.out.println("\nare you sure?");
       System.out.println("current year: ");
       int yearToday = sc.nextInt();
       System.out.println("your birthday: ");
       int birthYear =sc.nextInt();
       int realAge = yearToday -birthYear;
       if (realAge == age) { System.out.println("dika nag sisinungaling ");}
       else { System.out.println("noo!!   bido");}
       
       String[] cats = {"mounty", "snowbell", "galaxy destroyer"};
       
       System.out.println("\ncats ni rene: ");
       for (int cv = 0; cv < cats.length; cv++) {
           System.out.println(cats[cv]);
       }
       
 
               
    }

} 


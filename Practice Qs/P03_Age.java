public class P03_Age {
   public static void main(String[] args) {
    
    int age =45;

    if(age>=0 && age<=12)
        System.out.println("Child");
    else if(age<0)
        System.out.println("Invalid");
    else if(age<=19)
        System.out.println("Teenager");
    else if(age<=59)
        System.out.println("Adult");
    else if(age<=100)
        System.out.println("Senior");

   } 
}

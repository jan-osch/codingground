import java.lang.Math;

public class HelloWorld{

     public static void main(String []args){
        
        System.out.println("Hello World");
        
        System.out.println("Should be 6: "+HelloWorld.getNumberOfDigits(123123));
        
        System.out.println("Should be 2: "+HelloWorld.getDigitAt(123123, 4));
        
        System.out.println("Should be 3: "+HelloWorld.getDigitAt(123123, 0));
        
        System.out.println("Should be false: "+HelloWorld.isPalindrome(123123));
        
        System.out.println("Should be true: "+HelloWorld.isPalindrome(3));
        
        System.out.println("Should be true: "+HelloWorld.isPalindrome(31213));
        
        System.out.println("Should be true: "+HelloWorld.isPalindrome(56566565));
     }
     
     public static boolean isPalindrome(int suspect){
         int j = HelloWorld.getNumberOfDigits(suspect)-1;
         int i = 0;
         
         while(i<j){
             if(HelloWorld.getDigitAt(suspect,i)!=HelloWorld.getDigitAt(suspect,j)){
                 return false;
             }
             
             i++;
             j--;
         }
         
         return true;
     }
     
     public static int getNumberOfDigits(int suspect){
         int number = 1;
         
         while(suspect / Math.pow(10, number) > 1){
             number++;
         }
         
         return number;
     }
     
     public static int getDigitAt(int suspect, int index){
         int rest = suspect % (int) Math.pow(10, index+1);
         
         return (int) Math.floor(rest / Math.pow(10, index));
     }
     
     
}



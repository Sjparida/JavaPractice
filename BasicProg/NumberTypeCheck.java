package BasicProg;
import java.util.Scanner;

class NumberTypeCheck {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Program to check if number is +ve, -ve or 0 ");
        System.out.println("_____________________________________________");
        System.out.println("");
        sign();
    }

    public static void sign() {
        System.out.print("Enter a number to check: ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();


        if(num==0){
            System.out.println(num + "- this looks like a Zero ");
            System.out.println("");
        }
        else if(num>0){
            System.out.println(num + " is a positive number");
            System.out.println("");
        }
        else{
            System.out.println( num + " is a negative number");
            System.out.println("");
        }
        sc.close();
    }
}


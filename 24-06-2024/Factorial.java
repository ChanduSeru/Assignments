import java.util.Scanner;
class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int result = 1;
        for(int i=num;i>1;i--){
            result*=i;
        }
        System.out.println("Factorial of a number is : "+result);
    }
}
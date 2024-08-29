import java.util.Scanner;
public class AutomorphicNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        int n=sc.nextInt();

        if(isAutomorphic(n)){
            System.out.println(n+" is an Automorphic Number");
        }
        else{
            System.out.println(n+" is not an Automorphic Number");
        }
        sc.close();
    }


    public static boolean isAutomorphic(int n){
        if(n<0){
            n=-n;
        }

        int sq=n*n;

        while(n>0){
            if(n%10!=sq%10){
                return false;
            }
            else{
                n=n/10;
                sq=sq/10;
            }
        }
        return true;

    }
}
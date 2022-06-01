import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any Year");
        int year=scan.nextInt();
        if(year%400==0)
            System.out.println("Yes It is leap year");
        else{
            if(year%4==0 && year%100!=0)
                System.out.println("Yes It is leap year");
            else
                System.out.println("No It is not a leap year");
        }
    }
}
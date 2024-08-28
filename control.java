import java.util.Scanner;
class Fundamentalcontrolflow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0) System.out.println("Zero");
        else if(n>0) System.out.println("Positive");
        else System.out.println("Negative");
        switch(Math.abs(n%7)){
            case 1:{
                System.out.println("Sunday");
                break;
            }
            case 2:{
                System.out.println("Monday");
                break;
            }
            case 3:{
                System.out.println("Tuesday");
                break;
            }
            case 4:{
                System.out.println("Wednesday");
                break;
            }
            case 5:{
                System.out.println("Thursday");
                break;
            }
            case 6:{
                System.out.println("Friday");
                break;
            }
            case 7:{
                System.out.println("Saturday");
                break;
            }
            default:{
                System.out.println("invalid input");
            }
        }
        for(int i=1;i<=n;i++){
             System.out.print(i+" ");
        }
        System.out.println("\n");
        int a,ans=0;
      while (n!=0) {
        System.out.print(n+" ");
        n--;
      }
      System.out.println("\n");
    
        
        int x=1;
        do{
            System.out.print(x+" ");
            x++;
        }
        while(x!=4);
        sc.close();
    }
}
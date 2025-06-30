import java.util.Scanner;
public class NextArmStrong {
    public static boolean isArmStrong(int n){
        int original=n;
        int count=0;
        int temp=n;
        while(temp!=0){
        count++;
        temp=temp/10;
        }
        temp=n;
        int sum=0;
        while(temp!=0){
            int lastdigit=temp%10;
            int mult=1;
            int i=1;
            while(i<=count){
                mult=mult*lastdigit;
                i++;
            }
            sum=sum+mult;
            temp=temp/10;
        }
        if(sum==original){
            System.out.println("ArmStrong Number");
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        isArmStrong(n);
        sc.close();
        int next=n+1;
        while(true){
            if(isArmStrong(next)){
                System.out.println("Next Armstrong :"+next);
                break;
            }
            next++;
        }
    }
}

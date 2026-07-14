import.java.util.*;
class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double low=0;
        double high=a;
        while(low<=high)
        {
            double mid=(low+high)/2;
            if(b*mid==a)
            {
                System.out.print(mid);
                return;
            }
            else if(b*mid>a)
            {
                high=mid;
            }
            else
            {
                low=mid;
            }
        }
    }
}

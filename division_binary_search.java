class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        double a=22,b=-7;
        double x=a,y=b;
        if(b<0)
        {
            b=b*(-1);
        }
        else if(a<0)
        {
            a=a*(-1);
        }
        double low=0;
        double high=a;
        while(low<=high)
        {
            double mid=(low+high)/2;
            if(b*mid==a)
            {
                if(x<0||y<0)
                {
                    mid=mid*-1;
                }
                System.out.printf("%.5f",mid);
                return;
            }
            if(b*mid>a)
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

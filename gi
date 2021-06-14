import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=1;t<=T;t++)
        {
            int N = sc.nextInt();
            int K = sc.nextInt();
            String s = sc.nextLine();
            char c[] = s.toCharArray();
            int arr[] = new int[256];
            int count = 0;
            for(int i = 0;i<N;i++)
            {
                arr[c[i]] += 1;
            }
            for(int i = 0;i<256;i++)
            {
                if(arr[i] != 0 && arr[i] < K)
                {
                    count  = count + (K-arr[i]);
                }
            }
            System.out.println("Case #"+t+": "+count);
        }
        
    }
}

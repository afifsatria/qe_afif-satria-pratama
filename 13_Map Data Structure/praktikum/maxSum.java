package section12n13;

public class maxSum {
    public static int maxSum(int arr[], int n, int k)
    {
        if (n < k)
        {
            System.out.println("Invalid");
            return -1;
        }

        int x = 0;
        for (int i=0; i<k; i++)
            x += arr[i];

        int cSum = x;
        for (int i=k; i<n; i++)
        {
            cSum += arr[i] - arr[i-k];
            x = Math.max(x, cSum);
        }
        return x;
    }

    public static void main(String[] args)
    {
        int arr[] = {2,1,5,1,3,2};
        int k = 3;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
    }
}



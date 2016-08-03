/**
 * Created by udayanga on 7/21/16 at 9:05 AM.
 */
public class test {
    static int[] a = { 10, 14, 19, 26, 27, 31, 33, 35, 42, 44 };
    static int [] b=new int [10];
    static int max=10;
    public static void main(String[] args) {
        int i;
        System.out.println("List before sorting\n");

        for(i = 0; i <= max; i++)
            System.out.println(a[i]);

        sort(0, max);

        System.out.println("\nList after sorting\n");

        for(i = 0; i <= max; i++)
            System.out.println(a[i]);
    }
    private static void merging(int low, int mid, int high){
        int l1,l2,i;
        for(l1=low,l2=mid+1,i=low;l1<=mid && l2<=high;i++ ){
            if(a[l1]<=a[l2])
                b[i]=a[l1++];
            else
                b[i]=a[l2++];
        }
        while (l1<=mid)
            b[i++]=a[l1++];
        while (l2<=high)
            b[i++]=a[l2++];
        for(i=low;i<=high;i++)
            a[i]=b[i];
    }
    private static void sort(int low, int high){
        int mid;
        if(low < high) {
            mid = (low + high) / 2;
            sort(low, mid);
            sort(mid+1, high);
            merging(low, mid, high);
        }else {
            return;
        }
    }

}

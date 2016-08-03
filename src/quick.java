import java.util.Arrays;

/**
 * Created by udayanga on 7/20/16 at 1:29 PM.
 */
public class q4_quick {
    public static void main(String[] args) {
        int[] list = {5,2,8,7,6,10};
        int left =0;
        int right=list.length-1;
        quickSort(list,left,right);
        System.out.println(Arrays.toString(list));
    }
    private static void quickSort(int[] list,int left, int right){
        if(list==null || list.length==0)return;
        if(left>=right)return;
        int middle=left+(right-left)/2;
        int pivot=list[middle];
        int i=left,j=right;
        while (i <= j){
            while (list[i]<pivot)i++;
            while (list[j]>pivot)j--;
            if(i<=j){
                int tmp=list[i];
                list[i]=list[j];
                list[j]=tmp;
                i++;j--;
            }
        }
        if(left<j)quickSort(list,left,j);
        if(right>i)quickSort(list,i,right);
    }

}

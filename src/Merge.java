import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by udayanga on 7/20/16 at 3:15 PM.
 */
public class q6_merge {
    public static void main(String[] args) {
        int[] list = {5,2,8,7,6,10};

    }
    private static int[] mergesort(int [] list){
        int n=list.length;
        int[] list_1=new int[n/2];
        int[] list_2=new int[n/2];
        System.arraycopy(list, 0, list_1, 0, list_1.length);
        System.arraycopy(list, list_1.length, list_2, 0, list_2.length);

        list_1=mergesort(list_1);
        list_2=mergesort(list_2);
        return merge(list_1,list_2);

    }
    private static int[] merge(int [] a,int [] b){
        int [] c= new int[a.length*2];
        while (a.length<0 && b.length<0){
            if(a[0]>b[0]){
                //b=ArrayUtils.removeElement(b, 0)
            }
        }

        return null;
    }
}

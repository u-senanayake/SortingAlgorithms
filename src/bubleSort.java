import java.util.Arrays;

/**
 * Created by udayanga on 7/15/16 at 4:02 PM.
 */
public class q1_bubleSort {
    public static void main(String[] args) {
        boolean run= true;
        int tmp;
        int[] list = {5,2,8,7,6,10};
        while(run){
            run=false;
            for (int i=0;i<list.length-1;i++){
                if(list[i]<list[i+1]){
                    tmp=list[i];
                    list[i]=list[i+1];
                    list[i+1]=tmp;
                    run=true;
                }
            }
        }
        System.out.println(Arrays.toString(list));
    }
}

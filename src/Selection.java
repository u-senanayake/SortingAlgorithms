/**
 * Created by udayanga on 7/20/16 at 11:11 AM.
 */
public class q2_Selection {
    public static void main(String[] args) {
        int[] list = {5,2,8,7,6,10};
        int min,tmp;
        for(int i=0;i<list.length-1;i++){
            min =i;
            for(int j=i+1;j<list.length;j++){
                if(list[j]<list[min])min=j;
            }
            if(min!=i){
                tmp=list[i];
                list[i]=list[min];
                list[min]=tmp;
            }
        }
        for(int i=0;i<list.length;i++){
            System.out.println(list[i]);
        }
    }
}
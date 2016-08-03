/**
 * Created by udayanga on 7/20/16 at 12:20 PM.
 */
public class q3_insertion {
    public static void main(String[] args) {
        int[] list = {5,2,8,7,6,10};
        int holePosition,valueToInsert;
        for(int i=0;i<list.length;i++){
            valueToInsert=list[i];
            holePosition=i;
            while (holePosition>0 && list[holePosition-1]>valueToInsert){
                list[holePosition]=list[holePosition-1];
                holePosition=holePosition-1;
            }
            list[holePosition]=valueToInsert;
        }
        for(int i=0;i<list.length;i++){
            System.out.println(list[i]);
        }
    }
}

package intro;

import java.util.ArrayList;
import java.util.List;

public class Distinct {



    // todo  think again

    public static List<Integer> distinct(int[] a){
        List<Integer> distinct = new ArrayList();
        int l = 0;
        int r = 0;
        for ( l = 0; l < a.length; l = r) {
            for (r = l + 1; r < a.length; ++r) {
                if(a[r] != a[l]){
                    break;
                }
            }
            distinct.add(a[l]);
        }
        return distinct;
    }


    public static void main(String[] args){
        int[] a = new int[]{1,1,1,1,2,2,2,3,3,3,4,5,6,8,10,10,12,12,15,17};
        List<Integer> dis = distinct(a);
        for (int i = 0; i < dis.size(); i++) {
            System.out.println(dis.get(i));
        }
    }
}

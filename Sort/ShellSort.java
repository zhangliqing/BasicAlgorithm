/**
 * Created by zhangliqing on 2017/2/28.
 */
public class ShellSort extends Tool {
    public static void sort(Comparable[] a){
        int N =a.length;
        int h=1;
        while (h<N/3)
            h=3*h+1;
        while (h>=1){
            for (int i=h; i<N;i++){
                for (int j=i; j-h>=0 && less(a[j],a[j-h]);j-=h){
                    exch(a,j-h,j);
                }
            }
            h=h/3;
        }
    }
    public static void main(String[] args) {
        Integer[] a={7,9,5,7,9,1,0,3,6,4};
        show(a);
        sort(a);
        assert isSorted(a);
        show(a);
    }
}

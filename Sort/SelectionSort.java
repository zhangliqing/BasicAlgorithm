/**
 * Created by zhangliqing on 2017/2/27.
 */
public class SelectionSort extends Tool{
    public static void sort(Comparable[] a){
        int N=a.length;
        for (int i=0;i<N;i++){
            int min=i;
            for(int j=i+1;j<N;j++){
                if(less(a[j],a[min])) min=j;
            }
            exch(a,min,i);
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

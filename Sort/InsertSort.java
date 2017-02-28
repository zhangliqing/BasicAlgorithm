/**
 * Created by zhangliqing on 2017/2/27.
 */
public class InsertSort extends Tool {
    public static void sort(Comparable[] a){
        for(int i=1;i<a.length;i++){
            int insertPosition=i; //插入点
            Comparable tmp=a[i];  //寄存被覆盖的位置a[i]
            for (int j=i;j>0 && less(tmp,a[j-1]);j--){
                a[j]=a[j-1];
                insertPosition=j-1;
            }
            if(insertPosition!=i){
                a[insertPosition]=tmp;
            }
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

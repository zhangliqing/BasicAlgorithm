import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by zhangliqing on 2017/2/28.
 */
public class SortCompare {
    public static double time(String alg, Double[]a){
        long start=System.nanoTime();
        switch (alg){
            case "Insert":InsertSort.sort(a); break;
            case "Selection":SelectionSort.sort(a);break;
            case "Shell":ShellSort.sort(a); break;
        }
        long end=System.nanoTime();
        return end-start;
    }
    public static double timeRandomInput(String alg,int N, int T){
        double total=0;
        Double[] a=new Double[N];
        for (int i=0;i<T;i++){
            for (int j=0;j<N;j++){
                a[j]= StdRandom.uniform();
            }
            total+=time(alg,a);
        }
        return total;
    }
    public static void main(String[] args) {
        double t1=timeRandomInput("Insert",1000,100);
        double t2=timeRandomInput("Selection",1000,100);
        double t3=timeRandomInput("Shell",1000,100);
        System.out.println("Insert/Selection="+t1/t2);
        System.out.println("Shell/Selection="+t3/t2);
        System.out.println("Shell/Insert="+t3/t1);
    }
}

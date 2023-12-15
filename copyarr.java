import java.util.Arrays;
public class copyarr {
    public static void main(String[] args)
    {
        int[] a={-1,4,3,2,7,-18};
        //creating a new copy of arr
        int[] b=a.clone();
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}

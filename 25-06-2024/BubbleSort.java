import java.util.Arrays;

class BubbleSort{
    public static void main(String[] args){
        int[] a = {4,9,5,7,1,2,4};
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
        System.out.println(a.toString());
        System.out.println(Arrays.toString(a));
    }
}
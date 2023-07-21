package array;

public class CompareTwoArray {
    public static void main(String[] args) {
        int[]a = {1,2,3,4,5};
        int[]b = {1,6,3,4,5};
        for( int i=0; i<a.length; i++){
            if (a[i]!=b[i]){
                System.out.println("a is not equals to b");
break;
            }
            else {
                System.out.println("this a is equals to b");
            }

        }
        if(a.length==b.length){
            System.out.println("this is equals");
        }
        else {
            System.out.println("this is not equal");
        }
    }
}

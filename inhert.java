import java.util.Arrays;

class inhert
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6};
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
        arr =ArrayUtils.Remove(arr, 2);
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
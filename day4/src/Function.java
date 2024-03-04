public class Function {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        test(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void test(int[] arr)
    {
        arr[0] = 2;
    }
}

public class jeka {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 30, 4, 5 };

        int i = 0;
        int tem = 0;
        while (i < arr.length) {
            if (arr[i] > tem) {
                tem = arr[i];
            }
            i++;
        }
        System.out.println(tem);
    }
}

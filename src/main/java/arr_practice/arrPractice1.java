package arr_practice;

public class arrPractice1 {
    public static void main(String[] args) {
    int[] arr = new int[10];
        for(int i = 0, value = 0; i < arr.length; i++) {
            arr[i] = value += 1;
            System.out.print(arr[i] + " ");
        }

    }
}

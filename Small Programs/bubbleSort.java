import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args) {
        int[] array = new int[10];
        outPut(array);

    }

    private static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }

    }

    public static void sortArray(int[] array) {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        System.out.println(" ");
        System.out.println(Arrays.toString(array));
    }

    private static void outPut(int[] array) {

        fillArray(array);
        sortArray(array);
    }

}

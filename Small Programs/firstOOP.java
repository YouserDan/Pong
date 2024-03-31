public class firstOOP {
    public static void main(String[] args) {
        int[] array = new int[10];
        outPut(array);

    }

    private static void outPut(int[] array) {
        fillArray(array);
        System.out.println(" ");
        sortArray(array);
    }

    private static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }

    }

    private static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int res = array[i];
            array[i] = array[min];
            array[min] = res;
            System.out.print(array[i] + " ");

        }
    }

}
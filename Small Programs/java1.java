public class java1 {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 5, 3, 4, 4, 3, 2, 5, 4};
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Ученик №%d: оценка %d%n", (i + 1), array[i]);
         }
        System.out.println("Всего элементов " + array.length);
        System.out.println(getType(array));
    }

    static String getType(Object o){
        return o.getClass().getSimpleName();
    }
}

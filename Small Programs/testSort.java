public class testSort {
    public static void main(String[] args) {
        // Создаем строку с паттерном kst_0_top_kst_1_top ... kst_1000_top
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i <= 1000; i++) {
            resultString.append("kst_" + i + "_top_");
        }

        // Выводим результат без переносов
        System.out.print(resultString.toString());
    }
}

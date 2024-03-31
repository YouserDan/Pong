
public class test {
    public static void main(String[] args) {
        int[] array = new int[] {1, 200, 12, 34, 31, 10, 11, 9};

        for(int i = 0; i < array.length; i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++ ){
                if(array[j] < array[min]){
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

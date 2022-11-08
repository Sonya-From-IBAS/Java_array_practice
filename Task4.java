package array_lesson;
//определить сумму элементов массива, расположенных между минимальным и максимальным элементами

public class Task4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 124, 6, 7, 8, 32, 4, 7, 0};
        Task1.print_array(array);
        System.out.println("Sum: "+getSum(array));

    }

    public static int getMinIndex(int[] array) {
        int minIndex = 0, minValue = array[minIndex];
        for(int i = 1; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int getMaxIndex(int[] array) {
        int maxIndex = 0, maxValue = array[maxIndex];
        for(int i = 1; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
                maxIndex = i;
            }

        }
        return maxIndex;
    }

    public static int getSum(int[] array) {
        int minIndex = getMinIndex(array);
        int maxIndex = getMaxIndex(array);
        if(maxIndex<minIndex){
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }
        int sumResult = 0;
        for(int i = minIndex + 1; i < maxIndex; i++) {
            sumResult += array[i];
        }
        return sumResult;
    }
}

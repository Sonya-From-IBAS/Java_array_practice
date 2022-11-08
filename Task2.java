package array_lesson;
//внести в массив числа от 0 до 100 делящиеся на 13 и 17 и их печать
public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        add_elements(array);
        Task1.print_array(array);

    }
    public static void add_elements(int[] array){
        for (int currentValue = 1, currentIndex = 0; currentIndex < array.length; currentValue++) {
            if(currentValue %13==0 || currentValue%17==0){
                array[currentIndex++] = currentValue;
            }
        }
    }
}

package array_lesson;

//Написать вывод мсассива с нчала и с конца
public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 56, 325, 657, 231, 65735};
        print_array(array);
        print_revers(array);
    }


    public static void print_array(int[] values) {
        for(int value: values) {
            System.out.print(value + "\t");
        }
        System.out.println();
    }


    public static void print_revers(int[] values) {
        for(int i = values.length - 1; i >= 0; i--) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }
}

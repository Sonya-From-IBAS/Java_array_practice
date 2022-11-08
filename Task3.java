package array_lesson;
//метод equals, определяющий, равны ли между собой соответсвтующие элменты 2-х мерных массивов
public class Task3 {
    public static void main(String[] args) {
        int[][] array1 = {
                {1,2,3,4},
                {4,5,6,2},
                {1,5,3},
        };
        int[][] array2 = {
                {1,2,3,4},
                {4,5,6,2},
                {1,5,3,5},
        };
        System.out.println(equals(array1, array2));
    }

    public static boolean equals(int[][] array1, int[][] array2){
        if(array1.length!= array2.length) return false;
        for (int i = 0; i < array1.length; i++) {
            if(array1[i].length != array2[i].length) return false;
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] != array2[i][j]) return false;
            }
        }
        return true;
    }
}

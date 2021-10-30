import java.util.Arrays;

public class RemoveDuplicates {
    public static int[] arrayOrigin(int[] array) {

        int count_duplicate = 0;
        int count_original = 0;

        for (int i = 0; i < array.length; i++) {
            int count1 = 0;
            int count2 = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array.length > count_duplicate + count_original) {
                    if (array[i] == array[j]) {
                        count1++;
                        count2++;
                    }
                }
            }

            if (count2 != 0) { //эта проверка делается для того, чтобы избежать ошибку Деление на 0 (строка 22)
                count1 = count1 / count2; //из одинаковых цифр одна будет считаться оригиналом, остальные - дубликаты. Поэтому делим, чтобы получить 1
                count_duplicate += count2;
                count_original += count1;// и тут его прибавить
            }
        }

        int[] array_new = new int[count_original];
        array_new[0] = array[0];

        int j = 1;
        while (j < count_original) {
            for (int i = j; i < array.length; i++) {
                int k = 0;
                for (int n = 0; n < count_original; n++) {
                    if (array[i] == array_new[n]) {
                        k++; //считаем, встречается ли число из старого массива в новом. Если да, то к увеличивается
                    }
                }
                if (k == 0) { // если число из старого массива не встречается в новом (так к = 0), то записываем его в новый и бреаком переходим к следующему элементу
                    array_new[j++] = array[i];
                    break;
                }
            }
        } return array_new;
    }

    public static int[] justUniques(int[] arr) { //метод из интернета, выдает отсортированный новый массив
        if (arr == null || arr.length == 0) return arr;
        Arrays.sort(arr);
        int n = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) n++;
        }
        int[] res = new int[n];
        res[0] = arr[0];
        n = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) res[n++] = arr[i];
        }
        return res;

    }
        public static void main (String[]args){
            RemoveDuplicates arr1 = new RemoveDuplicates();
            RemoveDuplicates arr11 = new RemoveDuplicates();
            RemoveDuplicates arr111 = new RemoveDuplicates();
            int[] arr2 = arr1.arrayOrigin(new int[]{1, 1, 2, 2, 9, 9, 9, 8, 8});
            int[] arr3 = arr11.justUniques(new int[]{3, 4, 2, 6, 4, 3, 3, 3, 2, 2, 9});
            int[] arr4 = arr111.arrayOrigin(new int[] {0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0});
            int[] arr5 = arr111.justUniques(new int[] {0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0});
            System.out.println(Arrays.toString(arr2));
            System.out.println(Arrays.toString(arr3));
            System.out.println(Arrays.toString(arr4));
            System.out.println(Arrays.toString(arr5));
        }
}

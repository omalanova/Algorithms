package hw1314;

public class ValueOfOddIndexes {
    public int[] valueOfOdd (int[] array) {
        int a = 1;
        int[] arrayNew = new int[array.length / 2];
        for (int i = 0; i < array.length / 2; i++) {
            arrayNew[i] = array[i + a];
            a += 1;
            System.out.print(arrayNew[i] + " ");
        } return arrayNew;
    }


    public static void main(String[] args) {
        ValueOfOddIndexes arr1 = new ValueOfOddIndexes();
        arr1.valueOfOdd(new int[] {-45, 590, 234, 985, 12, 68});
        System.out.println();

//        massiv1.ValueOfOddIndexes arr2 = new massiv1.ValueOfOddIndexes();
//        arr2.ascendingSequence(10, 10, 2);
//        System.out.println();
//
//        massiv1.ValueOfOddIndexes arr3 = new massiv1.ValueOfOddIndexes();
//        arr3.ascendingSequence(10, -25, -5);

    }


}

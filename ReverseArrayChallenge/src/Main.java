public class Main {

    public static int[] numbers = new int[]{1, 2, 3, 4, 5};

    public static void main(String[] args) {
        printArray(numbers);
        int[] reversedArray = reversedArray(numbers);
        printArray(reversedArray);
    }

    public static int[] reversedArray(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}

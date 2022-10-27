public class SortExample {
    public static void main(String[] args) {
        int[] numbers = {40, 7, 59, 4, 1};
        displayValues(numbers);
        //sequentialSearch(numbers, 13);
        //sequentialSearch(numbers, 7);

        selectionSort(numbers);
        displayValues(numbers);
        if (binarySearch(numbers, 7) != -1){
            System.out.println("Value found at "+ binarySearch(numbers, 7));
        } else {
            System.out.println("Value not found");
        }
    }

    static public int binarySearch(int[] numbers, int value){
        int low = 0;
        int high = numbers.length-1;
        while (high>= low){
            int middle = (low+high)/2;
            if (numbers[middle]==value){
                //System.out.println("The number "+value+" is at position "+
                        //middle+" in the list.");
                return middle;
            }
            if (numbers[middle]<value){
                low = middle+1;
            }
            if (numbers[middle]>value){
                high = middle-1;
            }
        }
        //System.out.println("The number "+ value + " is not in the list.");
        return -1;
    }

    static void sequentialSearch(int[] numbers, int value){
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i]== value){
                System.out.println("The number "+value+ " is at position "+
                        i + " in the list");
                return;
            }
        }
        System.out.println("The number "+value+" is not in the list");
    }

    static void selectionSort (int[] numbers){
        int indexMin = 0;
        for (int i = 0; i < numbers.length; i++){
            indexMin = i;
            for (int j = i+1;j<numbers.length;j++){
                if (numbers[j]<numbers[indexMin]){
                    indexMin = j;
                }
            }
            int temp = numbers[i];
            numbers[i]= numbers[indexMin];
            numbers[indexMin]=temp;
        }
    }

    static void bubbleSort(int[] numbers){
        for (int i = 0; i <numbers.length;i++){
            //raises a flag if we need to continue sorting
            boolean flag = false;
            for (int j = 0; j<numbers.length-1;j++){
                if (numbers[j] > numbers[j+1]){
                    flag = true;
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
            if (!flag){
                return;
            }
        }
    }

    static void displayValues (int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}

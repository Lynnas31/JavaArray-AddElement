import java.util.Scanner;

public class addEle {
    public static void main(String[] args) {
        int[] array = {1,3,5,7,8,9,10,12};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the index");
        int index = input.nextInt();
        System.out.println("Enter the Ele");
        int element = input.nextInt();
        if (index<=1 || index >= array.length) {
            System.out.println("Can not add element in array");
        }


        for (int i = array.length-1; i > index ; i--) {
            array[i] = array[i-1];
        }
        array[index]= element;
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
    }
}

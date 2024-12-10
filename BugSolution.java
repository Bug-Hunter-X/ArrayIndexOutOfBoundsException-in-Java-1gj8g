public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        //To avoid any further errors, this line is handled with a conditional check
        if(arr.length > 5 && 5 < arr.length){
            System.out.println(arr[5]);
        } else {
            System.out.println("Index out of bounds");
        }
    }
}
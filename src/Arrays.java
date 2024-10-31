public class Arrays {
    public static void main(String[] args) {
        //instanciando e incrementando array int
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }
    }
}

package global.goit.edu.hero;

public class ArrayWorker {
    public void printElement(int[] array, int index) {
        try {
            System.out.println("value is " + array[index]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("wrong index");
        } finally {
            System.out.println("index is " + index);
        }
    }
}

public class DynamicStringList implements StringList{
    private int[] arr;
    private int size;

    public DynamicStringList(){
        arr = new int[10];
        size = 0;
    }
}

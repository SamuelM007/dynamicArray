public class DynamicStringList implements StringList{
    private int[] arr;
    private int size;

    public DynamicStringList(){
        arr = new int[10];
        size = 0;
    }

    @Override
    public String get(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public void set(int index, String value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'set'");
    }

    @Override
    public void add(String value) {
        size++;
        if(size > arr.length){
            expand();
        }

        arr[size-1] = value;
    }

    @Override
    public String remove(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int capacity() {
        return arr.length;
    }

    private void expand(){
        int[] temp = new int[arr.length * 2];

        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        arr = temp;
    }
}

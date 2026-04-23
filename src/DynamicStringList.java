public class DynamicStringList implements StringList{
    private String[] arr;
    private int size;

    public DynamicStringList(){
        arr = new String[10];
        size = 0;
    }

    @Override
    public String get(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public void set(int index, String value) {
        if(index >= size){
            throw new IndexOutOfBoundsException("current size:" + size);
        }
        arr[index] = value;
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
        if(index >= size){
            throw new IndexOutOfBoundsException("current size:" + size);
        }
        String temp = arr[index];
        for(int i = index; i<size-1;i++){
            arr[i] = arr[i+1];
        }
        return temp;
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
        String[] temp = new String[arr.length * 2];

        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        arr = temp;
    }
}

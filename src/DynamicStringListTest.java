import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class DynamicStringListTest {


    @Test
    public void TestGetNormalValue(){
        DynamicStringList list = new DynamicStringList();

        for(int i = 0; i<10;i++){
            list.add("Test"+i);
        }

        String actual = list.get(5);

        assertEquals("Test5",actual);


    }

    @Test
    public void TestGetNegativeValue(){
        DynamicStringList list = new DynamicStringList();

        for(int i = 0; i<10;i++){
            list.add("Test"+i);
        }

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(-1);
        });
    }

    @Test
    public void TestGetOutOfBoundsValue(){
        DynamicStringList list = new DynamicStringList();        

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(Integer.MAX_VALUE);
        });
    }

    @Test
    public void setTest(){
        DynamicStringList list = new DynamicStringList();

        for(int i = 0; i<10;i++){
            list.add("Test"+i);
        }

        list.set(1, "Test10");
        String actual = list.get(1);

        assertEquals("Test10", actual);
    }

    @Test
    public void setExceptionTest(){
        DynamicStringList list = new DynamicStringList();

        for(int i = 0; i<10;i++){
            list.add("Test"+i);
        }
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.set(10000, "TestException");
        });
    }

    @Test
    public void setExceptionTest2(){
        DynamicStringList list = new DynamicStringList();

        for(int i = 0; i<10;i++){
            list.add("Test"+i);
        }
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.set(-1, "TestException");
        });
    }

    @Test
    public void addTest(){
        DynamicStringList list = new DynamicStringList();
        list.add("Test");
        String actual = list.get(0);
        assertEquals("Test", actual);
    }

    @Test
    public void add1000Test(){
        DynamicStringList list = new DynamicStringList();
        for(int i = 0; i < 1000; i++){
            list.add("Test"+i);
        }

        String actual = list.get(999);
        assertEquals("Test999", actual);
    }

    @Test
    public void removeTest(){
        DynamicStringList list = new DynamicStringList();

        for(int i = 0; i<10;i++){
            list.add("Test"+i);
        }

        list.remove(0);
        String actual = list.get(0);
        assertEquals("Test1", actual);
    }

    @Test
    public void TestSize40(){
        DynamicStringList list = new DynamicStringList();

        for(int i = 0; i<40;i++){
            list.add("Test"+i);
        }

        int actual = list.size();
        assertEquals(40,actual);
    }

    @Test
    public void TestSize160(){
        DynamicStringList list = new DynamicStringList();

        for(int i = 0; i<200;i++){
            list.add("Test"+i);
        }
        for(int i = 200; i > 160; i--){
            list.remove(i-1);
        }

        int actual = list.size();
        assertEquals(160,actual);
    }

    @Test
    public void TestSize320(){
        DynamicStringList list = new DynamicStringList();

        for(int i = 0; i<320;i++){
            list.add("Test"+i);
        }
        for(int i = 0; i < 160; i++){
            list.remove(i);
        }
        for(int i = 160; i<320; i++){
            list.add("Test"+i);
        }

        int actual = list.size();
        assertEquals(320,actual);
    }

    @Test
    public void TestCapacity21(){
        DynamicStringList list = new DynamicStringList();

        for(int i = 0; i<21;i++){
            list.add("Test"+i);
        }

        int actual = list.capacity();
        assertEquals(40,actual);
    }

    @Test
    public void TestCapacity161(){
        DynamicStringList list = new DynamicStringList();

        for(int i = 0; i<161;i++){
            list.add("Test"+i);
        }
        for(int i = 161; i > 80; i--){
            list.remove(i-1);
        }

        int actual = list.capacity();
        assertEquals(320,actual);
    }

    @Test
    public void TestCapacity321(){
        DynamicStringList list = new DynamicStringList();

        for(int i = 0; i<321;i++){
            list.add("Test"+i);
        }
        for(int i = 0; i < 160; i++){
            list.remove(i);
        }
        for(int i = 160; i<320; i++){
            list.add("Test"+i);
        }

        int actual = list.capacity();
        assertEquals(640,actual);
    }



    
}

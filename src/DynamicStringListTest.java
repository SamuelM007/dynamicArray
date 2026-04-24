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

    
}

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

    
}

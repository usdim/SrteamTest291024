import org.example.Ex6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class TestEx6 {
    @Test

    public void testSum1(){

        Map<String,Integer> map3 = Map.of("hdd",5000,"CPU",3000,"RAM",2000);
        Assertions.assertEquals(10000, Ex6.sum(map3));



    }

    @Test
    public void testmap(){
        Map<String,Integer> map3 = Map.of("hdd",5000,"CPU",3000,"RAM",2000);
        Assertions.assertEquals(map3,Map.of("hdd",5000,"CPU",3000,"RAM",2000));


    }




}

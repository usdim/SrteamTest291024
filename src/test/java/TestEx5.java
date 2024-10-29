import org.example.Ex5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.stream.Collectors;

public class TestEx5 {
    @Test

    public void testincreaceMap2(){
        Map<String,Integer> map2 = Map.of("hdd",5000,"CPU",3000,"RAM",2000);

        Map<String,Double> increaceMap3 = map2.entrySet().stream().collect(Collectors.toMap(entr -> entr.getKey(), entr->entr.getValue()+entr.getValue()*0.01));


        Assertions.assertEquals(increaceMap3, Ex5.increaceMap2(map2));



    }


}

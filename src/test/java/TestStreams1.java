import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStreams1 {
    @Test
    public void testStreamsWords() {
        String[] arr = {"Aaaaaaaa", "Bb", "Cccccc", "Ddddddd"};
        Assertions.assertEquals(3, Main.words(arr));


    }

    @Test
    public void testStreamsWords1() {
        String[] arr = {"Aa", "Bb", "Cc", "Dd"};
        Assertions.assertEquals(0, Main.words(arr));

    }

    @Test
    public void testStreamsWords2() {
        String[] arr = {null, null};
        Assertions.assertEquals(0, Main.words(arr));  // Main.words(arr) это метод, тестируем метод

    }

    @Test
    public void testStreamsWords3() {
        String[] arr = {};
        Assertions.assertEquals(0, Main.words(arr));

    }


}


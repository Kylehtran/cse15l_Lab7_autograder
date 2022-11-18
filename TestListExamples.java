import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

class MyChecker implements StringChecker {
    public boolean checkString(String s) {
      return s.contains("b");
    }
}

public class TestListExamples {
    //merge
    //filter

    @Test
    public void testFilter() {
        List<String> input = new ArrayList<>();
        input.add("foo");
        input.add("bar");
        input.add("baz");

        StringChecker sc = new MyChecker();

        List<String> expected = new ArrayList<>();
        expected.add("bar");
        expected.add("baz");

        assertEquals(expected, ListExamples.filter(input, sc));
    }

    @Test
    public void testFilterEmpty() {
        List<String> input = new ArrayList<>();
        StringChecker sc= new MyChecker();
        assertEquals(input, ListExamples.filter(input, sc));
    }
 
    @Test
    public void testMerge() {
        List<String> arr1 = new ArrayList<>();
        List<String> arr2 = new ArrayList<>();

        arr1.add("a");
        arr1.add("c");
        arr2.add("b");
        arr2.add("d");

        List<String> expected = Arrays.asList("a", "b", "c", "d");

        assertEquals(expected, ListExamples.merge(arr1, arr2));
    }

    @Test
    public void testMergeOneEmpty() {
        List<String> arr1 = new ArrayList<>();
        List<String> arr2 = new ArrayList<>();

        arr1.add("a");
        arr1.add("c");

        assertEquals(arr1, ListExamples.merge(arr1, arr2));


    }
 }
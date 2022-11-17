import static org.junit.Assert.*;
import org.junit.*;

public class TestListExamples {
  @Test(timeout = 100)
  public void testTimeout() {
    while(true) {}
  }
  // Write your grading tests here!

  @Test
  public void testFIlter(){

      List<String> input1 = new ArrayList<String>();
      List<String> expected = new ArrayList<String>();

      input1.add("aa");
      input1.add("c");
      input1.add("b");
      input1.add("daa");

      expected.add("c");
      expected.add("b");

      StringChecker c = new containAA();
      
      assertEquals(expected, ListExamples.filter(input1, c));
  }
  
  @Test 
  public void testMerge(){

      List<String> input1 = new ArrayList<String>();
      List<String> input2 = new ArrayList<String>();
      List<String> expected = new ArrayList<String>();

      input1.add("a");
      input1.add("c");
      input2.add("b");
      input2.add("d");

      expected.add("a");
      expected.add("b");
      expected.add("c");
      expected.add("d");

      assertEquals(expected, ListExamples.merge(input1, input2));
  }
}
class containAA implements StringChecker{
  public boolean checkString(String s){

      if(s.contains("aa")){
          return false;
      }
      return true;
  }
}

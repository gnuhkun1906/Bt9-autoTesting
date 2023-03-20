package bt2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleClassifierTest {
    @Test
  void testTGD(){
      int a=2;
      int b=2;
      int c=2;
      String expected="tam giác đều";
      String result=TriangleClassifier.test(a,b,c);
      assertEquals(expected,result);
  }
  @Test
    void testTGC(){
        int a=2;
        int b=2;
        int c=3;
        String expected="tam giác cân";
        String result=TriangleClassifier.test(a,b,c);
        assertEquals(expected,result);
    }

    @Test
    void testTGT(){
        int a=3;
        int b=4;
        int c=5;
        String expected="tam giác";
        String result=TriangleClassifier.test(a,b,c);
        assertEquals(expected,result);
    }

    @Test
    void testKPTG(){
        int a=8;
        int b=2;
        int c=3;
        String expected="Không phải là tam giác";
        String result=TriangleClassifier.test(a,b,c);
        assertEquals(expected,result);
    }
}
package vzdornov.algo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class AppTest 
{

ISort[] sorts = { new Bucketsort(),new RadixSort(),new CountingSort() };

  @Test
  void testSort() {

    final int[] data = {15, 3, 0, 11, 7, 5, 15, 12, 99, 11};
    String arrayExpected = "[0, 3, 5, 7, 11, 11, 12, 15, 15, 99]";
    for(int i= 0; i < sorts.length; i++) {
      sorts[i].sort(data);
      assertEquals(arrayExpected, Arrays.toString(data));
    }
  }
}

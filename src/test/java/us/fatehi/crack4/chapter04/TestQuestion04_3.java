package us.fatehi.crack4.chapter04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static us.fatehi.crack4.chapter04.Question04_1.isBalanced;
import static us.fatehi.crack4.chapter04.Question04_1.maxDepth;
import static us.fatehi.crack4.chapter04.Question04_3.createMinimalBST;
import static us.fatehi.crack4.util.TreeNodePrinter.print;

import org.junit.jupiter.api.Test;

import us.fatehi.crack4.util.TreeNode;

public class TestQuestion04_3 {

  @Test
  public void test1Question04_3() {

    final int[] arr = {
      1, 2, 3, 4, 5, 10, 15, 20, 25, 30, 50, 100,
    };

    final TreeNode minimalBST = createMinimalBST(arr);
    print(minimalBST);

    assertTrue(isBalanced(minimalBST));
    assertEquals(4, maxDepth(minimalBST));
  }
}

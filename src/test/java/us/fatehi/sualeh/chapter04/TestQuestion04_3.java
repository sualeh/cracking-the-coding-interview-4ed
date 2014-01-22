package us.fatehi.sualeh.chapter04;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import us.fatehi.sualeh.util.TreeNode;
import us.fatehi.sualeh.util.TreeNodePrinter;

public class TestQuestion04_3
{

  @Test
  public void test1Question04_3()
  {

    final int[] arr = {
        1, 2, 3, 4, 5, 10, 15, 20, 25, 30, 50, 100,
    };
    Arrays.sort(arr);

    TreeNode minimalBST = Question04_3.createMinimalBST(arr);
    TreeNodePrinter.print(minimalBST);

    assertTrue(Question04_1.isBalanced(minimalBST));
    assertEquals(4, Question04_1.maxDepth(minimalBST));
    
  }

}

package us.fatehi.sualeh.chapter04;


import static us.fatehi.sualeh.chapter04.Question04_8.findSum;

import org.junit.Test;

import us.fatehi.sualeh.testutil.TreeNodeTest;

public class TestQuestion04_8
  extends TreeNodeTest
{

  @Test
  public void test1Question04_8()
  {
    findSum(sumRoot, 5);
  }

}

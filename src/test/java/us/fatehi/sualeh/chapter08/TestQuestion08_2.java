package us.fatehi.sualeh.chapter08;


import static us.fatehi.sualeh.chapter08.Question08_2.getPaths;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import us.fatehi.sualeh.testutil.TreeNodeTest;
import us.fatehi.sualeh.util.Point;

public class TestQuestion08_2
  extends TreeNodeTest
{

  @Test
  public void test1Question08_2()
  {

    Collection<List<Point>> allPaths = getPaths(4, 4);
    for (List<Point> path: allPaths)
    {
      System.out.println(path);
    }

  }

}

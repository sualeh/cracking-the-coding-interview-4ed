package us.fatehi.crack4.chapter08;

import static us.fatehi.crack4.chapter08.Question08_2.getPaths;

import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Test;

import us.fatehi.crack4.testutil.TreeNodeTest;
import us.fatehi.crack4.util.Point;

public class TestQuestion08_2 extends TreeNodeTest {

  @Test
  public void test1Question08_2() {

    Collection<List<Point>> allPaths = getPaths(4, 4);
    for (List<Point> path : allPaths) {
      System.out.println(path);
    }
  }
}

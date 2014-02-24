package us.fatehi.sualeh.chapter08;


import static org.junit.Assert.assertEquals;
import static us.fatehi.sualeh.chapter08.Question08_3.getSubsets;
import static us.fatehi.sualeh.chapter08.Question08_3.getSubsets2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestQuestion08_3
{

  private List<Integer> set;

  private final Comparator<List<Integer>> comparator = new Comparator<List<Integer>>()
  {

    @Override
    public int compare(final List<Integer> list1, final List<Integer> list2)
    {
      if (list1 == null)
      {
        return -1;
      }
      if (list2 == null)
      {
        return 1;
      }
      if (list1.size() != list2.size())
      {
        return list1.size() - list2.size();
      }

      for (int i = 0; i < list1.size(); i++)
      {
        if (list1.get(i) != list2.get(i))
        {
          return list1.get(i) - list2.get(i);
        }
      }

      return 0;
    }

  };

  private final String expected = "[[], [1], [2], [3], [4], [5], [1, 2], [1, 3], [1, 4], [1, 5], [2, 3], [2, 4], [2, 5], [3, 4], [3, 5], [4, 5], [1, 2, 3], [1, 2, 4], [1, 2, 5], [1, 3, 4], [1, 3, 5], [1, 4, 5], [2, 3, 4], [2, 3, 5], [2, 4, 5], [3, 4, 5], [1, 2, 3, 4], [1, 2, 3, 5], [1, 2, 4, 5], [1, 3, 4, 5], [2, 3, 4, 5], [1, 2, 3, 4, 5]]";

  @Before
  public void setup()
  {
    set = Arrays.asList(1, 2, 3, 4, 5);
  }

  @Test
  public void test1Question08_3_1()
  {
    final List<List<Integer>> allsubsets = getSubsets(set, 0);
    print("getSubsets:", allsubsets);
    sort(allsubsets);
    assertEquals(expected, allsubsets.toString());
  }

  @Test
  public void test1Question08_3_2()
  {

    final List<List<Integer>> allsubsets = getSubsets2(set);
    print("getSubsets2:", allsubsets);
    sort(allsubsets);
    assertEquals(expected, allsubsets.toString());
  }

  private void print(final String title, final List<List<Integer>> allsubsets)
  {
    System.out.println("\n" + title);
    System.out.println(allsubsets.toString().replace("], [", "\n")
      .replace("[[", "(empty set)").replace("]]", ""));
  }

  private void sort(final List<List<Integer>> allsubsets)
  {
    for (final List<Integer> subset: allsubsets)
    {
      Collections.sort(subset);
    }
    Collections.sort(allsubsets, comparator);
  }

}

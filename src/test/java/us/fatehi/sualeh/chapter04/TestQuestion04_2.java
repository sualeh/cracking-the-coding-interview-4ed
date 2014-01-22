package us.fatehi.sualeh.chapter04;


import static org.junit.Assert.assertTrue;

import org.junit.Test;

import us.fatehi.sualeh.util.Graph;
import us.fatehi.sualeh.util.Graph.Node;

public class TestQuestion04_2
{

  @Test
  public void test1Question04_2()
  {

    final Graph graph = makeGraph();

    assertTrue(Question04_2.search(graph,
                                   graph.getNode("7"),
                                   graph.getNode("9")));
    assertTrue(!Question04_2.search(graph,
                                    graph.getNode("7"),
                                    graph.getNode("5")));

  }

  private Graph makeGraph()
  {
    final Graph g = new Graph();
    final Node seven = g.addNode("7");
    final Node five = g.addNode("5");
    final Node three = g.addNode("3");
    final Node eleven = g.addNode("11");
    final Node eight = g.addNode("8");
    final Node two = g.addNode("2");
    final Node nine = g.addNode("9");
    final Node ten = g.addNode("10");
    seven.addEdgeTo(eleven).addEdgeTo(eight);
    five.addEdgeTo(eleven);
    three.addEdgeTo(eight).addEdgeTo(ten);
    eleven.addEdgeTo(two).addEdgeTo(nine).addEdgeTo(ten);
    eight.addEdgeTo(nine).addEdgeTo(ten);

    return g;
  }

}

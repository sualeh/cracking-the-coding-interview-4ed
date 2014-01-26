package us.fatehi.sualeh.chapter04;


import java.util.Stack;

import us.fatehi.sualeh.util.Graph;
import us.fatehi.sualeh.util.Graph.Node;
import us.fatehi.sualeh.util.Graph.State;

/**
 * 4.2 Given a directed graph, design an algorithm to find out whether
 * there is a route between two nodes.
 */
public class Question04_2
{

  /*
   * This problem can be solved by just simple graph traversal, such as
   * depth first search or breadth first search. We start with one of
   * the two nodes and, during traversal, check if the other node is
   * found. We should mark any node found in the course of the algorithm
   * as ‘already visited’ to avoid cycles and repetition of the nodes.
   */

  public static boolean search(final Graph g, final Node start, final Node end)
  {
    final Stack<Node> q = new Stack<Node>();
    for (final Node u: g.getNodes())
    {
      u.state = State.Unvisited;
    }
    start.state = State.Visiting;
    q.add(start);
    Node u;
    while (!q.isEmpty())
    {
      u = q.pop();
      if (u != null)
      {
        for (final Node v: u.getAdjacent())
        {
          if (v.state == State.Unvisited)
          {
            if (v == end)
            {
              return true;
            }
            else
            {
              v.state = State.Visiting;
              q.add(v);
            }
          }
        }
        u.state = State.Visited;
      }
    }
    return false;
  }

}

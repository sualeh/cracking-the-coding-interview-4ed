/**
 * This work is licensed under the Creative Commons Attribution-NonCommercial 3.0 Unported License. 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc/3.0/deed.en_US.
 * 
 * Copyright (c) 2013-2014 Sualeh Fatehi, sualeh@hotmail.com
 */
package us.fatehi.sualeh.util;


import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Graph
{

  public class Edge
  {

    public final Node from;
    public final Node to;

    private Edge(final Node from, final Node to)
    {
      this.from = from;
      this.to = to;
    }

  }

  public class Node
  {
    public final String name;
    public final Collection<Edge> inEdges;
    public final Collection<Edge> outEdges;
    public State state;

    private Node(final String name)
    {
      this.name = name;
      inEdges = new HashSet<>();
      outEdges = new HashSet<>();
    }

    public Node addEdgeTo(final Node node)
    {
      final Edge e = new Edge(this, node);
      outEdges.add(e);
      node.inEdges.add(e);
      return this;
    }

    public Collection<Node> getAdjacent()
    {
      final Collection<Node> adjacentNodes = new HashSet<>();
      for (final Edge edge: outEdges)
      {
        adjacentNodes.add(edge.to);
      }
      return adjacentNodes;
    }

    @Override
    public String toString()
    {
      return name;
    }

  }

  public enum State
  {
    Unvisited,
    Visited,
    Visiting;
  }

  private final Map<String, Node> nodes;

  public Graph()
  {
    nodes = new HashMap<>();
  }

  public Node addNode(final String name)
  {
    final Node node = new Node(name);
    nodes.put(name, node);
    return node;
  }

  public Node getNode(final String name)
  {
    return nodes.get(name);
  }

  public Collection<Node> getNodes()
  {
    return nodes.values();
  }

}

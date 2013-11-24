package us.fatehi.sualeh.util;


public class LinkedListNode
{

  public int data;
  public LinkedListNode next;

  public LinkedListNode(final int d)
  {
    data = d;
  }

  @Override
  public String toString()
  {
    return String.format("[%d] -> %s",
                         data,
                         next == null? "<end>": String
                           .format("[%d]", next.data));
  }

}

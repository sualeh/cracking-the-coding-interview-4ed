package us.fatehi.sualeh.util;



public class LinkedListNode
{

  public LinkedListNode next;

  public int data;

  public LinkedListNode(final int d)
  {
    data = d;
  }

  void appendToTail(final int d)
  {
    final LinkedListNode end = new LinkedListNode(d);
    LinkedListNode n = this;
    while (n.next != null)
    {
      n = n.next;
    }
    n.next = end;
  }

}

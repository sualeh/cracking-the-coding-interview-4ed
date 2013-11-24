package us.fatehi.sualeh.chapter02;


import us.fatehi.sualeh.util.LinkedListNode;

/**
 * 2.5 Given a circular linked list, implement an algorithm which
 * returns node at the beginning of the loop. DEFINITION Circular linked
 * list: A (corrupt) linked list in which a node’s next pointer points
 * to an earlier node, so as to make a loop in the linked list. EXAMPLE
 * Input: A -> B -> C -> D -> E -> C [the same C as earlier] Output: C
 */
public class Question02_5
{

  /*
   * If we move two pointers, one with speed 1 and another with speed 2,
   * they will end up meeting if the linked list has a loop. Why? Think
   * about two cars driving on a track—the faster car will always pass
   * the slower one! The tricky part here is finding the start of the
   * loop. Imagine, as an analogy, two people racing around a track, one
   * running twice as fast as the other. If they start off at the same
   * place, when will they next meet? They will next meet at the start
   * of the next lap. Now, let’s suppose Fast Runner had a head start of
   * k meters on an n step lap. When will they next meet? They will meet
   * k meters before the start of the next lap. (Why? Fast Runner would
   * have made k + 2(n - k) steps, including its head start, and Slow
   * Runner would have made n - k steps. Both will be k steps before the
   * start of the loop.) Now, going back to the problem, when Fast
   * Runner (n2) and Slow Runner (n1) are moving around our circular
   * linked list, n2 will have a head start on the loop when n1 enters.
   * Specifically, it will have a head start of k, where k is the number
   * of nodes before the loop. Since n2 has a head start of k nodes, n1
   * and n2 will meet k nodes before the start of the loop. So, we now
   * know the following: 1. Head is k nodes from LoopStart (by
   * definition). 2. MeetingPoint for n1 and n2 is k nodes from
   * LoopStart (as shown above). Thus, if we move n1 back to Head and
   * keep n2 at MeetingPoint, and move them both at the same pace, they
   * will meet at LoopStart.
   */
  public static LinkedListNode findBeginning(final LinkedListNode head)
  {
    LinkedListNode n1 = head;
    LinkedListNode n2 = head;

    // Find meeting point
    while (n2 != null && n2.next != null)
    {
      n1 = n1.next;
      n2 = n2.next.next;
      if (n1 == n2)
      {
        break;
      }
    }

    // Error check - there is no meeting point, and therefore no loop
    if (n2 == null || n2.next == null)
    {
      return null;
    }

    /*
     * Move n1 to Head. Keep n2 at Meeting Point. Each are k steps from
     * the Loop Start. If they move at the same pace, they must meet at
     * Loop Start.
     */
    n1 = head;
    while (n1 != n2)
    {
      n1 = n1.next;
      n2 = n2.next;
    }
    // Now n2 points to the start of the loop.
    return n2;
  }

}

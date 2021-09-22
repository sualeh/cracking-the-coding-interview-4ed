/**
 * This work is licensed under the Creative Commons Attribution-NonCommercial 3.0 Unported License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc/3.0/deed.en_US.
 *
 * <p>Copyright (c) 2013-2021 Sualeh Fatehi, sualeh@hotmail.com
 */
package us.fatehi.crack4.util;

public class LinkedListNode {

  public int data;
  public LinkedListNode next;

  public LinkedListNode(final int d) {
    data = d;
  }

  @Override
  public String toString() {
    return String.format(
        "[%d] -> %s", data, next == null ? "<end>" : String.format("[%d]", next.data));
  }
}

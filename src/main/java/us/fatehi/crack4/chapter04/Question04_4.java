package us.fatehi.crack4.chapter04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import us.fatehi.crack4.util.TreeNode;

/**
 * 4.4 Given a binary search tree, design an algorithm which creates a linked list of all the nodes
 * at each depth (eg, if you have a tree with depth D, you’ll have D linked lists).
 */
public class Question04_4 {

  /*
   * We can do a simple level by level traversal of the tree, with a
   * slight modification of the breath-first traversal of the tree. In a
   * usual breath first search traversal, we simply traverse the nodes
   * without caring which level we are on. In this case, it is critical
   * to know the level. We use the list for a level to find children on
   * the next level, to build the next list.
   */
  public static List<LinkedList<TreeNode>> findLevelLinkList(final TreeNode root) {
    int level = 0;
    final List<LinkedList<TreeNode>> result = new ArrayList<>();
    LinkedList<TreeNode> list = new LinkedList<>();
    list.add(root);
    result.add(level, list);
    while (true) {
      list = new LinkedList<>();
      for (final TreeNode n : result.get(level)) {
        if (n != null) {
          if (n.left() != null) {
            list.add(n.left());
          }
          if (n.right() != null) {
            list.add(n.right());
          }
        }
      }
      if (list.size() > 0) {
        level = level + 1;
        result.add(level, list);
      } else {
        break;
      }
    }
    return result;
  }
}

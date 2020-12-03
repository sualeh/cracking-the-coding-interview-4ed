/**
 * This work is licensed under the Creative Commons Attribution-NonCommercial 3.0 Unported License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc/3.0/deed.en_US.
 *
 * <p>Copyright (c) 2013-2014 Sualeh Fatehi, sualeh@hotmail.com
 */
package us.fatehi.sualeh.util;

/**
 * @see <a href="http://stackoverflow.com/questions/4965335/how-to-print-binary-tree-diagram">How to
 *     Print a Binary Tree Diagram</a>
 */
public class TreeNodePrinter {

  public static void print(final TreeNode node) {
    print(node, "", true);
  }

  private static void print(final TreeNode node, final String prefix, final boolean isTail) {
    if (node == null) {
      System.out.println(prefix + (isTail ? "└── " : "├── ") + "\u25A0");
    } else {
      System.out.println(prefix + (isTail ? "└── " : "├── ") + node.toString());
      print(node.left(), prefix + (isTail ? "    " : "│   "), false);
      print(node.right(), prefix + (isTail ? "    " : "│   "), true);
    }
  }
}

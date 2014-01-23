package us.fatehi.sualeh.util;

/**
 * http://stackoverflow.com/questions/4965335/how-to-print-binary-tree-diagram
 */
public class TreeNodePrinter
{

  public static void print(TreeNode node)
  {
    print(node, "", true);
  }

  private static void print(TreeNode node, String prefix, boolean isTail)
  {
    if (node == null)
    {
      System.out.println(prefix + (isTail? "└── ": "├── ") + "\u25A0");
    }
    else
    {
      System.out.println(prefix + (isTail? "└── ": "├── ") + node.toString());
      print(node.left, prefix + (isTail? "    ": "│   "), false);
      print(node.right, prefix + (isTail? "    ": "│   "), true);
    }
  }

}

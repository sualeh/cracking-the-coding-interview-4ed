package us.fatehi.sualeh.util;


public class TreeNode
{

  final int value;
  public TreeNode left;
  public TreeNode right;

  public TreeNode()
  {
    this(0);
  }

  public TreeNode(final int value)
  {
    this.value = value;
  }

  @Override
  public String toString()
  {
    return String.valueOf(value);
  }

}

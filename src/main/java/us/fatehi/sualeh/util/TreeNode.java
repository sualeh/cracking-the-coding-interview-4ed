package us.fatehi.sualeh.util;


public class TreeNode
{

  private final int value;
  private TreeNode left;
  private TreeNode right;
  private TreeNode parent;

  public TreeNode()
  {
    this(0);
  }

  public TreeNode(final int value)
  {
    this.value = value;
  }

  public TreeNode addLeft(final TreeNode nodeL)
  {
    left = nodeL;
    if (nodeL != null)
    {
      nodeL.parent = this;
    }
    return this;
  }

  public TreeNode addRight(final TreeNode nodeR)
  {
    right = nodeR;
    if (nodeR != null)
    {
      nodeR.parent = this;
    }
    return this;
  }

  public int value()
  {
    return value;
  }

  public TreeNode left()
  {
    return left;
  }

  public TreeNode parent()
  {
    return parent;
  }

  public TreeNode right()
  {
    return right;
  }

  @Override
  public String toString()
  {
    return String.valueOf(value);
  }

}

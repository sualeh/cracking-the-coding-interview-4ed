package us.fatehi.sualeh.util;


public class Point
{
  
  private final int x, y;

  public Point(final int x, final int y)
  {
    this.x = x;
    this.y = y;
  }

  @Override
  public boolean equals(final Object obj)
  {
    if (this == obj)
    {
      return true;
    }
    if (obj == null)
    {
      return false;
    }
    if (getClass() != obj.getClass())
    {
      return false;
    }
    final Point other = (Point) obj;
    if (x != other.x)
    {
      return false;
    }
    if (y != other.y)
    {
      return false;
    }
    return true;
  }

  public int getX()
  {
    return x;
  }

  public int getY()
  {
    return y;
  }

  @Override
  public int hashCode()
  {
    final int prime = 31;
    int result = 1;
    result = prime * result + x;
    result = prime * result + y;
    return result;
  }

  @Override
  public String toString()
  {
    return "(" + x + ", " + y + ")";
  }

}

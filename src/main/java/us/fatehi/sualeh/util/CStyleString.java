/**
 * This work is licensed under the Creative Commons Attribution-NonCommercial 3.0 Unported License. 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc/3.0/deed.en_US.
 * 
 * @author Sualeh Fatehi
 */
package us.fatehi.sualeh.util;


public class CStyleString
{

  private final StringBuilder buffer;

  public CStyleString()
  {
    this("");
  }

  public CStyleString(final String str)
  {
    buffer = new StringBuilder(str);
  }

  public char charAt(final int index)
  {
    return buffer.charAt(index);
  }

  public int codePointAt(final int index)
  {
    return buffer.codePointAt(index);
  }

  @Override
  public boolean equals(final Object obj)
  {
    return buffer.toString().equals(String.valueOf(obj));
  }

  @Override
  public int hashCode()
  {
    return buffer.hashCode();
  }

  public int length()
  {
    return buffer.length();
  }

  public void setCharAt(final int index, final char ch)
  {
    if (index == buffer.length() && ch == 0)
    {
      return;
    }
    else if (index < buffer.length() && ch == 0)
    {
      buffer.setLength(index);
    }
    else
    {
      buffer.setCharAt(index, ch);
    }
  }

  @Override
  public String toString()
  {
    return buffer.toString();
  }

}

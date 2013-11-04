/**
 * This work is licensed under the Creative Commons Attribution-NonCommercial 3.0 Unported License. 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc/3.0/deed.en_US.
 * 
 * Copyright (c) 2013 Sualeh Fatehi, sualeh@hotmail.com
 */
package us.fatehi.sualeh.util;


import java.util.Arrays;

/**
 * Simulates a zero-terminated C-style string, for use in algorithms.
 * The string is mutable, and allows setting characters beyond the end
 * of the length of the string.
 */
public class CStyleString
{

  private final StringBuilder buffer;

  public CStyleString()
  {
    this("");
  }

  public CStyleString(final char[] str)
  {
    if (str == null)
    {
      throw new IllegalArgumentException("Cannot initialize with null string");
    }

    buffer = new StringBuilder(str.length);
    for (final char ch: str)
    {
      if (ch == 0)
      {
        break;
      }
      buffer.append(ch);
    }
  }

  public CStyleString(final CharSequence str)
  {
    if (str == null)
    {
      throw new IllegalArgumentException("Cannot initialize with null string");
    }

    buffer = new StringBuilder(str);
  }

  /**
   * @see StringBuilder#charAt(int)
   */
  public char charAt(final int index)
  {
    return buffer.charAt(index);
  }

  /**
   * @see StringBuilder#codePointAt(int)
   */
  public int codePointAt(final int index)
  {
    return buffer.codePointAt(index);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean equals(final Object obj)
  {
    return buffer.toString().equals(String.valueOf(obj));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int hashCode()
  {
    return buffer.hashCode();
  }

  /**
   * @see StringBuilder#length()
   */
  public int length()
  {
    return buffer.length();
  }

  /**
   * @see StringBuilder#setCharAt(int, char)
   */
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
    else if (index > buffer.length())
    {
      // Calculate extension required
      int extensionLength = index + 1 - buffer.length();
      if (ch == 0)
      {
        extensionLength--;
      }
      // Extend with junk characters
      final char[] extension = new char[extensionLength];
      Arrays.fill(extension, '~'); // junk data
      buffer.append(extension);
      // Set the character
      if (ch != 0)
      {
        buffer.setCharAt(index, ch);
      }
    }
    else
    {
      buffer.setCharAt(index, ch);
    }
  }

  /**
   * @see String#toCharArray()
   */
  public char[] toCharArray()
  {
    return buffer.toString().toCharArray();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String toString()
  {
    return buffer.toString();
  }

}

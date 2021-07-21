/**
 * This work is licensed under the Creative Commons Attribution-NonCommercial 3.0 Unported License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc/3.0/deed.en_US.
 *
 * <p>Copyright (c) 2013-2014 Sualeh Fatehi, sualeh@hotmail.com
 */
package us.fatehi.crack4.util;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Simulates a zero-terminated C-style string, for use in algorithms. The string is mutable, and
 * allows setting characters beyond the end of the length of the string.
 */
public class CStyleString implements CharSequence, Serializable, Comparable<CharSequence> {

  private static final long serialVersionUID = 3752079478974015220L;

  private static final char NULL_CHARACTER = '\0';
  private static final char JUNK_CHARACTER = '\u2610';

  private final StringBuilder buffer;

  public CStyleString() {
    this("");
  }

  public CStyleString(final char[] str) {
    if (str == null) {
      throw new IllegalArgumentException("Cannot initialize with null string");
    }

    buffer = new StringBuilder(str.length);
    for (final char ch : str) {
      if (ch == 0) {
        break;
      }
      buffer.append(ch);
    }
  }

  public CStyleString(final CharSequence str) {
    if (str == null) {
      throw new IllegalArgumentException("Cannot initialize with null string");
    }

    buffer = new StringBuilder(str);
  }

  /** @see StringBuilder#charAt(int) */
  @Override
  public char charAt(final int index) {
    if (index > buffer.length()) {
      throw new IllegalAccessError("Access beyond the buffer boundary");
    } else if (index == buffer.length()) {
      return NULL_CHARACTER;
    } else {
      return buffer.charAt(index);
    }
  }

  /** @see StringBuilder#codePointAt(int) */
  public int codePointAt(final int index) {
    return buffer.codePointAt(index);
  }

  @Override
  public int compareTo(final CharSequence o) {
    return toString().compareTo(String.valueOf(o));
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(final Object obj) {
    return buffer.toString().equals(String.valueOf(obj));
  }

  public char get(final int index) {
    return charAt(index);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return buffer.hashCode();
  }

  /** @see StringBuilder#length() */
  @Override
  public int length() {
    return buffer.length();
  }

  public void set(final int index, final char ch) {
    setCharAt(index, ch);
  }

  /** @see StringBuilder#setCharAt(int, char) */
  public void setCharAt(final int index, final char ch) {
    if (index == buffer.length() && ch == NULL_CHARACTER) {
      return;
    } else if (index < buffer.length() && ch == NULL_CHARACTER) {
      buffer.setLength(index);
    } else if (index > buffer.length()) {
      // Calculate extension required
      int extensionLength = index + 1 - buffer.length();
      if (ch == NULL_CHARACTER) {
        extensionLength--;
      }
      // Extend with junk characters
      final char[] extension = new char[extensionLength];
      Arrays.fill(extension, JUNK_CHARACTER);
      buffer.append(extension);
      // Set the character
      if (ch != NULL_CHARACTER) {
        buffer.setCharAt(index, ch);
      }
    } else {
      buffer.setCharAt(index, ch);
    }
  }

  public int size() {
    return length();
  }

  public void strcat(final CharSequence str) {
    if (str != null) {
      buffer.append(str);
    }
  }

  public int strcmp(final CharSequence o) {
    return compareTo(o);
  }

  public int strlen() {
    return length();
  }

  @Override
  public CharSequence subSequence(final int start, final int end) {
    return buffer.subSequence(start, end);
  }

  /** @see String#toCharArray() */
  public char[] toCharArray() {
    return Arrays.copyOf(buffer.toString().toCharArray(), length() + 1);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return buffer.toString();
  }
}

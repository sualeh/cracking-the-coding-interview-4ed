package us.fatehi.sualeh.chapter01;


import java.util.HashSet;
import java.util.Set;

/**
 * 1.1 Implement an algorithm to determine if a string has all unique
 * characters. What if you can not use additional data structures?
 */
public class Question01_1
{

  // We can reduce our space usage a little bit by using a bit vector.
  // We will
  // assume, in the below code, that the string is only lower case ‘a’
  // through
  // ‘z’. This will allow us to use just a single int
  public static boolean isUniqueChars(final String str)
  {

    // Basic error checking
    if (str == null || str.isEmpty())
    {
      return true;
    }

    int checker = 0;
    for (int i = 0; i < str.length(); ++i)
    {
      final int val = str.charAt(i) - 'a';
      if ((checker & 1 << val) > 0)
      {
        return false;
      }
      checker |= 1 << val;
    }
    return true;
  }

  // For simplicity, assume char set is ASCII (if not, we need to
  // increase the
  // storage size. The rest of the logic would be the same). NOTE: This
  // is a
  // great thing to point out to your interviewer!
  // Time complexity is O(n), where n is the length of the string, and
  // space
  // complexity is O(n).
  public static boolean isUniqueChars2(final String str)
  {

    // Basic error checking
    if (str == null || str.isEmpty())
    {
      return true;
    }

    // Assume only ASCII characters, not Unicode
    final boolean[] char_set = new boolean[256];

    for (int i = 0; i < str.length(); i++)
    {
      final int val = str.charAt(i);
      if (char_set[val])
      {
        return false;
      }
      char_set[val] = true;
    }
    return true;
  }

  public static boolean isUniqueCharsUnicode(final String str)
  {

    // Basic error checking
    if (str == null || str.isEmpty())
    {
      return true;
    }

    final Set<Integer> char_set = new HashSet<>();

    for (int i = 0; i < str.length(); i++)
    {
      final int val = Character.codePointAt(str, i);
      if (char_set.contains(val))
      {
        return false;
      }
      char_set.add(val);
    }
    return true;
  }

}

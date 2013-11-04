package us.fatehi.sualeh.chapter01;


import us.fatehi.sualeh.util.CStyleString;

/**
 * 1.2 Write code to reverse a C-Style String. (C-String means that
 * “abcd” is represented as five characters, including the null
 * character.)
 */
public class Question01_2
{

  // This is a classic interview question. The only “gotcha” is to try
  // to do it in place, and to be careful for the null character.
  public static void reverse(final CStyleString str)
  {

    if (str == null)
    {
      return;
    }

    final int len = str.length();
    if (len < 2)
    {
      return;
    }

    int start = 0;
    int end = len - 1;
    while (start < end)
    {
      final char tmp = str.charAt(start);
      str.setCharAt(start, str.charAt(end));
      str.setCharAt(end, tmp);
      start++;
      end--;
    }
  }

}

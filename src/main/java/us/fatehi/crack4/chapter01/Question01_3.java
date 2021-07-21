package us.fatehi.crack4.chapter01;

import java.util.HashSet;
import java.util.Set;

import us.fatehi.crack4.util.CStyleString;

/**
 * 1.3 Design an algorithm and write code to remove the duplicate characters in a string without
 * using any additional buffer. NOTE: One or two additional variables are fine. An extra copy of the
 * array is not. FOLLOW UP Write the test cases for this method.
 */
public class Question01_3 {

  // First, ask yourself, what does the interviewer mean by an
  // additional buffer? Can we use an additional array of constant size?
  // Algorithm—No (Large) Additional Memory:
  // 1. For each character, check if it is a duplicate of already found
  // characters.
  // 2. Skip duplicate characters and update the non duplicate
  // characters.
  // Time complexity is O(N2).
  public static void removeDuplicates(final CStyleString str) {

    if (str == null) {
      return;
    }

    final int len = str.length();
    if (len < 2) {
      return;
    }

    int tail = 1;

    for (int i = 1; i < len; ++i) {
      int j;
      for (j = 0; j < tail; ++j) {
        if (str.charAt(i) == str.charAt(j)) {
          break;
        }
      }
      if (j == tail) {
        str.setCharAt(tail, str.charAt(i));
        ++tail;
      }
    }
    str.setCharAt(tail, (char) 0);
  }

  // With Additional Memory of Constant Size
  public static void removeDuplicatesEff(final CStyleString str) {
    if (str == null) {
      return;
    }

    final int len = str.length(); // null-terminated character array
    if (len < 2) {
      return;
    }

    final Set<Integer> char_set = new HashSet<>();

    char_set.add(str.codePointAt(0));
    int tail = 1;
    for (int i = 1; i < len; ++i) {
      if (!char_set.contains(str.codePointAt(i))) {
        str.setCharAt(tail, str.charAt(i));
        ++tail;
        char_set.add(str.codePointAt(i));
      }
    }
    str.setCharAt(tail, (char) 0);
  }
}

package us.fatehi.sualeh.chapter01;

import java.util.Arrays;

/** 1.4 Write a method to decide if two strings are anagrams or not. */
public class Question01_4 {

  public static boolean isAnagram(final String s, final String t) {
    return sort(s).equals(sort(t));
  }

  private static String sort(final String s) {
    if (s == null) {
      return "";
    } else {
      final char[] strchar = s.toCharArray();
      Arrays.sort(strchar);
      return new String(strchar);
    }
  }
}

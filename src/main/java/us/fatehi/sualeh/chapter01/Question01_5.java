package us.fatehi.sualeh.chapter01;

import us.fatehi.sualeh.util.CStyleString;

/** 1.5 Write a method to replace all spaces in a string with ‘%20’. */
public class Question01_5 {

  public static void replaceSpaces(final CStyleString str) {
    if (str == null) {
      return;
    }

    int spaceCount = 0, newLength, i = 0;
    final int length = str.length();
    for (i = 0; i < length; i++) {
      if (str.charAt(i) == ' ') {
        spaceCount++;
      }
    }
    newLength = length + spaceCount * 2;
    str.setCharAt(newLength, '\0');
    for (i = length - 1; i >= 0; i--) {
      if (str.charAt(i) == ' ') {
        str.setCharAt(newLength - 1, '0');
        str.setCharAt(newLength - 2, '2');
        str.setCharAt(newLength - 3, '%');
        newLength = newLength - 3;
      } else {
        str.setCharAt(newLength - 1, str.charAt(i));
        newLength = newLength - 1;
      }
    }
  }
}

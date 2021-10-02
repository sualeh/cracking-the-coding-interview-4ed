package us.fatehi.crack4.chapter01;

import us.fatehi.crack4.util.CStyleString;

/** 1.5 Write a method to replace all spaces in a string with '%20'. */
public class Question01_5 {

  public static void replaceSpaces(final CStyleString str) {
    if (str == null) {
      return;
    }

    int spaceCount = 0, newLength, i = 0;
    final int length = str.length();
    for (i = 0; i < length; i++) {
      if (str.get(i) == ' ') {
        spaceCount++;
      }
    }
    newLength = length + spaceCount * 2;
    str.set(newLength, '\0');
    for (i = length - 1; i >= 0; i--) {
      if (str.get(i) == ' ') {
        str.set(newLength - 1, '0');
        str.set(newLength - 2, '2');
        str.set(newLength - 3, '%');
        newLength = newLength - 3;
      } else {
        str.set(newLength - 1, str.get(i));
        newLength = newLength - 1;
      }
    }
  }
}

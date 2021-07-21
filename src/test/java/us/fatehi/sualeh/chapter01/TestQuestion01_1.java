package us.fatehi.sualeh.chapter01;

import static us.fatehi.sualeh.chapter01.Question01_1.isUniqueChars;
import static us.fatehi.sualeh.chapter01.Question01_1.isUniqueChars2;
import static us.fatehi.sualeh.chapter01.Question01_1.isUniqueCharsUnicode;
import static us.fatehi.sualeh.testutil.TestUtil.assertEquals;

import org.junit.jupiter.api.Test;

public class TestQuestion01_1 {

  @Test
  public void test1Question1_1() {
    final String[] words = {null, "", "abcde", "hello", "漢字", "漢漢"};
    final boolean[] hasUniqueChars = {true, true, true, false, true, false};

    for (int i = 0; i < words.length; i++) {
      final String word = words[i];
      final boolean expected = hasUniqueChars[i];
      assertEquals(
          String.format("\"%s\" %s unique characters", word, expected ? "has" : "does not have"),
          expected,
          isUniqueChars(word));
    }
  }

  @Test
  public void test2aQuestion1_1() {
    final String[] words = {null, "", "abcde", "hello"};
    final boolean[] hasUniqueChars = {true, true, true, false};

    for (int i = 0; i < words.length; i++) {
      final String word = words[i];
      final boolean expected = hasUniqueChars[i];
      try {
        assertEquals(
            String.format("\"%s\" %s unique characters", word, expected ? "has" : "does not have"),
            expected,
            isUniqueChars2(word));
      } catch (final Exception e) {
        throw new RuntimeException(word);
      }
    }
  }

  @Test
  public void test2Question1_1() {
    final String[] words = {
      null, "", "abcde", "hello", "apple", "kite", "padle",
    };
    final boolean[] hasUniqueChars = {
      true, true, true, false, false, true, true,
    };

    for (int i = 0; i < words.length; i++) {
      final String word = words[i];
      final boolean expected = hasUniqueChars[i];
      assertEquals(
          String.format("\"%s\" %s unique characters", word, expected ? "has" : "does not have"),
          expected,
          isUniqueChars2(word));
    }
  }

  @Test
  public void test3Question1_1() {
    final String[] words = {null, "", "abcde", "hello", "漢字", "漢漢"};
    final boolean[] hasUniqueChars = {true, true, true, false, true, false};

    for (int i = 0; i < words.length; i++) {
      final String word = words[i];
      final boolean expected = hasUniqueChars[i];
      assertEquals(
          String.format("\"%s\" %s unique characters", word, expected ? "has" : "does not have"),
          expected,
          isUniqueCharsUnicode(word));
    }
  }
}

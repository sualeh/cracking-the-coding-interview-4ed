package us.fatehi.sualeh.chapter01;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static us.fatehi.sualeh.chapter01.Question01_3.removeDuplicates;
import static us.fatehi.sualeh.chapter01.Question01_3.removeDuplicatesEff;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import us.fatehi.sualeh.util.CStyleString;

public class TestQuestion01_3 {

  CStyleString[] words;
  String[] wordsWithoutDuplicates;

  @BeforeEach
  public void setup() {

    words =
        new CStyleString[] {
          null,
          new CStyleString(""),
          new CStyleString("abcd"),
          new CStyleString("aaaa"),
          new CStyleString("aaabbb"),
          new CStyleString("abababa")
        };
    wordsWithoutDuplicates = new String[] {null, "", "abcd", "a", "ab", "ab"};
  }

  @Test
  public void test1Question1_3() {
    for (int i = 0; i < words.length; i++) {
      final CStyleString word = words[i];
      final String wordWithoutDuplicates = wordsWithoutDuplicates[i];

      removeDuplicates(word);

      assertThat(word, is(wordWithoutDuplicates));
    }
  }

  @Test
  public void test2Question1_3() {
    for (int i = 0; i < words.length; i++) {
      final CStyleString word = words[i];
      final String wordWithoutDuplicates = wordsWithoutDuplicates[i];

      removeDuplicatesEff(word);

      assertThat(word, is(wordWithoutDuplicates));
    }
  }
}

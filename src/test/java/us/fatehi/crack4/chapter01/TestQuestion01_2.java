package us.fatehi.crack4.chapter01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static us.fatehi.crack4.chapter01.Question01_2.reverse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import us.fatehi.crack4.util.CStyleString;

public class TestQuestion01_2 {

  CStyleString[] words;
  CStyleString[] wordsReversed;

  @BeforeEach
  public void setup() {

    words =
        new CStyleString[] {
          null,
          new CStyleString(""),
          new CStyleString("abcd"),
          new CStyleString("aaaa"),
          new CStyleString("aaabbb"),
        };
    wordsReversed =
        new CStyleString[] {
          null,
          new CStyleString(""),
          new CStyleString("dcba"),
          new CStyleString("aaaa"),
          new CStyleString("bbbaaa"),
        };
  }

  @Test
  public void test1Question1_2() {
    for (int i = 0; i < words.length; i++) {
      final CStyleString word = words[i];
      final CStyleString wordReversed = wordsReversed[i];

      reverse(word);

      assertEquals(wordReversed, word);
    }
  }
}

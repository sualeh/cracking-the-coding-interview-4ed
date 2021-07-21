package us.fatehi.crack4.chapter01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static us.fatehi.crack4.chapter01.Question01_3.removeDuplicates;
import static us.fatehi.crack4.chapter01.Question01_3.removeDuplicatesEff;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import us.fatehi.crack4.util.CStyleString;

public class TestQuestion01_3 {

  CStyleString[] words;
  CStyleString[] wordsWithoutDuplicates;

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
    wordsWithoutDuplicates =
        new CStyleString[] {
          null,
          new CStyleString(""),
          new CStyleString("abcd"),
          new CStyleString("a"),
          new CStyleString("ab"),
          new CStyleString("ab")
        };
  }

  @Test
  public void test1Question1_3() {
    for (int i = 0; i < words.length; i++) {
      final CStyleString word = words[i];
      final CStyleString wordWithoutDuplicates = wordsWithoutDuplicates[i];

      removeDuplicates(word);

      assertEquals(wordWithoutDuplicates, word);
    }
  }

  @Test
  public void test2Question1_3() {
    for (int i = 0; i < words.length; i++) {
      final CStyleString word = words[i];
      final CStyleString wordWithoutDuplicates = wordsWithoutDuplicates[i];

      removeDuplicatesEff(word);

      assertEquals(wordWithoutDuplicates, word);
    }
  }
}

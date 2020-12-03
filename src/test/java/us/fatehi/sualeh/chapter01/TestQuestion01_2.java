package us.fatehi.sualeh.chapter01;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static us.fatehi.sualeh.chapter01.Question01_2.reverse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import us.fatehi.sualeh.util.CStyleString;

public class TestQuestion01_2 {

  CStyleString[] words;
  String[] wordsReversed;

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
        new String[] {
          null, "", "dcba", "aaaa", "bbbaaa",
        };
  }

  @Test
  public void test1Question1_2() {
    for (int i = 0; i < words.length; i++) {
      final CStyleString word = words[i];
      final String wordReversed = wordsReversed[i];

      reverse(word);

      assertThat(word, is(wordReversed));
    }
  }
}

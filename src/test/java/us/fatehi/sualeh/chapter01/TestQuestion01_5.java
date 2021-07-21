package us.fatehi.sualeh.chapter01;

import static us.fatehi.sualeh.chapter01.Question01_5.replaceSpaces;
import static us.fatehi.sualeh.testutil.TestUtil.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import us.fatehi.sualeh.util.CStyleString;

public class TestQuestion01_5 {

  CStyleString[] words;
  CStyleString[] words2;

  @BeforeEach
  public void setup() {

    words =
        new CStyleString[] {
          null,
          new CStyleString(""),
          new CStyleString(" "),
          new CStyleString("a bat"),
          new CStyleString("some  shoes"),
          new CStyleString("finished "),
        };
    words2 =
        new CStyleString[] {
          null,
          new CStyleString(""),
          new CStyleString("%20"),
          new CStyleString("a%20bat"),
          new CStyleString("some%20%20shoes"),
          new CStyleString("finished%20"),
        };
  }

  @Test
  public void test1Question1_5() {
    for (int i = 0; i < words.length; i++) {
      final CStyleString word = words[i];
      final CStyleString word2 = words2[i];

      replaceSpaces(word);

      assertEquals(word2, word);
    }
  }
}

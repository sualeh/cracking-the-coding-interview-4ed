package us.fatehi.sualeh.chapter01;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static us.fatehi.sualeh.chapter01.Question01_5.replaceSpaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import us.fatehi.sualeh.util.CStyleString;

public class TestQuestion01_5 {

  CStyleString[] words;
  String[] expectedWords;

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
    expectedWords =
        new String[] {
          null, "", "%20", "a%20bat", "some%20%20shoes", "finished%20",
        };
  }

  @Test
  public void test1Question1_5() {
    for (int i = 0; i < words.length; i++) {
      final CStyleString word = words[i];
      final String expectedWord = expectedWords[i];

      replaceSpaces(word);

      assertThat(word, is(expectedWord));
    }
  }
}

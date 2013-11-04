package us.fatehi.sualeh.chapter01;


import static org.junit.Assert.assertEquals;
import static us.fatehi.sualeh.chapter01.Question1_2.*;

import org.junit.Before;
import org.junit.Test;

import us.fatehi.sualeh.util.CStyleString;

public class TestQuestion1_2
{

  CStyleString[] words;
  CStyleString[] wordsReversed;

  @Before
  public void setup()
  {

    words = new CStyleString[] {
        null,
        new CStyleString(""),
        new CStyleString("abcd"),
        new CStyleString("aaaa"),
        new CStyleString("aaabbb"),
    };
    wordsReversed = new CStyleString[] {
        null,
        new CStyleString(""),
        new CStyleString("dcba"),
        new CStyleString("aaaa"),
        new CStyleString("bbbaaa"),
    };
  }

  @Test
  public void test1Question1_2()
  {
    for (int i = 0; i < words.length; i++)
    {
      final CStyleString word = words[i];
      final CStyleString wordReversed = wordsReversed[i];

      reverse(word);

      assertEquals(wordReversed, word);
    }

  }

}

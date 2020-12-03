package us.fatehi.sualeh.chapter01;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static us.fatehi.sualeh.chapter01.Question01_4.isAnagram;

import org.junit.jupiter.api.Test;

public class TestQuestion01_4 {

  @Test
  public void test1Question1_4() {

    assertThat(isAnagram(null, null), is(true));
    assertThat(isAnagram("", ""), is(true));
    assertThat(isAnagram("mother", "rethom"), is(true));
    assertThat(isAnagram("mother", "rethon"), is(false));
  }
}

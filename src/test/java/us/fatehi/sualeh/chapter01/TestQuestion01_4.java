package us.fatehi.sualeh.chapter01;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static us.fatehi.sualeh.chapter01.Question01_4.isAnagram;

import org.junit.jupiter.api.Test;

public class TestQuestion01_4 {

  @Test
  public void test1Question1_4() {

    assertTrue(isAnagram(null, null));
    assertTrue(isAnagram("", ""));
    assertTrue(isAnagram("mother", "rethom"));
    assertTrue(!isAnagram("mother", "rethon"));
  }
}

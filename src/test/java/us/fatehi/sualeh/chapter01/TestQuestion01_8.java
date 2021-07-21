package us.fatehi.sualeh.chapter01;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static us.fatehi.sualeh.chapter01.Question01_8.isRotation;

import org.junit.jupiter.api.Test;

public class TestQuestion01_8 {

  @Test
  public void test1Question1_8() {
    assertTrue(!isRotation("apple", null));
    assertTrue(!isRotation(null, "apple"));
    assertTrue(isRotation("pleap", "apple"));
    assertTrue(!isRotation("ppale", "apple"));
  }
}

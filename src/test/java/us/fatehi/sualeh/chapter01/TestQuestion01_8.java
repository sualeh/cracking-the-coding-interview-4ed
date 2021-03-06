package us.fatehi.sualeh.chapter01;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static us.fatehi.sualeh.chapter01.Question01_8.isRotation;

import org.junit.jupiter.api.Test;

public class TestQuestion01_8 {

  @Test
  public void test1Question1_8() {
    assertThat(isRotation("apple", null), is(false));
    assertThat(isRotation(null, "apple"), is(false));
    assertThat(isRotation("pleap", "apple"), is(true));
    assertThat(isRotation("ppale", "apple"), is(false));
  }
}

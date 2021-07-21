/**
 * This work is licensed under the Creative Commons Attribution-NonCommercial 3.0 Unported License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc/3.0/deed.en_US.
 *
 * <p>Copyright (c) 2013-2014 Sualeh Fatehi, sualeh@hotmail.com
 */
package us.fatehi.sualeh.util;

public class Point extends java.awt.Point {

  /** */
  private static final long serialVersionUID = -2744176880893825781L;

  public Point(final int x, final int y) {
    super(x, y);
  }

  @Override
  public String toString() {
    return String.format("(%s, %s)", x, y);
  }
}

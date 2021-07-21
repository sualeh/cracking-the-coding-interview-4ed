package us.fatehi.crack4.chapter08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import us.fatehi.crack4.util.Point;

/**
 * 8.2 Imagine a robot sitting on the upper left hand corner of an NxN grid. The robot can only move
 * in two directions: right and down. How many possible paths are there for the robot? FOLLOW UP
 * Imagine certain squares are “off limits”, such that the robot can not step on them. Design an
 * algorithm to get all possible paths for the robot.
 */
public class Question08_2 {
  /*
   * For clarity, we will solve this part assuming an X by Y grid. Each
   * path has (X-1)+(Y-1) steps. Imagine the following paths: X X Y Y X
   * (move right -> right -> down -> down -> right) X Y X Y X (move
   * right -> down -> right -> down -> right) ... Each path can be fully
   * represented by the moves at which we move right. That is, if I were
   * to ask you which path you took, you could simply say “I moved right
   * on step 3 and 4.” Since you must always move right X-1 times, and
   * you have X-1 + Y-1 total steps, you have to pick X-1 times to move
   * right out of X-1+Y-1 choices. Thus, there are C(X-1, X-1+Y-1) paths
   * (e.g., X-1+Y-1 choose X-1): (X-1 + Y-1)! / ((X-1)! * (Y-1)!) We can
   * implement a simple recursive algorithm with backtracking:
   */

  public static Collection<List<Point>> getPaths(final int boardWidth, final int boardHeight) {
    final Collection<List<Point>> allPaths = new HashSet<>();
    getPaths(allPaths, new ArrayList<Point>(), boardWidth - 1, boardHeight - 1);

    for (final List<Point> path : allPaths) {
      Collections.reverse(path);
    }

    return allPaths;
  }

  private static void getPaths(
      final Collection<List<Point>> allPaths,
      final List<Point> currentPath,
      final int x,
      final int y) {
    if (x < 0 || y < 0 || !isFree(x, y)) {
      return;
    }

    final Point p = new Point(x, y);
    currentPath.add(p);

    if (x == 0 && y == 0) { // Reached the top left corner - stop and save the path
      allPaths.add(currentPath);
      return;
    }

    // Try a path going left (we are traveling backwards)
    getPaths(allPaths, new ArrayList<>(currentPath), x - 1, y);
    // Try a path going up (we are traveling backwards)
    getPaths(allPaths, new ArrayList<>(currentPath), x, y - 1);
  }

  private static boolean isFree(final int x, final int y) {
    // Implement any blocked squares here, by returning false
    return true;
  }
}

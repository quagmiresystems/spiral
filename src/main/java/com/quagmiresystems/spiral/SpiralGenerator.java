package com.quagmiresystems.spiral;

import java.util.Arrays;

public class SpiralGenerator {

  public int[][] generate(int size) {
    if (size < 1) {
      throw new IllegalArgumentException("size must be positive");
    } else if (size == 1) {
      return new int[][] {{1}};
    } else {
      int[][] result = new int[size][size];
      Direction currDir = Direction.RIGHT;
      int currSize = currDir.slots(size);
      int x = 0;
      int y = 0;
      int max = size * size;
      for (int j = 1; j <= max; j++) {
        System.out.println("putting " + j + " in " + y + ", " + x);
        result[y][x] = j;
        currSize--;
        if(currSize==0) {
          currDir = currDir.getNext();
          if(currDir==Direction.RIGHT) {
            size-=2;
          }
          currSize = currDir.slots(size);
        }
        switch(currDir) {
          case RIGHT: x++; break;
          case DOWN: y++; break;
          case LEFT: x--; break;
          case UP: y--; break;
        }
        print(result);
      }
      
      return result;
    }
  }
  
  private void print(int[][] result) {
    for(int[] i : result) {
      System.out.println(Arrays.toString(i));
    }
  }

}


enum Direction {
  RIGHT(0), DOWN(1), LEFT(1), UP(2);
  private Direction next;
  private int diff;
  static {
    RIGHT.next = DOWN;
    DOWN.next = LEFT;
    LEFT.next = UP;
    UP.next = RIGHT;
  }

  private Direction(int diff) {
    this.diff = diff;
  }

  public Direction getNext() {
    return next;
  }

  public int slots(int size) {
    return size-diff;
  }
}

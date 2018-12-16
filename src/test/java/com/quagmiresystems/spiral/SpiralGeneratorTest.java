package com.quagmiresystems.spiral;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class SpiralGeneratorTest {
  
  @Test
  public void test2() throws Exception {
    int[][] expected = {
        { 1, 2 },
        { 4, 3 }
    };
    assertArrayEquals(expected, new SpiralGenerator().generate(2));
  }
  
  @Test
  public void test3() throws Exception {
    int[][] expected = { 
        { 1, 2, 3 }, 
        { 8, 9, 4 }, 
        { 7, 6, 5 } 
    };
    assertArrayEquals(expected, new SpiralGenerator().generate(3));
  }
  
  @Test
  public void test4() throws Exception {
    int[][] expected = { 
        { 1, 2, 3, 4 }, 
        { 12, 13, 14, 5 }, 
        { 11, 16, 15, 6}, 
        { 10, 9, 8, 7} 
    };
    assertArrayEquals(expected, new SpiralGenerator().generate(4));
  }
  
  @Test
  public void test5() throws Exception {
    int[][] expected = { 
        { 1, 2, 3, 4, 5 }, 
        { 16, 17, 18, 19, 6}, 
        { 15, 24, 25, 20, 7}, 
        { 14, 23, 22, 21, 8}, 
        { 13, 12, 11, 10, 9} 
    };
    assertArrayEquals(expected, new SpiralGenerator().generate(5));
  }

}

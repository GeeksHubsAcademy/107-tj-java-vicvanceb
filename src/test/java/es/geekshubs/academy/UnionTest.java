package es.geekshubs.academy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class UnionTest {

  private Union union;

  @Before
  public void setUp() throws Exception {
    this.union = new Union();
  }

  @After
  public void tearDown() throws Exception {
    this.union = null;
  }
  
  @Test public void test1 () {
    final String expected = "null";
    final String result = union.apply(null);
    assertEquals(expected, result);
  }

  @Test public void test2 () {
    final String expected = "vacio";
    final String result = union.apply(Arrays.asList());
    assertEquals(expected, result);
  }

  @Test public void test3 () {
    final String expected = "a";
    final String result = union.apply(Arrays.asList("a"));
    assertEquals(expected, result);
  }

  @Test public void test4 () {
    final String expected = "az";
    final String result = union.apply(Arrays.asList("a", "z"));
    assertEquals(expected, result);
  }

  @Test public void test5 () {
    final String expected = "xy";
    final String result = union.apply(Arrays.asList("x", "z", "y"));
    assertEquals(expected, result);
  }

  @Test public void test6 () {
    final String expected = "hi!";
    final String result = union.apply(Arrays.asList("h", "z", "i", "!"));
    assertEquals(expected, result);
  }

  @Test public void test7 () {
    final String expected = "[%]";
    final String result = union.apply(Arrays.asList("[", "o", "%", "a", "]"));
    assertEquals(expected, result);
  }

  @Test public void test8 () {
    final String expected = "hl!";
    final String result = union.apply(Arrays.asList("h", "o", "l", "a", "!"));
    assertEquals(expected, result);
  }

  @Test public void test9 () {
    final String expected = "hola!";
    final String result = union.apply(Arrays.asList("h", "o", "o", "l", "l", "a", "a", "!"));
    assertEquals(expected, result);
  }

  @Test public void test10 () {
    final String expected = "casa!";
    final String result = union.apply(Arrays.asList("c", "o", "a", "l", "s", "a", "a", "!"));
    assertEquals(expected, result);
  }

  @Test public void test11 () {
    final String expected = "geeks!";
    final String result = union.apply(Arrays.asList("g", "e", "e", "e", "e", "k", "k", "s", "s", "!"));
    assertEquals(expected, result);
  }

  @Test public void test12 () {
    final String expected = "foo";
    final String result = union.apply(Arrays.asList("f", "o", "o", "o"));
    assertEquals(expected, result);
  }

  @Test public void test13 () {
    final String expected = "buu";
    final String result = union.apply(Arrays.asList("b", "u", "u", "u"));
    assertEquals(expected, result);
  }

  @Test public void test14 () {
    final String expected = "bu";
    final String result = union.apply(Arrays.asList("b", "u", "u"));
    assertEquals(expected, result);
  }

}
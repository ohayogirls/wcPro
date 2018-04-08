package test;

import static org.junit.Assert.*;
import ldx.Core;

import org.junit.Test;

public class CoreTest {
	Core test;
	@Test
	public void test_1() {
		test = new Core("");
		assertEquals("",test.getresults(test.CountWord()));
	}
	@Test
	public void test_2() {
		test = new Core("a");
		assertEquals("a:1;",test.getresults(test.CountWord()));
	}
	@Test
	public void test_3() {
		test = new Core("A");
		assertEquals("a:1;",test.getresults(test.CountWord()));
	}
	@Test
	public void test_4() {
		test = new Core("a A");
		assertEquals("a:2;",test.getresults(test.CountWord()));
	}
	@Test
	public void test_5() {
		test = new Core("-a-b-");
		System.out.println(test.getresults(test.CountWord()));
		assertEquals("a-b:1;",test.getresults(test.CountWord()));
	}
	@Test
	public void test_6() {
		test = new Core("a~b");
		assertEquals("a:1;b:1;",test.getresults(test.CountWord()));
	}
	@Test
	public void test_7() {
		test = new Core("a!b");
		assertEquals("a:1;b:1;",test.getresults(test.CountWord()));
	}
	@Test
	public void test_8() {
		test = new Core("a_b");
		assertEquals("a:1;b:1;",test.getresults(test.CountWord()));
	}
	@Test
	public void test_9() {
		test = new Core("c0w");
		assertEquals("c:1;w:1;",test.getresults(test.CountWord()));
	}
	@Test
	public void test_10() {
		test = new Core("a a a");
		assertEquals("a:3;",test.getresults(test.CountWord()));
	}
	@Test
	public void test_11() {
		test = new Core("a b a b a b");
		assertEquals("a:3;b:3;",test.getresults(test.CountWord()));
	}
	@Test
	public void test_12() {
		test = new Core("a b c");
		assertEquals("a:1;b:1;c:1;",test.getresults(test.CountWord()));
	}
	@Test
	public void test_13() {
		test = new Core("a b b c c c");
		assertEquals("c:3;b:2;a:1;",test.getresults(test.CountWord()));
	}
	@Test
	public void test_14() {
		test = new Core("ab ac");
		assertEquals("ab:1;ac:1;",test.getresults(test.CountWord()));
	}
	@Test
	public void test_15() {
		test = new Core("aba acc");
		assertEquals("aba:1;acc:1;",test.getresults(test.CountWord()));
	}
	@Test
	public void test_16() {
		test = new Core("b b a");
		assertEquals("b:2;a:1;",test.getresults(test.CountWord()));
	}
	@Test
	public void test_17() {
		test = new Core("b a");
		assertEquals("a:1;b:1;",test.getresults(test.CountWord()));
	}
	@Test
	public void test_18() {
		test = new Core("ac ab");
		assertEquals("ab:1;ac:1;",test.getresults(test.CountWord()));
	}
	@Test
	public void test_19() {
		test = new Core("-w-o-w-");
		assertEquals("w-o-w:1;",test.getresults(test.CountWord()));
	}
	@Test
	public void test_20() {
		test = new Core("wOw");
		assertEquals("wow:1;",test.getresults(test.CountWord()));
	}

}

package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgMain.MyInteger;

public class MyIntegerTest {
	MyInteger m;
	@Test
	public void test1() {
		assertTrue(MyInteger.isPrime(m = new MyInteger(13) ));
	}
	@Test
	public void test2() {
		assertTrue(MyInteger.isEven(m = new MyInteger(14) ));
	}
	@Test
	public void test3() {
		assertTrue(MyInteger.isOdd(m = new MyInteger(13) ));
	}
	@Test
	public void test4() {
		assertFalse(MyInteger.isPrime(16));
	}
	@Test
	public void test5() {
		assertFalse(MyInteger.isEven(m = new MyInteger(13) ));
	}
	@Test
	public void test6() {
		assertFalse(MyInteger.isOdd(m = new MyInteger(14) ));
	}
	@Test
	public void test8(){
		m = new MyInteger(15);
		assertTrue(m.equals(m));
	}
	@Test
	public void test9(){
		m = new MyInteger(15);
		MyInteger n = new MyInteger(10);
		assertFalse(m.equals(n));
	}
	@Test
	public void test10() {
		m = new MyInteger(5);
		assertEquals(5,m.getiValue());
	}
}



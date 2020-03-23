package Taskepam.Task;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Testcase {

	removeA d;

	@BeforeEach
	void createObject() {
		d = new removeA();
	}

	@Test
	void test1() {
		assertEquals("BCDE", d.delt("ABCDE"));
	}

	@Test
	void test2() {
		assertEquals("DC", d.delt("AADC"));
	}

	@Test
	void test3() {
		assertEquals("BBAA", d.delt("BBAA"));
	}

	@Test
	void test4() {
		assertEquals("", d.delt("A"));
	}

	@Test
	void test5() {
		assertEquals("", d.delt("AA"));
	}

	@Test
	void test6() {
		assertEquals("BBD", d.delt("BABD"));
	}

}

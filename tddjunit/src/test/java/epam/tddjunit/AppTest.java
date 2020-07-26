package epam.tddjunit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class AppTest {

	void testing1()
	{assertEquals("BCD",deletee.del("ABCD"));}

	void testing2()
	{assertEquals("CD",deletee.del("AACD"));}

	void testing3()
		{assertEquals("BBCD",deletee.del("BBCD"));}

	void testing4()
		{assertEquals("BBAA",deletee.del("AABBAA"));}
}
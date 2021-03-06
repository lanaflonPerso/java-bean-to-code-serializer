package de.incentergy.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static de.incentergy.test.Serialize.object2code;

public class SerializeTest {

	@Test
	public void testObject2code() {
		TestBean testBean = new TestBean();

		String s = object2code(testBean);
		assertEquals(
				"de.incentergy.test.TestBean testBean0 = new de.incentergy.test.TestBean();\n"
						+ "testBean0.setMyBoolean(false);\n"
						+ "testBean0.setMyByte((byte) 0);\n"
						+ "testBean0.setMyChar('');\n"
						+ "testBean0.setMyDouble(0.0);\n"
						+ "testBean0.setMyFloat(0.0f);\n"
						+ "testBean0.setMyInt(0);\n"
						+ "testBean0.setMyLong(0l);\n"
						+ "testBean0.setMyShort((short)0);\n" + "", s);
	}

}

package test;

import static org.junit.jupiter.api.Assertions.*;

import leerFicheros.LeerFicheroXml;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		
		LeerFicheroXml xml = new LeerFicheroXml();
		
		
		assertEquals(true, xml.leerXml());
	}

}
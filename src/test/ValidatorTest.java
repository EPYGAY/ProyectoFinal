package test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import utiles.Validator;

public class ValidatorTest {

	
	@Test
	public void testIsNumber() {
		assertFalse(Validator.isNumber("cosa"));
		assertTrue(Validator.isNumber("2323232"));
		assertTrue(Validator.isNumber("2.323232"));
		assertTrue(Validator.isNumber(".2323232"));
		assertFalse(Validator.isNumber("j2323232"));
		assertTrue(Validator.isNumber("2323232."));
		assertFalse(Validator.isNumber("23d23232"));
		assertFalse(Validator.isNumber("2323232f"));
		assertFalse(Validator.isNumber("2323232d"));
	}

	@Test
	public void testIsPhone(){
		assertTrue(Validator.isPhone("912123987"));
		assertTrue(Validator.isPhone("612123987"));
		assertTrue(Validator.isPhone("712123987"));
		assertFalse(Validator.isPhone("56"));
		assertFalse(Validator.isPhone("56ddd"));
		assertFalse(Validator.isPhone("569876654"));
	}
	@Test
	public void testIsInteger(){
		assertTrue(Validator.isInteger("912123987"));
		assertTrue(Validator.isInteger("2323232"));
		assertTrue(Validator.isInteger("45"));
		assertFalse(Validator.isInteger(".612123987"));
		assertFalse(Validator.isInteger("2.323232"));
		assertFalse(Validator.isInteger("2323232d"));
		assertFalse(Validator.isInteger("2323232f"));
		assertFalse(Validator.isInteger("23d23232"));
	}
	@Test
	public void testIsNombre() {
		assertTrue(Validator.isNombre("Sergio"));
		assertFalse(Validator.isNombre("Sergio5845"));
		assertTrue(Validator.isNombre("Sergio Galan    "));
		
	}
	
	@Test
	public void testIsID() {
		assertTrue(Validator.isID("5555"));
		assertFalse(Validator.isID("  67545"));
		assertFalse(Validator.isID("5edfs555"));
		
	}
	
	@Test
	public void testComprobarEspacios() {
		assertTrue(Validator.comprobarEspacios("Sergio"));
		assertFalse(Validator.comprobarEspacios(" Sergio"));
		assertFalse(Validator.comprobarEspacios("Sergio "));
		assertFalse(Validator.comprobarEspacios(" "));  
		assertTrue(Validator.comprobarEspacios("")); 
		assertFalse(Validator.comprobarEspacios("Sergio Galan"));
	}
	
	@Test
	public void testisWord() {
		assertTrue(Validator.isWord("abc"));
		assertFalse(Validator.isWord("14"));
		assertFalse(Validator.isWord("nsjs78"));
		assertFalse(Validator.isWord("hol/"));
	}
	

	@Test
	public void testisDireccion() {
		assertTrue(Validator.isDireccion("Plaza Libertad 23"));
		assertFalse(Validator.isDireccion("Plaza "));
		assertFalse(Validator.isDireccion("Plaza"));
		assertFalse(Validator.isDireccion("Plaza w"));
		assertFalse(Validator.isDireccion("14"));
	}
	
	
	@Test
	public void testisNIF() {
		assertFalse(Validator.isNIF("F09212358"));
		assertFalse(Validator.isNIF(" 09212358F"));
		assertTrue(Validator.isNIF("09212358F"));
		assertFalse(Validator.isNIF("A92358"));
		assertFalse(Validator.isNIF("A92 358"));
	}
	
	@Test
	public void testisFechaNacimeinto() {
		assertTrue(Validator.isFechaNacimiento("05/10/1999"));
		assertTrue(Validator.isFechaNacimiento("31/12/1999"));
		assertFalse(Validator.isFechaNacimiento("31/13/1999"));
		assertFalse(Validator.isFechaNacimiento("32/10/1999"));
		
	}
	
	
	
}

package test;

// import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.lang.reflect.Modifier;

import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import model.Bot;
import model.Worker;

public class TestWorker {

	@Test
	public void testInterface() {
		try{
			assertEquals(true,Modifier.isInterface((Worker.class).getModifiers()));
		}catch (Exception e) {
			// TODO: handle exception
			fail("Worker doesnt exist");
		}
	}
	
	@Test
	public void testInterfaceMethod() {
		try{
			assertEquals(true,Modifier.isAbstract((Worker.class).getMethod("work", null).getModifiers()));}
			catch(Exception e){
				fail("work doesnt exist");
			}
	}
}

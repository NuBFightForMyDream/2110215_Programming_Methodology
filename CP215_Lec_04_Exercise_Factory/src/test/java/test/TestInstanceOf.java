package test;

// import static org.junit.Assert.*;

import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import main.Main;
import model.Bot;
import model.MaterialProcessor;
import model.Packager;
import model.ProductAssembler;
import model.QualityChecker;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestInstanceOf {
	@BeforeEach
	public void setUp() throws Exception {
		new Main();
	}

	@Test
	public void testProduce() {
		Main.workers.add(new MaterialProcessor());Main.workers.add(new Packager());
		Bot.material=4;
		Bot.finishedProduct=8;
		Main.produce();
		Main.produce();
		assertEquals(0, Bot.material);
		assertEquals(10,Bot.finishedProduct);
	}
	
	@Test
	public void testHuman() {
		QualityChecker q= new QualityChecker();
		q.increaseStress();
		q.increaseStress();
		assertEquals(3, q.getStressLevel());
	}
	
	

}

package grader;

import discount.Sellable;
import org.junit.jupiter.api.Test;
import products.BaseProduct;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseProductTest {
	@Test
	void sellableTest() {
		BaseProduct bp = new BaseProduct("Strawberry Milk", 24);
		Sellable s = (Sellable) bp;
		assertEquals(0, s.calculateDiscount(2));
	}
}

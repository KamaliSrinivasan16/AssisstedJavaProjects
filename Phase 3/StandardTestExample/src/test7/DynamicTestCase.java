package test7;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

class DynamicTestCase {
		@TestFactory
		Collection<DynamicTest> dynamicTestWithCollection(){
			return  Arrays.asList(					
					DynamicTest.dynamicTest("Add Test", ()->assertEquals(2,Math.addExact(988878345, 678899979))),
					
					DynamicTest.dynamicTest("Multiply Test", ()->assertEquals(4,Math.multiplyExact(2, 2)))
					);
					
		}
}
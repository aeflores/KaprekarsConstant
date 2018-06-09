import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KapreKarsTest {

	@Test
	void test() {
		assertEquals(KapreKars.KaprekarsConstant(6174), 0);
		assertEquals(KapreKars.KaprekarsConstant(3524), 3);
		assertEquals(KapreKars.KaprekarsConstant(2111), 5);
		assertEquals(KapreKars.KaprekarsConstant(9831), 7);
	}

}

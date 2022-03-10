package c2tc.java.application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
class MMBankFactoryTest {

	MMBankFactory bf;
	
	@BeforeEach
	void setup()
	{
		bf = new MMBankFactory();
	}
	
	
	@Test
	void test() {
		assertNotNull(bf.getNewSavingAccount(0, null, 0));
	}

}

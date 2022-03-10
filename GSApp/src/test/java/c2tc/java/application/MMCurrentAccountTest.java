package c2tc.java.application;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mockito;


@RunWith(JUnitPlatform.class)
public class MMCurrentAccountTest {

	MMCurrentAccount ca;
	
	@BeforeEach
	void setup()
	{
		ca = Mockito.mock(MMCurrentAccount.class);
	}
	
	@Test
	public void test() {
		ca.withdraw(500);
		verify(ca).withdraw(500);
	}

}

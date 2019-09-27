package core.datatypes;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

import org.junit.Test;

public class BigDecimalTest {
	
	@Test
	public void whenBigDecimalCreated_thenValueMatches() {
	    BigDecimal bdFromString = new BigDecimal("0.1");
	    BigDecimal bdFromCharArray = new BigDecimal(new char[] {'3','.','1','6','1','5'});
	    BigDecimal bdlFromInt = new BigDecimal(42);
	    BigDecimal bdFromLong = new BigDecimal(123412345678901L);
	    BigInteger bigInteger = BigInteger.probablePrime(100, new Random());
	    BigDecimal bdFromBigInteger = new BigDecimal(bigInteger);
	         
	    assertEquals("0.1",bdFromString.toString());
	    assertEquals("3.1615",bdFromCharArray.toString());
	    assertEquals("42",bdlFromInt.toString());
	    assertEquals("123412345678901",bdFromLong.toString());
	    assertEquals(bigInteger.toString(),bdFromBigInteger.toString());
	}

}

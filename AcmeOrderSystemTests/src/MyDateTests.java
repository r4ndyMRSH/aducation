import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.acme.utils.MyDate;

public class MyDateTests {
	
	@Test
	public void NumberOfHoliday() {
		assertEquals(6, MyDate.getHolidays().length, "Amount of holiday is not correct");
	}

}

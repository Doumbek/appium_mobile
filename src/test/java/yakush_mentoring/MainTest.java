package yakush_mentoring;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MainTest extends Base {

	@Test
	public void sumCalcTest() {

		oneButton.click();
		addButton.click();
		twoButton.click();
		eqButton.click();

		assertEquals("WTF?", "3", resultField.getText());

	}

}

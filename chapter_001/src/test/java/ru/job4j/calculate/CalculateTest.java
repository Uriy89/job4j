package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test
*
* @author Averianov Yuriy
* @since 08.07.2018
* @version 0.1
*/

public class CalculateTest {
/**
* Test echo
*/ @Test

public void whenTakeNameThenTreeEchoPluseName() {
	String input = "Averianov Yuriy";
	String expect = "Echo, echo, echo:Averianov Yuriy";
	Calculate calc = new Calculate();
	String result = calc.echo(input);
	assertThat(result, is(expect));

}

}

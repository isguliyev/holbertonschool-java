package com.example.calculator.model;

import java.time.LocalDate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTest {
	private Calculator calculator;

	@BeforeAll
	public void setUpAll() {
		this.calculator = new Calculator();
	}

	@Test
	public void sumTest() {
		assertEquals(3.0d, this.calculator.sum(1.0d, 2.0d));
		assertEquals(1.0d, this.calculator.sum(-1.0d, 2.0d));
		assertEquals(Double.MAX_VALUE, this.calculator.sum(Double.MAX_VALUE, 0.0d));
	}

	@Test
	public void numbersNullSumTest() {
		Exception exception = assertThrows(
			NullPointerException.class,
			() -> {
				this.calculator.sum(null, null);
			}
		);

		assertEquals("First and second number required", exception.getMessage());

		exception = assertThrows(
			NullPointerException.class,
			() -> {
				this.calculator.sum(null, 0.0d);
			}
		);

		assertEquals("First number required", exception.getMessage());

		exception = assertThrows(
			NullPointerException.class,
			() -> {
				this.calculator.sum(0.0d, null);
			}
		);

		assertEquals("Second number required", exception.getMessage());
	}

	@Test
	public void subTest() {
		assertEquals(-1.0d, this.calculator.sub(1.0d, 2.0d));
		assertEquals(-3.0d, this.calculator.sub(-1.0d, 2.0d));
		assertEquals(Double.MIN_VALUE, this.calculator.sub(Double.MIN_VALUE, 0.0d));
	}

	@Test
	public void divideTest() {
		assertEquals(5.0d, this.calculator.divide(10.0d, 2.0d));
	}

	@Test
	public void divisionByZeroTest() {
		Exception exception = assertThrows(
			ArithmeticException.class,
			() -> {
				this.calculator.divide(Double.MAX_VALUE, 0.0d);
			}
		);

		assertEquals("Division by zero is not allowed", exception.getMessage());
	}

	@Test
	public void factorialTest() {
		assertEquals(1, this.calculator.factorial(0));
		assertEquals(1, this.calculator.factorial(1));
		assertEquals(2, this.calculator.factorial(2));
		assertEquals(6, this.calculator.factorial(3));
		assertEquals(24, this.calculator.factorial(4));
		assertEquals(120, this.calculator.factorial(5));

		Exception exception = assertThrows(
			NullPointerException.class,
			() -> {
				this.calculator.factorial(null);
			}
		);

		assertEquals("Number is required", exception.getMessage());

		exception = assertThrows(
			IllegalArgumentException.class,
			() -> {
				this.calculator.factorial(-1);
			}
		);

		assertEquals("Number is negative", exception.getMessage());
	}

	@Test
	public void integerToBinaryTest() {
		assertEquals("00000000000000000000000000000001", this.calculator.integerToBinary(1));
		// java uses two's complement to store the integers
		// Two's complement: a bit complement of the integers + 1 changes the sign
		assertEquals("11111111111111111111111111111111", this.calculator.integerToBinary(-1));
		assertEquals("00000000000000000000000000001100", this.calculator.integerToBinary(12));

		Exception exception = assertThrows(
			NullPointerException.class,
			() -> {
				this.calculator.integerToBinary(null);
			}
		);

		assertEquals("Number is required", exception.getMessage());
	}

	@ParameterizedTest
	@CsvSource(
		value = {
			"0:0",
			"1:1",
			"A:10",
			"B:11",
			"C:12",
			"D:13",
			"E:14",
			"F:15",
			"FF:255",
			"-FF:-255"
		},
		delimiter = ':'
	)
	public void integerToHexadecimalTest(String expected, Integer input) {
		assertEquals(expected, this.calculator.integerToHexadecimal(input));
	}

	@Test
	public void numberNullIntegerToHexadecimalTest() {
		Exception exception = assertThrows(
			NullPointerException.class,
			() -> {
				this.calculator.integerToHexadecimal(null);
			}
		);

		assertEquals("Number is required", exception.getMessage());
	}

	@Test
	public void calculateDayBetweenDateTest() {
		assertEquals(
                371,
                this.calculator.calculateDayBetweenDate(
                    LocalDate.of(2009, 12, 4),
                    LocalDate.of(2010, 12, 10)
                )
		);

        assertEquals(
                10,
                this.calculator.calculateDayBetweenDate(
                    LocalDate.of(777, 12, 4),
                    LocalDate.of(777, 12, 14)
                )
		);

		Exception exception = assertThrows(
			NullPointerException.class,
			() -> {
				this.calculator.calculateDayBetweenDate(null, null);
			}
		);

		assertEquals("First and second date required", exception.getMessage());
	}
}
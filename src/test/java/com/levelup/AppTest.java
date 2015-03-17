package com.levelup;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void print_elements_stream_method_reference() {

		Stream.of("One", "Two", "Three", "Four").forEach(System.out::println);

	}

	@Test
	public void print_elements_stream_lambda() {

		IntStream.of(1, 2, 3, 4)
				.forEach(element -> System.out.println(element));

	}

	@Test
	public void print_elements_stream_fun() {

		IntStream.of(1, 2, 3, 4)
				.forEach(element -> System.out.println(element + 1));

	}

}

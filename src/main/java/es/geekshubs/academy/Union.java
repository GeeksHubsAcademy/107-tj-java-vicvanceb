package es.geekshubs.academy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Union {

  /**
   * Apply Method
   * @param input
   * @return
   */
  public String apply(final List<String> input) {
    if (input == null) {
      return "null";
    }

    if (input.isEmpty()) {
      return "vacio";
    }

    String[] stringArray = input.toArray(new String[0]);

    return IntStream.range(0, stringArray.length)
            .filter(i -> i % 2 == 0 || i == stringArray.length - 1)
            .mapToObj(i -> stringArray[i])
            .collect(Collectors.joining());
  }

}

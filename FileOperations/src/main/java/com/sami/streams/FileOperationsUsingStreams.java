package com.stackroute.streams;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileOperationsUsingStreams {

	public long getUniqueWordCount(String file) throws IOException {

		if (file == null || file.isBlank() || file != "sample.txt") {

			return 0;
		}

		try {

			long result = Files.lines(Paths.get(file)).flatMap(line -> Arrays.stream(line.split("\\s+"))).distinct()
					.count();

			// int uniqueWords = (int) result;

			return result;

		} catch (IOException e) {

			return 0;
		}

	}

	public Set<String> getWordListWithoutDuplicates(String file) throws IOException {

		Set<String> list = new TreeSet<String>();

		if (file == null || file.isBlank() || file != "sample.txt") {

			list = Collections.emptySet();

			return list;
		}

		Set<String> list1 = (Set<String>) Files.lines(Paths.get(file)).map(line -> line.split("[\\s]+"))
				// System.out.println(list1);
				.flatMap(Arrays::stream).distinct().collect(Collectors.toSet());

		// System.out.println(list1);

		//System.out.println(list1);
		return list = new TreeSet<String>(list1);
	

	}

	public List<String> getWordListInUppercaseExcludingFirstLine(String file) throws IOException {

		// List<String> list = null;

		if (file == null || file.isBlank() || file != "sample.txt") {

			return Collections.emptyList();
		}

		List<String> list = Files.lines(Paths.get(file)).map(String::toUpperCase).collect(Collectors.toList());

		/// System.out.println(list.size());
		List<String> ans = new ArrayList<>();
		for (String string : list) {
			String[] split = string.split(" ");
			for (String string2 : split) {
				ans.add(string2);
			}
		}
		//System.out.println(ans);
		// List<String> result = new ArrayList<String>();

		// while (list)

//			List<String> result;
//			result = new ArrayList<String>(list);

		return ans;

		// }

		/*
		 * catch (Exception e) { e.printStackTrace();
		 * 
		 * 
		 * }
		 */

	}

	public String getEachWordsSeparatedByColon(String file) throws IOException {

		List<String> list = new ArrayList<String>()
				;
		String empty = "";

		if (file == null || file.isEmpty() || file != "sample.txt") {

			return null;
		}

		list = Files.lines(Paths.get(file)).collect(Collectors.toList());

		List<String> ans = new ArrayList<>();
		for (String string : list) {
			String[] split = string.split(" ");
			for (String string2 : split) {
				ans.add(string2);
			}
		}
		
			return ans.toString().replaceAll("\\s",":").replaceAll(",", "").replace("[", "").replace("]", "");

	}
	
	
	

	public Optional<Integer> getMaxOfIntegers(String file) throws IOException {

		// int max;

		if (file == null || file.isEmpty() || file != "sample.txt") {

			return Optional.empty();
		}

		System.out.println(file);
		
		/*
		 * List<String> result = Files.lines(Paths.get(file)).flatMap(null)
		 * .collect(Collectors.toList());
		 */
		
		
		
		/*
		 * List<String> ans = new ArrayList<>(); for (String string : result) { String[]
		 * split = string.split(" "); for (String string2 : split) {
		 * if(string2.matches("[0-9]+")) { ans.add(string2); } } }
		 * 
		 * max = Collections.max(ans);
		 */
		
		
		//System.out.println(ans);
		
		Stream<String> result = Files.lines(Paths.get(file)).flatMap(Pattern.compile(" *")::splitAsStream)
                .filter(s -> s.matches("[0-9]+"));
		
		System.out.println(result);
		
		Optional<Integer> max = result.map(Integer::valueOf).max(Comparator.naturalOrder());
		
		

		return max;
		// check if it matched a number (Regular expressions) OR use try and catch to
		// parse into an integer
		// turn result into an integer
		//

	}

	// Find sum stream for java
	public Optional<Integer> getSumOfIntegers(String file) throws IOException {

		

		if (file == null || file.isEmpty() || file != "sample.txt") {

			return Optional.empty();
		}

		
		
		Stream<String> result = Files.lines(Paths.get(file)).flatMap(Pattern.compile(" *")::splitAsStream)
				.filter(s->s.matches("[0-9]+"));
		
		Optional<Integer> sum = Optional.of(result.mapToInt(Integer::valueOf).sum());
		
		
		return sum;	
		
	}

	public String getEachLineSeparatedByComma(String file) throws IOException {

		if (file == null || file.isEmpty() || file != "sample.txt") {

			return null;
		}

		String result = Files.lines(Paths.get(file)).map(x -> x.toString()).collect(Collectors.joining(","));

		System.out.println(result);

		return result;
	}

}

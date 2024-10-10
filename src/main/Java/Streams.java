package Java;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Streams {
	
	int tone;
	String color;

	public static void main(String[] args) throws IOException {
		
		List<Streams> sp = new ArrayList<Streams>();
		sp.add(new Streams(10,"RED"));
		sp.add(new Streams(11,"BLUE"));
		sp.add(new Streams(12,"RED"));
		sp.add(new Streams(13,"YELLOW"));
		sp.add(new Streams(14,"WHITE"));
		sp.add(new Streams(15,"RED"));
		sp.add(new Streams(16,"BLACK"));
		sp.add(new Streams(17,"RED"));
		
		
		Stream st = sp.stream();
		
		int sum = (int) st.filter(w -> ((Streams) w).getColor() == "RED").count();
                //.mapToInt(w -> ((StreamPractice) w).getWeight())
                //.sum();
		System.out.println(sum);
		System.out.print("");
		IntStream.rangeClosed(1, 10).skip(5).forEach(x -> System.out.println(x));
		System.out.print("");
		System.out.println(IntStream.rangeClosed(1, 10).skip(5).sum());
		System.out.print("");
		// summaryStatistics() only works for integer stream
		System.out.println(IntStream.rangeClosed(1, 10).skip(5).summaryStatistics());
		System.out.print("");
		String []names = {"Umar","Ali","Hassan","Hira"};
		Stream.of(names).sorted().filter(x -> x.startsWith("H")).forEach(System.out::println);
		System.out.print("");
		
		// 1. Integer Stream
				IntStream
					.range(1, 10)
					.forEach(System.out::print);
				System.out.println();
				
				// 2. Integer Stream with skip
				IntStream
					.range(1, 10)
					.skip(5)
					.forEach(x -> System.out.println(x));
				System.out.println();
				
				// 3. Integer Stream with sum
				System.out.println(
				IntStream
					.range(1, 5)
					.sum());
				System.out.println();
					
				// 4. Stream.of, sorted and findFirst
				Stream.of("Ava", "Aneri", "Alberto")
					.sorted()
					.findFirst()
					.ifPresent(System.out::println);
					
				// 5. Stream from Array, sort, filter and print
				String[] _names = {"Al", "Ali", "Kashif", "Brent", "Salman", "Amanda", "Hans", "Shumaila", "Sarah"};
				Arrays.stream(_names)	// same as Stream.of(names)
					.filter(x -> x.startsWith("S"))
					.sorted()
					.forEach(System.out::println);
							
				// 6. average of squares of an int array
				Arrays.stream(new int[] {2, 4, 6, 8, 10})
					.map(x -> x * x)
					.average()
					.ifPresent(System.out::println);
				
				// 7. Stream from List, filter and print
				List<String> people = Arrays.asList("Al", "Ali", "Brent", "Saim", "Amanda", "Hans", "Shamsher", "Sarah");
				people
					.stream()
					.map(String::toLowerCase)
					.filter(x -> x.startsWith("a"))
					.forEach(System.out::println);
					
				// 8. Stream rows from text file, sort, filter, and print
				Stream<String> bands = Files.lines(Paths.get("bands.txt"));
				bands
					.sorted()
					.filter(x -> x.length() > 13)
					.forEach(System.out::println);
				bands.close();
				
				// 9. Stream rows from text file and save to List
				List<String> bands2 = Files.lines(Paths.get("bands.txt"))
					.filter(x -> x.contains("jit"))
					.collect(Collectors.toList());
				bands2.forEach(x -> System.out.println(x));
				
				// 10. Stream rows from CSV file and count
				Stream<String> rows1 = Files.lines(Paths.get("data.txt"));
				int rowCount = (int)rows1
					.map(x -> x.split(","))
		            .filter(x -> x.length == 3)
					.count();
				System.out.println(rowCount + " rows.");
				rows1.close();
				
				// 11. Stream rows from CSV file, parse data from rows
				Stream<String> rows2 = Files.lines(Paths.get("data.txt"));
				rows2
					.map(x -> x.split(","))
		            .filter(x -> x.length == 3)
					.filter(x -> Integer.parseInt(x[1]) > 15)
					.forEach(x -> System.out.println(x[0] + "  " + x[1] + "  " + x[2]));
				rows2.close();
				
				// 12. Stream rows from CSV file, store fields in HashMap
				Stream<String> rows3 = Files.lines(Paths.get("data.txt"));
				Map<String, Integer> map = new HashMap<>();
				map = rows3
					.map(x -> x.split(","))
		            .filter(x -> x.length == 3)
					.filter(x -> Integer.parseInt(x[1]) > 15)
					.collect(Collectors.toMap(
		                x -> x[0],
		                x -> Integer.parseInt(x[1])));
				rows3.close();
				for (String key : map.keySet()) {
					System.out.println(key + "  " + map.get(key));
				}
					
				// 13. Reduction - sum
				double total = Stream.of(7.3, 1.5, 4.8)
					.reduce(0.0, (Double a, Double b) -> a + b);
				System.out.println("Total = " + total);
				
				// 14. Reduction - summary statistics
				IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
					.summaryStatistics();
				System.out.println(summary);
	}
	
	Streams(int weight ,String color){
		this.tone=weight;
		this.color=color;
	}

	public int getTone() {
		return tone;
	}

	public void setTone(int weight) {
		this.tone = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}

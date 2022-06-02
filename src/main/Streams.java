package main;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
	
	int tone;
	String color;

	public static void main(String[] args) {
		
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

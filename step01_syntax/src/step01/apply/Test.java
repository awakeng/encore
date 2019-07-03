package step01.apply;

public class Test {
	
	static MovieAudience[] PrintMovieUbd() {
		MovieAudience[] bee = {new MovieAudience("엄복동", 1, 7.66), new MovieAudience("기생충", 56.7, 9.08), new MovieAudience("명량", 100, 8.87)};
		return bee;
	}
	
	public static void main(String[] args) {
		MovieAudience[] rain = PrintMovieUbd();
		for(MovieAudience data : rain) {
			System.out.println(data);
		}
	}
}

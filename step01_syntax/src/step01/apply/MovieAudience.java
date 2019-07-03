/* 
 * 상영된 상업 영화와 해당 영화 관객수(UBD) 관련 DTO
 */
package step01.apply;

public class MovieAudience {
	private String movie;
	private double ubd;
	private double rating;
	
	public MovieAudience() {
	}
	public MovieAudience(String movie, double d, double r) {
		this.movie = movie;
		this.ubd = d;
		this.rating = r;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public double getUbd() {
		return ubd;
	}
	public void setUbd(double ubd) {
		this.ubd = ubd;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String toString() {
		return "MovieAudience [Movie=" + movie + ", UBD=" + ubd + ", Naver Rating= " + rating + "]";
	}
	
	
}

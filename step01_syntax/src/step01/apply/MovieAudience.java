/* 
 * �󿵵� ��� ��ȭ�� �ش� ��ȭ ������ ���� DTO
 */
package step01.apply;

public class MovieAudience {
	private String movie;
	private int ubd;
	
	public MovieAudience() {
	}
	public MovieAudience(String movie, int ubd) {
		this.movie = movie;
		this.ubd = ubd;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public int getUbd() {
		return ubd;
	}
	public void setUbd(int ubd) {
		this.ubd = ubd;
	}
	public String toString() {
		return "MovieAudience [movie=" + movie + ", ubd=" + ubd + "]";
	}
	
	
}

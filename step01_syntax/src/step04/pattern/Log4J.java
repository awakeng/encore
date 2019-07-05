package step04.pattern;

public class Log4J {
	private static Log4J instance = new Log4J();
	private Log4J() {}
	public static Log4J getInstance() {
		return instance;
	}
	
	public String info() {
		return "안녕하세요";
	}
	public String warn() {
		return "권한이 없음";
	}
	
}
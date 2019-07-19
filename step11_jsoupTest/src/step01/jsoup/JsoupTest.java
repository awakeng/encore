package step01.jsoup;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTest {

	public static void main(String[] args) {
		//step04 - YT
        String url   = "http://www.youtube.com";

        Document doc=null;
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Elements ytVideoTitles = doc.select("h3>a");	// "#video-title" 
        for (Element a : ytVideoTitles) {
            System.out.println(a.attr("title"));
        }
//		//step03 - 검증
//	//#main > h2:nth-child(6)
//		Document doc = null;
//		try {
//			doc = Jsoup.connect("https://www.w3schools.com/js/default.asp").get();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		/* #main > h2:nth-child(6) : 1개만 반환
//		 * #main > h2 : 존재하는 모든 h2 반환
//		 * 
//		 * select() : 반환 타입 Elements
//		 * 			: Elements => 단수(x) 복수(o)!
//		 */
//		
//		
//		Elements newsHeadlines = doc.select("#main > h2:nth-child(6)");
//								// **select()는 반환 타입이 여러가지인 파라미터들을 커버 가능한 애구나!!**
//		System.out.println(newsHeadlines.text());
//		System.out.println(newsHeadlines.get(0));
//		System.out.println(newsHeadlines.get(0).childNodeSize());
//		System.out.println(newsHeadlines.get(0).hasText());
//		System.out.println(newsHeadlines.get(0).ownText()); // ownText() !== text()
		
//		//step02 - 한글 데이터가 정상 출력 되는지 확인
//		Document doc = null;
//		try {
//			doc = Jsoup.connect("https://ko.wikipedia.org/").get();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println(doc.title());		// 최상위의 Document에 해당하는 value를 받아옴
		
//		Elements newsHeadlines = doc.select("#mp_contentsL > p:nth-child(5)> a");
//		// > a 를 추가함으로써, 상위에 있는 <b>를 무시하고 a를 긁어 고오, 밑에 for문에서 headline.attr("title")과 headline.absUrl("href")를 통해서 title과 href만 출력하였다.
////		System.out.println(newsHeadlines);
////<p>《<b><a href="/wiki/%EB%B3%84%EC%9D%BC_%EC%97%86%EC%9D%B4_%EC%82%B0%EB%8B%A4" title="별일 없이 산다">별일 없이 산다</a></b>》는 2009년 2월에 
////발표된 <a href="/wiki/%EC%9E%A5%EA%B8%B0%ED%95%98%EC%99%80_%EC%96%BC%EA%B5%B4%EB%93%A4" title="장기하와 얼굴들">장기하와 얼굴들</a>의 첫 정규 음반이다. 수...... </p>
//		
//		for (Element headline : newsHeadlines) {
//		  System.out.println(headline.attr("title") + " " + headline.absUrl("href"));
//		}
//		
		
		
		//step01 - 메뉴얼
//		Document doc = null;
//		try {
//			doc = Jsoup.connect("http://en.wikipedia.org/").get();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println(doc.title());
//		Elements newsHeadlines = doc.select("#mp-itn b a");
//		for (Element headline : newsHeadlines) {
//		  System.out.println(headline.attr("title") + headline.absUrl("href"));
//		}
	}

}

// #mp_contentsL > p:nth-child(5)


// 아이디어: 유튜브
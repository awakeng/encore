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
//		//step03 - ����
//	//#main > h2:nth-child(6)
//		Document doc = null;
//		try {
//			doc = Jsoup.connect("https://www.w3schools.com/js/default.asp").get();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		/* #main > h2:nth-child(6) : 1���� ��ȯ
//		 * #main > h2 : �����ϴ� ��� h2 ��ȯ
//		 * 
//		 * select() : ��ȯ Ÿ�� Elements
//		 * 			: Elements => �ܼ�(x) ����(o)!
//		 */
//		
//		
//		Elements newsHeadlines = doc.select("#main > h2:nth-child(6)");
//								// **select()�� ��ȯ Ÿ���� ���������� �Ķ���͵��� Ŀ�� ������ �ֱ���!!**
//		System.out.println(newsHeadlines.text());
//		System.out.println(newsHeadlines.get(0));
//		System.out.println(newsHeadlines.get(0).childNodeSize());
//		System.out.println(newsHeadlines.get(0).hasText());
//		System.out.println(newsHeadlines.get(0).ownText()); // ownText() !== text()
		
//		//step02 - �ѱ� �����Ͱ� ���� ��� �Ǵ��� Ȯ��
//		Document doc = null;
//		try {
//			doc = Jsoup.connect("https://ko.wikipedia.org/").get();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println(doc.title());		// �ֻ����� Document�� �ش��ϴ� value�� �޾ƿ�
		
//		Elements newsHeadlines = doc.select("#mp_contentsL > p:nth-child(5)> a");
//		// > a �� �߰������ν�, ������ �ִ� <b>�� �����ϰ� a�� �ܾ� ���, �ؿ� for������ headline.attr("title")�� headline.absUrl("href")�� ���ؼ� title�� href�� ����Ͽ���.
////		System.out.println(newsHeadlines);
////<p>��<b><a href="/wiki/%EB%B3%84%EC%9D%BC_%EC%97%86%EC%9D%B4_%EC%82%B0%EB%8B%A4" title="���� ���� ���">���� ���� ���</a></b>���� 2009�� 2���� 
////��ǥ�� <a href="/wiki/%EC%9E%A5%EA%B8%B0%ED%95%98%EC%99%80_%EC%96%BC%EA%B5%B4%EB%93%A4" title="����Ͽ� �󱼵�">����Ͽ� �󱼵�</a>�� ù ���� �����̴�. ��...... </p>
//		
//		for (Element headline : newsHeadlines) {
//		  System.out.println(headline.attr("title") + " " + headline.absUrl("href"));
//		}
//		
		
		
		//step01 - �޴���
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


// ���̵��: ��Ʃ��
package step01.jsoup;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class test {
	public static void main(String[] args) {
		//
        String url   = "https://www.google.com/";

        Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Elements test1 = doc.select("span");	// "#video-title"
		Elements test2 = test1.select("class");
		System.out.println(test2.text());
//        for (Element t : test) {
//            System.out.println(t.attr("title"));
//        }
	}
}

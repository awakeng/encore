package step01.jsoup;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import log4j.Log4j;

public class fassionPlus {
	private static Log4j log4j = Log4j.getInstance();
	
	public static void main(String[] args) {
		for(int i = 1; i<17; i++) {
			String n = Integer.toString(i);
	        String url   = "http://www.fashionplus.co.kr/mall/include/comment_list.asp?GoTopage=" + n +"&block=0&goods_id_comment=103609315";
	        
	        Document doc=null;
			try {
				doc = Jsoup.connect(url).get();
			} catch (IOException e) {
				e.printStackTrace();
			}
			Elements comments = doc.select("div.contents > p");
			Elements rankings = doc.select("div.icon_star>p");
			
//			System.out.println(comments);
//			System.out.println(rankings);
			
			int rankCount = 0;
			int rank =0;	
			
//	        for (Element a : comments) {
//	        	log4j.logTest(a.text() + "\n");
//	        }
			for(int j = 0; j<rankings.size(); j++) {
				if(rankings.get(j).attr("class").equals("reviewbg star_on")) {
					rankCount++;
				}
				if((j+1)%5 ==0) {
					rank = rankCount;
					rankCount = 0;
					log4j.logTest("º°Á¡: " + rank);
					log4j.logTest(comments.get((j+1)/5-1).text() + "\n");
				}
			}

			
//	        for (Element b : rankings) {
//	        	System.out.println(b.attr("class"));
//	        	log4j.logTest(b.text() + "\n");
//	        }
		}
	}
	
}
// http://www.fashionplus.co.kr/mall/include/comment_list.asp?GoTopage=1&block=0&goods_id_comment=103609315
// http://www.fashionplus.co.kr/mall/include/comment_list.asp?GoTopage=2&block=0&goods_id_comment=103609315

// <p class="reviewbg star_on"></p>
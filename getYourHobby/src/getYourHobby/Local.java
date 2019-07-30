package getYourHobby;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Local {

    public static void main(String[] args) {
        
    	String clientId = "ZANQ8mprp4o9wkxQ67HS";//���ø����̼� Ŭ���̾�Ʈ ���̵�";
        String clientSecret = "KdD44dmocQ";//���ø����̼� Ŭ���̾�Ʈ ��ũ����";
        
        try {
            String text = URLEncoder.encode("서울 바이올린", "UTF-8");
            String apiURL = "https://openapi.naver.com/v1/search/local.json?display=30&start=1&query=" + text; // json ���
            //String apiURL = "https://openapi.naver.com/v1/search/local.xml"+ text; // xml ���
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // ���� ȣ��
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // ���� �߻�
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuffer response = new StringBuffer();
            
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
                response.append("\n");
            }
            br.close();
           
            System.out.println(response.toString());
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
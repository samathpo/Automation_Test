package Test_Code;

import java.net.HttpURLConnection;
import java.net.URL;

public class LiveChecker {

	public static boolean isLive(String link) {
		
		HttpURLConnection urlconn = null;
		int res = -1;
		String msg = null;
		try {
			
			URL url = new URL(link);
			urlconn = (HttpURLConnection)url.openConnection();
			urlconn.setConnectTimeout(10000);
			urlconn.setRequestMethod("GET");
			urlconn.connect();
			String redirlink = urlconn.getHeaderField("Location");
			System.out.println(urlconn.getHeaderFields());
			if(redirlink != null && !url.toExternalForm().equals(redirlink))
				return isLive(redirlink);
			else
				return urlconn.getResponseCode()==HttpURLConnection.HTTP_OK;
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			return false;
			
		}finally {
			if(urlconn != null)
				urlconn.disconnect();
			}
		}
public static void main(String[] s) {
	
String link  = "http://www.deadlinkcity.com";
System.out.println(isLive(link));
	

}
}

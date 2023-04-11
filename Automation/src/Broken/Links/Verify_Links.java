package Broken.Links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Verify_Links {

	public  void verifyLinks(String LinkVerify)
	{
		try {
			URL url = new URL(LinkVerify);
			HttpURLConnection httpURL = (HttpURLConnection)url.openConnection();
			httpURL.connect();
		
			if(httpURL.getResponseCode()>=400)
			{
				System.out.println(LinkVerify+ "those are Broken Links");
			}
			if(httpURL.getResponseCode()==200)
			{
				System.out.println(LinkVerify+" those are correct Links");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

package test;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.http.HttpClient;
import java.net.URL;
import java.net.URI;

/**
 *
 * @author alebo
 */
public class ReadArchive
{

    static public int[] read(String ldt) throws IOException, InterruptedException
    {
        
        int arr[] = new int[9];
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.stoloto.ru/rapido/archive"))
                .build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String[] s = response.body().split("\n");
        
        for (int i = 0; i < s.length; i++)
        {
            if (s[i].contains(ldt))
            {
                for (int var = 0; var < 8; ++var)
                {
                    String cs = s[i + var + 6];
                    cs = cs.strip().replace("<b >", "").replace("</b>", "").replace("&nbsp;", "");
                    arr[var] = Integer.parseInt(cs);
                }
                String cs = s[i + 16];
                System.out.println(cs);
                cs = cs.strip().replace("<b class=\"extra\">", "").replace("</b>", "").replace("&nbsp;", "");
                arr[8] = Integer.parseInt(cs);
            }
        }
        return arr;
    }
}



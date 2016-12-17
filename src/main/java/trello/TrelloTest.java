package trello;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by Alex Astakhov on 17.11.2016.
 */
public class TrelloTest {
    static String email = "sasha.asta85@gmail.com";
    static String password = "aleksa85";
    static Header userAgent = new BasicHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
    static Header contentType = new BasicHeader("Content-type", "application/x-www-form-urlencoded; charset=UTF-8");
    public static void main(String[] args) throws IOException {
        HttpClient http;
        CookieStore httpCookieStore = new BasicCookieStore();
        HttpClientBuilder builder = HttpClientBuilder.create().setDefaultCookieStore(httpCookieStore);
        http = builder.build();
        HttpPost httpPost = new HttpPost("https://trello.com/1/authentication");
        StringEntity body = new StringEntity("factors[password]=" + password + "&factors[user]=" + email + "&method=password", ContentType.APPLICATION_FORM_URLENCODED);
        httpPost.setHeader(contentType);
        httpPost.setHeader("Cookie", "dsc=66bdfaa71a13884229da6a29e9e7db1a55a50d2aee2f368ca2ac27d190f96e57; lang=ru-RU; __qca=P0-1989637273-1479408495296; __lnkrntdmcvrd=-1; hsfirstvisit=https%3A%2F%2Ftrello.com%2F|https%3A%2F%2Fwww.google.com.ua%2F|1479408498915; __leadinmigrated=1; __leadinutk=12c62c8761003d879d9af991f52ba8d3; mab=582dfb9805ffa2ce817c8995; hasAccount=password; landing=New%20Landing; _sp_id.dc4d=e08ed0b4103acf9f.1479408495.1.1479409427.1479408495; _sp_ses.dc4d=*; _ga=GA1.2.1876570111.1479408491; __hstc=183819321.12c62c8761003d879d9af991f52ba8d3.1479408498919.1479408498919.1479408498919.1; __hssrc=1; __hssc=183819321.5.1479408498920; hubspotutk=12c62c8761003d879d9af991f52ba8d3");
        httpPost.setEntity(body);
        HttpResponse httpResponse = http.execute(httpPost);
        String code = EntityUtils.toString(httpResponse.getEntity());
        code = code.substring(code.indexOf(":") + 2);
        code = code.substring(0, code.indexOf("\""));
        HttpPost httpPost1 = new HttpPost("https://trello.com/1/authorization/session");
        body = new StringEntity("authentication=" + code + "&dsc=66bdfaa71a13884229da6a29e9e7db1a55a50d2aee2f368ca2ac27d190f96e57", ContentType.APPLICATION_FORM_URLENCODED);
        httpPost1.setHeader(contentType);
        httpPost1.setHeader("Cookie", "dsc=66bdfaa71a13884229da6a29e9e7db1a55a50d2aee2f368ca2ac27d190f96e57; lang=ru-RU; __qca=P0-1989637273-1479408495296; __lnkrntdmcvrd=-1; hsfirstvisit=https%3A%2F%2Ftrello.com%2F|https%3A%2F%2Fwww.google.com.ua%2F|1479408498915; __leadinmigrated=1; __leadinutk=12c62c8761003d879d9af991f52ba8d3; mab=582dfb9805ffa2ce817c8995; hasAccount=password; landing=New%20Landing; _sp_id.dc4d=e08ed0b4103acf9f.1479408495.1.1479409427.1479408495; _sp_ses.dc4d=*; _ga=GA1.2.1876570111.1479408491; __hstc=183819321.12c62c8761003d879d9af991f52ba8d3.1479408498919.1479408498919.1479408498919.1; __hssrc=1; __hssc=183819321.5.1479408498920; hubspotutk=12c62c8761003d879d9af991f52ba8d3");
        httpPost1.setEntity(body);
        http.execute(httpPost1);
        HttpGet httpGet = new HttpGet("https://trello.com/1/boards/582dfb9805ffa2ce817c89a7");
        httpGet.setHeader("Cookie", "dsc=66bdfaa71a13884229da6a29e9e7db1a55a50d2aee2f368ca2ac27d190f96e57; lang=ru-RU; __qca=P0-1989637273-1479408495296; __lnkrntdmcvrd=-1; hsfirstvisit=https%3A%2F%2Ftrello.com%2F|https%3A%2F%2Fwww.google.com.ua%2F|1479408498915; __leadinmigrated=1; __leadinutk=12c62c8761003d879d9af991f52ba8d3; mab=582dfb9805ffa2ce817c8995; hasAccount=password; landing=New%20Landing; _sp_id.dc4d=e08ed0b4103acf9f.1479408495.1.1479409427.1479408495; _sp_ses.dc4d=*; _ga=GA1.2.1876570111.1479408491; __hstc=183819321.12c62c8761003d879d9af991f52ba8d3.1479408498919.1479408498919.1479408498919.1; __hssrc=1; __hssc=183819321.5.1479408498920; hubspotutk=12c62c8761003d879d9af991f52ba8d3");
        httpResponse = http.execute(httpGet);
        System.out.println(EntityUtils.toString(httpResponse.getEntity()));
        /*HttpResponse httpResponse = Request.Post("https://trello.com/1/authentication").addHeader(contentType)
                .bodyString("factors[password]=" + password + "&factors[user]=" + email + "&method=password", ContentType.APPLICATION_FORM_URLENCODED).execute().returnResponse();*/
    }
}

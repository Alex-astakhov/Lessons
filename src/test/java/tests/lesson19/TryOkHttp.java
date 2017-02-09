package tests.lesson19;

import com.google.gson.Gson;
import lesson19.GetResp;
import okhttp3.*;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Alex Astakhov on 26.12.2016.
 */
public class TryOkHttp {
    String url = "http://httpbin.org/get?a=b";
    Gson gson = new Gson();

    @Test
    public void testOkHttp() throws IOException {
        String resp = runGet(url);
        GetResp getResp = gson.fromJson(resp, GetResp.class);
        System.out.println(getResp);
    }

    @Test
    public void testPostMethod() throws IOException {
        String resp = runPost();
        System.out.println(resp);

    }

    String runGet (String url) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36")
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    String runPost () throws IOException {
        String url = "http://httpbin.org/post";
        OkHttpClient client = new OkHttpClient();
        RequestBody requestBody = new FormBody.Builder()
                .add("alalal", "3")
                .add("jack", "Sparrow")
                .build();

        Request request = new Request.Builder()
                .url(url)
                .header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36")
                .post(requestBody)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

}


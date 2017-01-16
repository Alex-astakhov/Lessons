package lesson19.homework;

import okhttp3.*;

import java.io.IOException;

/**
 * Created by Alex Astakhov on 05.01.2017.
 */
public class Requests {

    public String runGet (String url) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public String runGet (String url, CookieJar jar) throws IOException {
        OkHttpClient client = new OkHttpClient.Builder().cookieJar(jar).build();
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }


    public String runPost () throws IOException {
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

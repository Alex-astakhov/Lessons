package tests.lesson19.homework;

import com.google.gson.Gson;
import lesson19.homework.CookieStorage;
import lesson19.homework.Requests;
import lesson19.homework.models.CookiesModel;
import lesson19.homework.models.GetModel;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static net.javacrumbs.jsonunit.JsonAssert.assertJsonEquals;
import static net.javacrumbs.jsonunit.JsonAssert.when;
import static net.javacrumbs.jsonunit.core.Option.IGNORING_VALUES;

/**
 * Created by Alex Astakhov on 05.01.2017.
 */
public class HttppbinTest {
    final String URL = "http://httpbin.org/";

    Requests requests = new Requests();
    Gson gson = new Gson();
    CookieStorage cookieStorage = new CookieStorage();

    @Test
    public void verifyGet() throws IOException {
        String actual = requests.runGet(URL + "get");
        System.out.println(actual);
        GetModel expected = new GetModel();
        assertJsonEquals(expected, actual, when(IGNORING_VALUES));
    }

    @Test
    public void verifyCookiesSet() throws IOException {
        String actual = requests.runGet(URL + "cookies/set?jack=sparrow", cookieStorage);
        System.out.println(actual);
        assertJsonEquals(new CookiesModel("sparrow"), actual);
    }

    @Test(dependsOnMethods = "verifyCookiesSet")
    public void verifyCookies() throws IOException {
        String actual = requests.runGet(URL + "cookies", cookieStorage);
        System.out.println(actual);
        assertJsonEquals(new CookiesModel("sparrow"), actual);
    }

    @Test(dependsOnMethods = "verifyCookies", alwaysRun = true)
    public void verifyCookiesDelete() throws IOException {
        String actual = requests.runGet(URL + "cookies/delete?jack", cookieStorage);
        System.out.println(actual);
        assertJsonEquals(new CookiesModel(""), actual);
    }

    @Test
    public void verifyHtml() throws IOException {
        String actual = requests.runGet(URL + "html");
        System.out.println(actual);
        Assert.assertTrue(actual.contains("<html>"), "Response doesn't contain html tag");
    }

    @Test
    public void verifyFormPost() throws IOException {
        String actual = requests.runGet(URL + "forms/post");
        System.out.println(actual);
        Assert.assertTrue(actual.contains("action=\"/post\""), "Response doesn't contain action=\"post\"");
    }

    @Test
    public void verifyBasicAuth() throws IOException {
        /*OkHttpClient client=new OkHttpClient();
        String url="http://httpbin.org/basic-auth/user/passwd";
        Request request=new Request.Builder()
                .header("Authorization","Basic dXNlcjpwYXNzd2Q=8")
                .url(url).build();
        Response response=client.newCall(request).execute();
        System.out.println(response.body().string());*/
    }
}

package tests.trelloApi;

import lesson20.Requests;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.RequestBody;
import org.testng.annotations.Test;


/**
 * Created by Alex Astakhov on 13.01.2017.
 */
public class Trello {

    private final String KEY = "0421ec5e82a094557eb1125897f78f29";
    private final String TOKEN = "293664ac2f88ae1e70d074e0e1c98b9d5a36f58b1e059fef44bc07009d4641fa";

    private String host = "api.trello.com";
    private String scheme = "https";
    private String boardId = "587891c77fe7235b78d39de4";
    private String listId = "587a0d15759b32f05bcb1eae";

    @Test
    public void getBoards(){
        HttpUrl url = new HttpUrl.Builder().scheme(scheme).host(host).addPathSegments("1/boards/" + boardId)
                .addQueryParameter("lists","open").addQueryParameter("list_fields","name").addQueryParameter("fields","name,desc")
                .addQueryParameter("key",KEY).addQueryParameter("token",TOKEN).build();
        String resp = Requests.makeGetRequest(url);
        System.out.println(resp);
    }

    @Test
    public void getLists(){
        HttpUrl url = new HttpUrl.Builder().scheme(scheme).host(host).addPathSegments("1/boards/" + boardId + "/lists")
                .addQueryParameter("cards","open").addQueryParameter("card_fields","name").addQueryParameter("fields","name")
                .addQueryParameter("key",KEY).addQueryParameter("token",TOKEN).build();
        String resp = Requests.makeGetRequest(url);
        System.out.println(resp);
    }

    @Test
    public void createCard(){

        HttpUrl url = new HttpUrl.Builder().scheme(scheme).host(host).addPathSegments("1/cards")
                .addQueryParameter("key",KEY).addQueryParameter("token",TOKEN).build();
        RequestBody body = new FormBody.Builder()
                .add("name", "Auto_test_card").add("idList", listId).build();
        String resp = Requests.makePostRequest(url,body);
        System.out.println(resp);
    }
}

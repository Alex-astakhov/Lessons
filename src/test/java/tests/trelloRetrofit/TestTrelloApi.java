package tests.trelloRetrofit;

import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Asta on 27.01.2017.
 */
public class TestTrelloApi {

    public final String KEY = "0421ec5e82a094557eb1125897f78f29";
    public final String TOKEN = "293664ac2f88ae1e70d074e0e1c98b9d5a36f58b1e059fef44bc07009d4641fa";

    @Test
    public void get() throws IOException {
        TrelloRestClient client = new TrelloRestClient();
        client.trelloApi.getBoardInfo("587891c77fe7235b78d39de4", "open", "name", "name,desk", KEY, TOKEN).execute();
    }
}

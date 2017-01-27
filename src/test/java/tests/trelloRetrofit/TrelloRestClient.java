package tests.trelloRetrofit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Asta on 27.01.2017.
 */
public class TrelloRestClient {

    public TrelloApi trelloApi;

    public final String KEY = "0421ec5e82a094557eb1125897f78f29";
    public final String TOKEN = "293664ac2f88ae1e70d074e0e1c98b9d5a36f58b1e059fef44bc07009d4641fa";

    private static final String BASE_URL = "https://api.trello.com";

    public TrelloRestClient() {
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .writeTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .addInterceptor(new HTTPLogInterceptor())
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        trelloApi = retrofit.create(TrelloApi.class);
    }


}

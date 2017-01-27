package tests.trelloRetrofit;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Asta on 27.01.2017.
 */
public interface TrelloApi {
    @GET("1/boards/{board_id}")
    Call<ResponseBody> getBoardInfo(@Path("board_id") String id, @Query("lists") String lists,
                                    @Query("list_fields") String lists_fields, @Query("fields") String fields,
                                    @Query("key") String key, @Query("token") String token);
}

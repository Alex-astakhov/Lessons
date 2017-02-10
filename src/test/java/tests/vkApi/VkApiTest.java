package tests.vkApi;

import com.google.gson.Gson;
import lesson20.Requests;
import okhttp3.*;
import org.testng.annotations.Test;
import vkApi.UploadUrlModel;

import java.io.File;

/**
 * Created by Alex Astakhov on 22.01.2017.
 */
public class VkApiTest {


    private String host = "api.vk.com";
    private String scheme = "https";
    private String applicationId = "5835747";
    private final String TOKEN = "889a38d76043ce33cbd26c55b9089854767e7d850fa5188f895c46e308e9e635749078b4ea6969cac97dc";
    private String methodGetUploadAdr = "photos.getUploadServer";
    private String albumId = "240642534";
    private String uploadUrl;


    @Test
    public void getUploadAddress(){
        HttpUrl url = new HttpUrl.Builder().scheme(scheme).host(host).addPathSegments("method/" + methodGetUploadAdr)
                .addQueryParameter("album_id", albumId)
                .addQueryParameter("access_token", TOKEN).addQueryParameter("v","5.62").build();
        String resp = Requests.makeGetRequest(url);
        System.out.println(resp);
        Gson gson = new Gson();
        UploadUrlModel uploadUrlModel = gson.fromJson(resp, UploadUrlModel.class);
        uploadUrl = uploadUrlModel.response.uploadUrl;
    }

    @Test(dependsOnMethods = "getUploadAddress")
    public void uploadPhoto(){
        File img = new File("D:\\Kiev.jpg");
        MediaType mediaType = MediaType.parse("multipart/form-data");
        RequestBody requestBody = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("file1", "Kiev.jpg")
                .addFormDataPart("file1", "Kiev.jpg", RequestBody.create(mediaType, img))
                .build();

        String resp = Requests.makePostRequest(uploadUrl,requestBody);
        System.out.println(resp);
    }
}

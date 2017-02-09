package vkApi;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Alex Astakhov on 22.01.2017.
 */
public class UploadUrlModel {

    public Response response;
    public class Response{
        @SerializedName("upload_url")
        public String uploadUrl;
        @SerializedName("album_id")
        public String albumId;
        @SerializedName("user_id")
        public String userId;

        @Override
        public String toString() {
            return "Response{" +
                    "uploadUrl='" + uploadUrl + '\'' +
                    ", albumId='" + albumId + '\'' +
                    ", userId='" + userId + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "UploadUrlModel{" +
                "response=" + response +
                '}';
    }
}

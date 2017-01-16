package lesson19;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Alex Astakhov on 26.12.2016.
 */
public class GetResp {
    public class Args{

        @Override
        public String toString() {
            return "Args{}";
        }
    }
    public Args args;

    public class Headers{
        @SerializedName("Accept-Encoding")
        String acceptEncoding;

        @SerializedName("Host")
        String host;

        @SerializedName("User-Agent")
        String userAgent;

        @Override
        public String toString() {
            return "Headers{" +
                    "acceptEncoding='" + acceptEncoding + '\'' +
                    ", host='" + host + '\'' +
                    ", userAgent='" + userAgent + '\'' +
                    '}';
        }
    }
    public Headers headers;

    public String origin;
    public String url;

    @Override
    public String toString() {
        return "GetResp{" +
                "args=" + args +
                ", headers=" + headers +
                ", origin='" + origin + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}

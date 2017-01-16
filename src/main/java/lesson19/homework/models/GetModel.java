package lesson19.homework.models;

import com.google.gson.annotations.SerializedName;
import lesson19.GetResp;

/**
 * Created by Alex Astakhov on 05.01.2017.
 */
public class GetModel {
    public class Args{

        @Override
        public String toString() {
            return "Args{}";
        }
    }
    public Args args = new Args();

    public class Headers{
        @SerializedName("Accept-Encoding")
        String acceptEncoding = "";

        @SerializedName("Host")
        String host = "";

        @SerializedName("User-Agent")
        String userAgent = "";

        @Override
        public String toString() {
            return "Headers{" +
                    "acceptEncoding='" + acceptEncoding + '\'' +
                    ", host='" + host + '\'' +
                    ", userAgent='" + userAgent + '\'' +
                    '}';
        }
    }
    public Headers headers = new Headers();

    public String origin = "";
    public String url = "";

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
package com.example.architecturecomponentdemo.api;

import com.example.architecturecomponentdemo.model.ConfigurationModel;
import com.example.architecturecomponentdemo.model.Post;
import com.example.architecturecomponentdemo.model.VolumesResponse;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

public interface Apis {

    @GET("/books/v1/volumes")
    Call<VolumesResponse> searchVolumes(
            @Query("q") String query,
            @Query("inauthor") String author
    );

//    @FormUrlEncoded
//    @POST("simplelogin.php")
//    Call<String>  getUserLogin(
//            @Field("username") String uname,
//            @Field("password") String password
//    );


    @POST("/posts")
    @FormUrlEncoded
    Call<Post> savePost(@Field("title") String title,
                        @Field("body") String body,
                        @Field("userId") long userId);

//    @FormUrlEncoded
//    @POST("configuration")
//    @Headers({"Content-Type: application/json"})
//    Call<List<ConfigurationModel>> getConfiguartion(@Field("app_type") String aa,
//                                                   @Field("app_version") String bbb);


}

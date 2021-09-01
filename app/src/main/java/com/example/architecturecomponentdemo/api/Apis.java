package com.example.architecturecomponentdemo.api;

import com.example.architecturecomponentdemo.model.Post;
import com.example.architecturecomponentdemo.model.VolumesResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Apis {

    @GET("/books/v1/volumes")
    Call<VolumesResponse> searchVolumes(
            @Query("q") String query,
            @Query("inauthor") String author
    );



    @POST("/posts")
    @FormUrlEncoded
    Call<Post> savePost(@Field("title") String title,
                        @Field("body") String body,
                        @Field("userId") long userId);



}

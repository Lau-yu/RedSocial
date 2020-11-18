package com.optic.socialmediagamer.retrofit;

import com.optic.socialmediagamer.models.FCMBody;
import com.optic.socialmediagamer.models.FCMResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMApi {

    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAWygXh_k:APA91bHBLFlVjnrw3-jlsn-u8AVI3ZSMCiT5F6sDRN-NFsiS9RTuaU1EHEylCYh-CAWXjgcuVQLPeuvjQAbryUvx1OjJf2xjOAajKWf1BEaKze0bddurmfMgSb_Ijk48tYHjVy0dtyDD"
    })
    @POST("fcm/send")
    Call<FCMResponse> send(@Body FCMBody body);
}

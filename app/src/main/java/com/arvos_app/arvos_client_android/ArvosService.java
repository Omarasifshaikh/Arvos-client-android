package com.arvos_app.arvos_client_android;

import com.arvos_app.arvos_client_android.model.Augment;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by omar on 8/15/15.
 */
public interface ArvosService {
    @GET("/directory-service")
    void getDirectory(Callback<List<Augment>> aug);
}

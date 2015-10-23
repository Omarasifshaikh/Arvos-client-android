package com.arvos_app.arvos_client_android;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.arvos_app.arvos_client_android.model.Augment;
import com.arvos_app.arvos_client_android.model.Directory;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends Activity{

    protected final static String TAG =
            MainActivity.class.getSimpleName();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        requestData();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (item.getItemId() == R.id.action_get_data) {
            requestData();

        }

        return super.onOptionsItemSelected(item);
    }

    private void requestData(){
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://10.0.2.2:8080")
                .build();

        ArvosService service = restAdapter.create(ArvosService.class);
        service.getAugments(new Callback<List<Augment>>() {
            @Override
            public void success(List<Augment> augments, Response response) {
                Log.d(TAG, "SUCCESS");
                Log.d(TAG, augments.get(0).toString());

            }

            @Override
            public void failure(RetrofitError error) {
                Log.d(TAG, error.getMessage());
            }
        });
        service.getDirectory(new Callback<List<Directory>>() {
            @Override
            public void success(List<Directory> directories, Response response) {
                Log.d(TAG, "SUCCESS");
                Log.d(TAG, directories.get(0).toString());

            }

            @Override
            public void failure(RetrofitError error) {
                Log.d(TAG, error.getMessage());
            }
        });

    }


}

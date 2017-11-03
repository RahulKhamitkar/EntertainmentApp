package com.rahul.channel.Network;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.rahul.channel.Model.Channel;
import com.rahul.channel.R;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by rahul on 3/11/17.
 */

public interface RetrofitArrayAPI {

    @GET(".json")
    Call<List<Channel>> getChannelDetails();
}

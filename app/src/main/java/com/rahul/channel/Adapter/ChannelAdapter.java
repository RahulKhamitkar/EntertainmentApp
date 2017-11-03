package com.rahul.channel.Adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rahul.channel.Model.Channel;
import com.rahul.channel.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by rahul on 3/11/17.
 */

public class ChannelAdapter extends RecyclerView.Adapter<ChannelAdapter.ViewHolder> {
private List<Channel> channels;
    private Context context;


public ChannelAdapter(List<Channel> Channell,Context context) {
        this.channels= Channell;
        this.context = context;


        }
@Override
public ChannelAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardviewnews, viewGroup, false);
        return new ChannelAdapter.ViewHolder(view);

        }

@Override
public void onBindViewHolder(ChannelAdapter.ViewHolder viewHolder, int i) {


    viewHolder.title.setText(channels.get(i).getTitle());
    viewHolder.date.setText(channels.get(i).getDate());
    viewHolder.discription.setText(channels.get(i).getDiscription());

    Picasso.with(context)
            .load(channels.get(i).getIcon())
            .placeholder(R.mipmap.ic_launcher_round) //this is optional the image to display while the url image is downloading
            .error(R.mipmap.ic_launcher_round)         //this is also optional if some error has occurred in downloading the image this image would be displayed
            .into(viewHolder.icon);

    Picasso.with(context)
            .load(channels.get(i).getPic())
            .placeholder(R.mipmap.ic_launcher_round) //this is optional the image to display while the url image is downloading
            .error(R.mipmap.ic_launcher_round)         //this is also optional if some error has occurred in downloading the image this image would be displayed
            .into(viewHolder.pic);

        }

@Override
public int getItemCount() {
        return channels.size();
        }

public class ViewHolder extends RecyclerView.ViewHolder{
    private TextView title;
    private TextView date;
    private ImageView icon;
    private ImageView pic;
    private TextView discription;

    public ViewHolder(View view) {
        super(view);

        title = (TextView)view.findViewById(R.id.iTitle);
        date = (TextView)view.findViewById(R.id.iDate);
        discription = (TextView)view.findViewById(R.id.iDiscription);
        icon = (ImageView) view.findViewById(R.id.iIcon);
        pic = (ImageView) view.findViewById(R.id.iPic);

    }
}
}

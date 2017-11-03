package com.rahul.channel.Model;

/**
 * Created by rahul on 3/11/17.
 */

public class Channel {

    private String icon;

    private String title;

    private String discription;

    private String pic;

    private String date;

    public String getIcon ()
    {
        return icon;
    }

    public void setIcon (String icon)
    {
        this.icon = icon;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getDiscription ()
    {
        return discription;
    }

    public void setDiscription (String discription)
    {
        this.discription = discription;
    }

    public String getPic ()
    {
        return pic;
    }

    public void setPic (String pic)
    {
        this.pic = pic;
    }

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [icon = "+icon+", title = "+title+", discription = "+discription+", pic = "+pic+", date = "+date+"]";
    }
}

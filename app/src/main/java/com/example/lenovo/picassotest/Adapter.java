package com.example.lenovo.picassotest;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by lenovo on 28/6/2016.
 */
public class Adapter extends BaseAdapter{

    Context context;
    ArrayList<News>list;
    public Adapter(Context context,ArrayList<News>list)
    {
        this.context=context;
        this.list=list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Viewholder viewholder;
        if (convertView==null)
        {
            viewholder=new Viewholder();
            convertView=View.inflate(context,R.layout.item,null);
            viewholder.imageView= (ImageView) convertView.findViewById(R.id.image);
            viewholder.title= (TextView) convertView.findViewById(R.id.title);
            convertView.setTag(viewholder);
        }
        else{
            viewholder= (Viewholder) convertView.getTag();
        }

        viewholder.title.setText(list.get(position).getTitle());
        Picasso.with(context).load(list.get(position).getPicUrl()).fit()
                .error(R.drawable.p)
                .into(viewholder.imageView);
        return convertView;
    }


    class Viewholder{
        ImageView imageView;
        TextView title;
    }
}

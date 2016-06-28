package com.example.lenovo.picassotest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<News>list_new=new ArrayList<News>();
    ListView mlistview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mlistview= (ListView) findViewById(R.id.mlistview);
        initData();
        Adapter adapter=new Adapter(this,list_new);
        mlistview.setAdapter(adapter);
    }

    private void initData()
    {
        News news = new News();
        news.setTitle("清纯的美女");
        news.setContents("我不说什么，大家自己看");
        news.setPicUrl("http://g.hiphotos.baidu.com/image/pic/item/6c224f4a20a446230761b9b79c22720e0df3d7bf.jpg");
        list_new.add(news);

        News news2 = new News();
        news2.setTitle("好看的美女");
        news2.setContents("我不说什么，大家自己看");
        news2.setPicUrl("http://f.hiphotos.baidu.com/image/pic/item/11385343fbf2b211eee0554ac88065380dd78eec.jpg");
        list_new.add(news2);

        News news1 = new News();
        news1.setTitle("狂野的美女");
        news1.setContents("我不说什么，大家自己看");
        news1.setPicUrl("http://a.hiphotos.baidu.com/image/h%3D200/sign=623f372f0b24ab18ff16e63705fbe69a/267f9e2f070828382f690e1dba99a9014c08f157.jpg");
        list_new.add(news1);

        News news4 = new News();
        news4.setTitle("小护士");
        news4.setContents("我不说什么，大家自己看");
        news4.setPicUrl("http://f.hiphotos.baidu.com/image/pic/item/738b4710b912c8fc6684dceaf9039245d68821a5.jpg");
        list_new.add(news4);

        News news5 = new News();
        news5.setTitle("古典的美女");
        news5.setContents("我不说什么，大家自己看");
        news5.setPicUrl("http://c.hiphotos.baidu.com/image/pic/item/342ac65c10385343498219169613b07eca8088bc.jpg");
        list_new.add(news5);

        News news6 = new News();
        news6.setTitle("清纯的美女");
        news6.setContents("我不说什么，大家自己看");
        news6.setPicUrl("http://c.hiphotos.baidu.com/image/pic/item/a044ad345982b2b7a2f0f7cd33adcbef76099b48.jpg");
        list_new.add(news6);

        News news7 = new News();
        news7.setTitle("清纯的美女");
        news7.setContents("我不说什么，大家自己看");
        news7.setPicUrl("http://e.hiphotos.baidu.com/image/pic/item/8b13632762d0f7031db73fdc0afa513d2697c5ad.jpg");
        list_new.add(news7);

        News news8 = new News();
        news8.setTitle("清纯的美女");
        news8.setContents("我不说什么，大家自己看");
        news8.setPicUrl("http://b.hiphotos.baidu.com/image/pic/item/9825bc315c6034a857770337ce134954082376ea.jpg");
        list_new.add(news8);

        News news9 = new News();
        news9.setTitle("清纯的美女");
        news9.setContents("我不说什么，大家自己看");
        news9.setPicUrl("http://b.hiphotos.baidu.com/image/pic/item/9825bc315c6034a857770337ce134954082376ea.jpg");
        list_new.add(news9);

        News news10 = new News();
        news10.setTitle("清纯的美女");
        news10.setContents("我不说什么，大家自己看");
        news10.setPicUrl("http://c.hiphotos.baidu.com/image/pic/item/a044ad345982b2b7a2f0f7cd33adcbef76099b48.jpg");
        list_new.add(news10);


        News news11 = new News();
        news11.setTitle("清纯的美女");
        news11.setContents("我不说什么，大家自己看");
        news11.setPicUrl("http://g.hiphotos.baidu.com/image/pic/item/6c224f4a20a446230761b9b79c22720e0df3d7bf.jpg");
        list_new.add(news11);

        News news12 = new News();
        news12.setTitle("好看的美女");
        news12.setContents("我不说什么，大家自己看");
        news12.setPicUrl("http://f.hiphotos.baidu.com/image/pic/item/11385343fbf2b211eee0554ac88065380dd78eec.jpg");
        list_new.add(news12);

        News news13 = new News();
        news13.setTitle("好看的美女");
        news13.setContents("我不说什么，大家自己看");
        news13.setPicUrl("http://f.hiphotos.baidu.com/image/pic/item/11385343fbf2b211eee0554ac88065380dd78eec.jpg");
        list_new.add(news13);

        News news14 = new News();
        news14.setTitle("好看的美女");
        news14.setContents("我不说什么，大家自己看");
        news14.setPicUrl("http://f.hiphotos.baidu.com/image/pic/item/11385343fbf2b211eee0554ac88065380dd78eec.jpg");
        list_new.add(news14);

        News news15 = new News();
        news15.setTitle("好看的美女");
        news15.setContents("我不说什么，大家自己看");
        news15.setPicUrl("http://f.hiphotos.baidu.com/image/pic/item/11385343fbf2b211eee0554ac88065380dd78eec.jpg");
        list_new.add(news15);

        News news16 = new News();
        news16.setTitle("好看的美女");
        news16.setContents("我不说什么，大家自己看");
        news16.setPicUrl("http://f.hiphotos.baidu.com/image/pic/item/11385343fbf2b211eee0554ac88065380dd78eec.jpg");
        list_new.add(news16);

        News news17 = new News();
        news17.setTitle("好看的美女");
        news17.setContents("我不说什么，大家自己看");
        news17.setPicUrl("http://f.hiphotos.baidu.com/image/pic/item/11385343fbf2b211eee0554ac88065380dd78eec.jpg");
        list_new.add(news17);

        News news18 = new News();
        news18.setTitle("好看的美女");
        news18.setContents("我不说什么，大家自己看");
        news18.setPicUrl("http://f.hiphotos.baidu.com/image/pic/item/11385343fbf2b211eee0554ac88065380dd78eec.jpg");
        list_new.add(news18);

        News news19 = new News();
        news19.setTitle("好看的美女");
        news19.setContents("我不说什么，大家自己看");
        news19.setPicUrl("http://f.hiphotos.baidu.com/image/pic/item/11385343fbf2b211eee0554ac88065380dd78eec.jpg");
        list_new.add(news19);

        News news20 = new News();
        news20.setTitle("好看的美女");
        news20.setContents("我不说什么，大家自己看");
        news20.setPicUrl("http://f.hiphotos.baidu.com/image/pic/item/11385343fbf2b211eee0554ac88065380dd78eec.jpg");
        list_new.add(news20);
    }
}

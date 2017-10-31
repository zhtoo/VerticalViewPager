package com.zht.verticalviewpager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private VerticalViewPager viewPager;
    private ViewPagerAdapter adapter;
    private List<ImageView> lists = new ArrayList<ImageView>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (VerticalViewPager) findViewById(R.id.viewPager);
        // 随页面滑动图片
        // 热门商圈和热门分类 页面添加到viewPager集合
        int[] images = {R.drawable.test0, R.drawable.test1, R.drawable.test2, R.drawable.test3};
        for (int i : images) {
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(i);
            lists.add(imageView);
        }
        adapter = new ViewPagerAdapter(lists);
        viewPager.setAdapter(adapter);
    }
}

package com.example.todayinformation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;


public class FullScreeVideoView extends VideoView {
    //总要用于直接new出来的对象
    public FullScreeVideoView(Context context) {
        super(context);
    }

    //主要用于xml文件，支持自定义属性
    public FullScreeVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    //主要用于xml文件，支持自定义属性同时支持style样式
    public FullScreeVideoView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //widthMeasureSpece主要内容 1.测量模式 2.测量大小
        int width = getDefaultSize(0, widthMeasureSpec);
        int height = getDefaultSize(0, heightMeasureSpec);
        setMeasuredDimension(width,height);
//        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}

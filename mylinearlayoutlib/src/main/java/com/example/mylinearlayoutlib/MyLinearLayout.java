package com.example.mylinearlayoutlib;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by liuyongyi on 2018/1/17.
 */

public class MyLinearLayout extends LinearLayout {
    private int landscape = 0;//0：横屏,1:竖屏

    private int ImagerResourse = R.drawable.ic_launcher;//默认图片




    public MyLinearLayout(Context context) {
        super(context,null);

    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(attrs,context);
    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(attrs,context);
    }

    public MyLinearLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initView(attrs,context);
    }

    public void initView(AttributeSet attrs,Context context) {
        if (landscape == 0) {
            setOrientation(HORIZONTAL);
        } else {
            setOrientation(VERTICAL);
        }
        TypedArray a = context.obtainStyledAttributes(attrs,R.styleable.myLinearLayout);

        addView(context);



    }

    private void addView(Context context) {
        ImageView imageheader = new ImageView(context);
        imageheader.setBackgroundResource(ImagerResourse);
        addView(imageheader);

        TextView title = new TextView(context);
        LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT, 1.0f);
        title.setText("哈哈哈");
        title.setBackgroundColor(Color.BLUE);
        title.setLayoutParams(params);
        title.setGravity(Gravity.CENTER|Gravity.LEFT);
        addView(title);


        TextView edit = new TextView(context);
        edit.setText("111111111");
        edit.setGravity(Gravity.CENTER);
        addView(edit);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

}

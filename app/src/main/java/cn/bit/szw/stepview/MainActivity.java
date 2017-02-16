package cn.bit.szw.stepview;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import cn.bit.szw.widget.StepView;
import cn.bit.szw.widget.Util;

/**
 * Created by szw on 16/3/24.
 */
public class MainActivity extends Activity {
    StepView mStepView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mStepView = (StepView)findViewById(R.id.stepview);

        List<String> lables = new ArrayList<>();
        lables.add("获取");
        lables.add("获取资格");
        lables.add("获取");
        lables.add("订单完成");

        mStepView.setStepText(lables);
        mStepView.setTextColor(Color.parseColor("#C8C8C8"));
        mStepView.setCurrentStep(2);
        mStepView.setDrawable(getResources().getDrawable(R.drawable.bg_reached_marker));
        mStepView.setDrawableMargin(0);
        mStepView.setReachedDrawable(getResources().getDrawable(R.drawable.bg_reached_marker));
        mStepView.setUnreachedDrawable(getResources().getDrawable(R.drawable.bg_next_marker));
        mStepView.setCurrentDrawable(getResources().getDrawable(R.drawable.bg_cur_marker));
        mStepView.setCurrentTextColor(Color.parseColor("#42CFC8"));
        mStepView.setVerticalSpace(24);
        mStepView.setReachedDrawableSize(Util.dp2px(this , 20));
        mStepView.setCurrentDrawableSize(Util.dp2px(this , 20));
        mStepView.setUnReachedDrawableSize(Util.dp2px(this , 10));
        mStepView.setUnreachedLineColor(Color.WHITE);
        mStepView.setReachedLineColor(Color.RED);
        mStepView.setLineHeight(1);
        mStepView.setLineColor(Color.parseColor("#C8C8C8"));
    }
}

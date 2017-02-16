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
        lables.add("选择产品");
        lables.add("生成订单");
        lables.add("付款");
        lables.add("下单完成");

        mStepView.setStepText(lables);
        mStepView.setCurrentStep(2);
    }
}

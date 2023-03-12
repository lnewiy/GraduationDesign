package com.example.testn_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView X1;
    public TextView Y1;
    public View touchArea;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        X1 = (TextView) findViewById(R.id.corrX);
        Y1 = (TextView) findViewById(R.id.corrY);
        touchArea = (View) findViewById(R.id.hint1);

        touchArea.setOnTouchListener(handleTouch);
    }

    private final View.OnTouchListener handleTouch = new View.OnTouchListener() {

        public boolean onTouch(View v,MotionEvent event) {

            int x = (int) event.getX();
            int y = (int) event.getY();

            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    Log.e("touch", "起始位置x:" + x + ",y:" + y);

                    break;
                case MotionEvent.ACTION_MOVE:
                    Log.e("touch", "当前位置x:" + x + ",y:" + y);
                    X1.setText("X坐标为："+x);
                    Y1.setText("Y坐标为："+y);
                    break;
                case MotionEvent.ACTION_UP:
                    Log.e("touch", "结束位置x:" + x + ",y:" + y);
                    break;
                default:
                    break;
            }
            return true;

        }
    };

}




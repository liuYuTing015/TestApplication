package com.yuanzi.ting.testapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class TestActivity extends AppCompatActivity {

    @InjectView(R.id.test_text)
    TextView mTestText;
    @InjectView(R.id.test_button)
    Button mTestButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.inject(this);
        Log.i("LifeCycle 2", "onCreate()");
        mTestText.setText(getIntent().getStringExtra("text"));



    }

    @OnClick(R.id.test_button)
    public void onBackButtonClick(View view) {
        onBackPressed();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LifeCycle 2", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LifeCycle 2", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LifeCycle 2", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LifeCycle 2", "onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("LifeCycle 2", "onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LifeCycle 2", "onDestroy()");
    }
}

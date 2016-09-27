package com.yuanzi.ting.testapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.text)
    EditText mText;
    @InjectView(R.id.button)
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        Log.i("LifeCycle 1", "onCreate()");

    }

    @OnClick(R.id.button)
    public void onBackButtonClick(View view) {
        Intent intent = new Intent(this, TestActivity.class);
        intent.putExtra("text",mText.getText().toString());
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LifeCycle 1", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LifeCycle 1", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LifeCycle 1", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LifeCycle 1", "onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("LifeCycle 1", "onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LifeCycle 1", "onDestroy()");
    }
}

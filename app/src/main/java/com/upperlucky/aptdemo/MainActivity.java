package com.upperlucky.aptdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.upperlucky.lib_reflection.BindView;
import com.upperlucky.lib_reflection.Binding;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textView)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Binding.bind(this);
        textView.setText("apt demo");
    }
}
package com.example.a3aug_wepart_fragmentcommunication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import static android.content.Intent.getIntent;

public class PreviewActivity extends AppCompatActivity {

    private TextView mTvName, mTvAge, mTvGrade, mTvPercentage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        initViews();
        getDataFromIntent();
    }
    private void getDataFromIntent() {
        //Model model = (Model) getIntent().getSerializableExtra("name");
        Model model = (Model) getIntent().getSerializableExtra("model");
        mTvName.setText(model.getName());
        mTvAge.setText(model.getAge()+"");
        mTvGrade.setText(model.getGrade());
        mTvPercentage.setText(model.getPercentage());

    }

    private void initViews() {
        mTvAge = findViewById(R.id.tvStudentAge);
        mTvGrade = findViewById(R.id.tvStudentGrade);
        mTvName = findViewById(R.id.tvStudentName);
        mTvPercentage = findViewById(R.id.tvStudentPercentage);
    }


}
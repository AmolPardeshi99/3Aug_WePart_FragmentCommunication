package com.example.a3aug_wepart_fragmentcommunication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StudentDetailsActivity extends AppCompatActivity implements CommunicationListner{

    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        luanchPersonalDetails();
    }

    private void luanchPersonalDetails() {
        FragmentTransaction transaction= fragmentManager.beginTransaction();
        StudentPersonalDetailsFragment fragment = new StudentPersonalDetailsFragment();
        transaction.add(R.id.container,fragment,"personal").commit();

    }

    @Override
    public void launchPerformanceFragment(Bundle bundle) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        StudentPerformanceDetailsFragment performanceDetailsFragment = new StudentPerformanceDetailsFragment();
        performanceDetailsFragment.setArguments(bundle);
        transaction.replace(R.id.container,performanceDetailsFragment,"performanceDetailFragment").addToBackStack("").commit();
    }
}
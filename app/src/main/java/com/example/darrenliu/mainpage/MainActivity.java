package com.example.darrenliu.mainpage;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShareFragment shareFragment = new ShareFragment();
        android.app.FragmentManager fragmentManager_share = getFragmentManager();
        android.app.FragmentTransaction transaction_share = fragmentManager_share.beginTransaction();
        transaction_share.replace(R.id.fl_content,shareFragment);
        transaction_share.commit();
        Button rb_share = (Button) findViewById(R.id.rb_share);
        Button rb_book = (Button) findViewById(R.id.rb_book);
        Button rb_user = (Button) findViewById(R.id.rb_user);
        rb_share.setOnClickListener(this);
        rb_book.setOnClickListener(this);
        rb_user.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rb_share:
                ShareFragment shareFragment = new ShareFragment();
                android.app.FragmentManager fragmentManager_share = getFragmentManager();
                android.app.FragmentTransaction transaction_share = fragmentManager_share.beginTransaction();
                transaction_share.replace(R.id.fl_content,shareFragment);
                transaction_share.commit();
                break;
            case R.id.rb_book:
                BookFragment bookFragment = new BookFragment();
                android.app.FragmentManager fragmentManager_book = getFragmentManager();
                android.app.FragmentTransaction transaction_book = fragmentManager_book.beginTransaction();
                transaction_book.replace(R.id.fl_content,bookFragment);
                transaction_book.commit();
                break;
            case R.id.rb_user:
                PersonFragment personFragment = new PersonFragment();
                android.app.FragmentManager fragmentManager_person = getFragmentManager();
                android.app.FragmentTransaction transaction_person = fragmentManager_person.beginTransaction();
                transaction_person.replace(R.id.fl_content,personFragment);
                transaction_person.commit();
                break;
            default:
                break;
        }
    }
}

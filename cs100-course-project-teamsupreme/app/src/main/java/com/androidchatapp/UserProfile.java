package com.androidchatapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.firebase.client.ChildEventListener;
import com.firebase.client.Firebase;

public class UserProfile extends AppCompatActivity {

    LinearLayout layout;
    Firebase reference1, reference2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);


        Firebase.setAndroidContext(this);
       reference1 = new Firebase("https://fir-messanger-9cbad.firebaseio.com/users/" + UserDetails.username + "_" + UserDetails.password + "_" + UserDetails.firstname + "_" + UserDetails.lastname);

       reference1.child("users").child("username").toString();



    }
}

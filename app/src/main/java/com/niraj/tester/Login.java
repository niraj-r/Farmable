package com.niraj.tester;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        //Intent activityThatCalled = getIntent();

        //String previousActivity = activityThatCalled.getExtras().getString("getCallingActivity");


    }

    public void onEnterUserClick(View view) {

        EditText usersName = (EditText) findViewById(R.id.users_name_edit_text);
        Intent goToMainPageIntent = new Intent(this, MainActivity.class);
        goToMainPageIntent.putExtra("welcome", usersName.getText().toString());
        startActivity(goToMainPageIntent);

    }
}
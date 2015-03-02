package com.example.mikecioffi.test;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainPage extends ActionBarActivity implements View.OnClickListener {


    private EditText Username;
    static Button signUp ;
    static Button login ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(this);

        signUp = (Button) findViewById(R.id.signUp);
        signUp.setOnClickListener(this);



       Username = (EditText) findViewById(R.id.Username);







    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    public void onClick(View v)
    {
        if(v.equals(signUp))
    {
        Intent intent2 = new Intent(MainPage.this,SignUp.class);
        startActivity(intent2);
    }
        else if(v.equals(login))
        {
            Intent intent1 = new Intent(MainPage.this, SecondPage.class);
            startActivity(intent1);

        }

    }
    }


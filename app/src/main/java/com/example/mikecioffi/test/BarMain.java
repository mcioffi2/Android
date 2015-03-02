package com.example.mikecioffi.test;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class BarMain extends ActionBarActivity implements View.OnClickListener {


        static Button back;
        static Button request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_main);

        back = (Button) findViewById(R.id.back);
        back.setOnClickListener(this);

        request = (Button) findViewById(R.id.request);
        request.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bar_main, menu);
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

    @Override
    public void onClick(View v) {
        if(v.equals(back))
        {
            Intent intent2 = new Intent(BarMain.this,SecondPage.class);
            startActivity(intent2);
        }
        else if(v.equals(request))
        {
            Intent intent1 = new Intent(BarMain.this,Food_and_Drink.class);
            startActivity(intent1);
        }
    }
}

package com.example.hippo;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.hippo.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView = null;
    EditText editText = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);      //layout, von studio kreiert

       SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
       ViewPager viewPager = findViewById(R.id.view_pager);
       viewPager.setAdapter(sectionsPagerAdapter);
       TabLayout tabs = findViewById(R.id.tabs);
       tabs.setupWithViewPager(viewPager);
       FloatingActionButton fab = findViewById(R.id.fab);

       fab.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                       .setAction("Action", null).show();
           }
       });

        button = (Button)findViewById(R.id.button_zitat);
        textView = (TextView) findViewById(R.id.text_view_welcome);
        editText = (EditText) findViewById(R.id.text_edit_name);
        //final String name = editText.getText().toString(); //Problem mit dem String, Exception: null pointer
        //https://stackoverflow.com/questions/23353173/unfortunately-myapp-has-stopped-how-can-i-solve-this
        if(button!=null){
            button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String name = editText.getText().toString();
                textView.setText("Hello " + name + "\nWelcome to Hippo");
            }
            });
        }

    }
}
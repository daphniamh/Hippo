package com.example.hippo;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.hippo.ui.main.SectionsPagerAdapter;


public class ZitatActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    EditText editText;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_zitat); //mein Layout befindet sich in diesem Layout (View
      button = (Button) findViewById(R.id.button_zitat);
      textView = (TextView) findViewById(R.id.text_view_welcome);
      editText = (EditText) findViewById(R.id.text_edit_name);
      final String name = editText.getText().toString();
      if (button != null) {
          button.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  final String name = editText.getText().toString();
                  textView.setText("Hello " + name + "\nWelcome to Hippo");
              }
          });
      }}
    }


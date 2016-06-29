package com.kabilansenapathy.basiclistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] SampleArray ={
                "a",
                "b",
                "c"
        };

        List<String> listString = new ArrayList<String>(Arrays.asList(SampleArray)); //Get to know the differences between ArrayList and List

    }
}

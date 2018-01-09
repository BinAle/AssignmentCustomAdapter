package com.example.binali.assignmentcustomadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    String name[] = {"name1", "name2", "name3", "name4", "name5", "name6", "name7", "name8", "name9", "name10" };
    //String phone[]={"phone1","phone2","phone3","phone4","phone5","phone6","phone7","phone8","phone9","phone10"};
    ListView listView = (ListView) findViewById(R.id.list1);
    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, name);
    listView.setAdapter


}

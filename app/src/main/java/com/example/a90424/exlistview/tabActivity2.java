package com.example.a90424.exlistview;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class tabActivity2 extends ListActivity {

    TextView text;

    String [] data = {
            "list1", "list2", "list3", "list4", "list5", "list6", "list7", "list8"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab2);

        text = (TextView) findViewById(R.id.textView2);

/*
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, data
        );

          */
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(
                this, R.layout.item, R.id.textView4, data
        );

        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        text.setText("Selected Item:" + data[position]);

        Toast t = Toast.makeText(this, "Selected Item:" + data[position], Toast.LENGTH_SHORT);
        t.show();

    }
}

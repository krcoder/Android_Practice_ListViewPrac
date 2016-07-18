package com.example.a90424.exlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class tabActivity1 extends AppCompatActivity {
    TextView text;
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab1);

        text = (TextView)findViewById(R.id.textView);
        list = (ListView) findViewById(R.id.listView);

        //MyAdapter (BaseAdapter class 상속받은 )
        MyAdapter adapter = new MyAdapter();
        list.setAdapter(adapter);
       // list.setAdapter(...);
    }

    class MyAdapter extends BaseAdapter{
        String [] names = {"축구", "야구", "테니스", "탁구"};
        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public Object getItem(int i) {
            return names[i];
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            TextView itemview = new TextView(getApplicationContext());
            itemview.setText(  names[i]);

            return itemview;
        }
    }


}

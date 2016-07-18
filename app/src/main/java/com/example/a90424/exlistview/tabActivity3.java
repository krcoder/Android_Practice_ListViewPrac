package com.example.a90424.exlistview;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class tabActivity3 extends ListActivity {

    String [] item = {
            "list1", "list2", "list3", "list4", "list5", "list6", "list7", "list8"
    };

    String [] subItem = {
            "data1", "data2", "data3", "data4", "data5", "data6", "data7", "data8"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab3);


        ArrayList  <  HashMap<String, String>   > list =
                new ArrayList<   HashMap<String, String> >();

        for(int i = 0 ; i < item.length; i++)
        {
            HashMap <String, String> map = new HashMap<String, String>();
            map.put("str1", item[i]);
            map.put("str2", subItem[i]);
            list.add(map);
        }

        String [] key = {"str1", "str2"};
        int [] id = {android.R.id.text1, android.R.id.text2};

        SimpleAdapter adapter = new SimpleAdapter(
                this, list, android.R.layout.simple_expandable_list_item_2, key, id
        );
        setListAdapter(adapter);
        // setListAdapter(adapter)...

    }
}

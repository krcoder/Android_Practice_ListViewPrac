package com.example.a90424.exlistview;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {
    TabHost tabhost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabhost = (TabHost) findViewById(android.R.id.tabhost);
        TabHost.TabSpec tab1 = tabhost.newTabSpec("First");
        TabHost.TabSpec tab2 = tabhost.newTabSpec("Second");
        TabHost.TabSpec tab3 = tabhost.newTabSpec("Third");

        tab1.setIndicator("Tab 1");
        tab1.setContent(new Intent(this, tabActivity1.class));

        tab2.setIndicator("Tab 2");
        tab2.setContent(new Intent(this, tabActivity2.class));

        tab3.setIndicator("Tab 3");
        tab3.setContent(new Intent(this, tabActivity3.class));

        tabhost.addTab(tab1);
        tabhost.addTab(tab2);
        tabhost.addTab(tab3);
        tabhost.setCurrentTab(0);

    }
}

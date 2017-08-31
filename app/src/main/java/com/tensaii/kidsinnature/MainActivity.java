package com.tensaii.kidsinnature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/*test git*/
public class MainActivity extends AppCompatActivity {

    ListView list;
    String[] animal = {
            "Björn",
            "Katt",
            "Groda",
            "Hund",
            "Älg",
            "Orm",
            "Skata",
            "Marsvin"
    };
    Integer[] imageId = {
            R.drawable.img_splash,
            R.drawable.symbol_camera,
            R.drawable.symbol_crown_active,
            R.drawable.symbol_help,
            R.drawable.symbol_home,
            R.drawable.symbol_plus,
            R.drawable.symbol_score,
            R.drawable.symbol_settings_active

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                        | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        AnimalList adapter = new
                AnimalList(MainActivity.this, animal, imageId);
        list = (ListView) findViewById(R.id.animalList);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " + animal[+position], Toast.LENGTH_SHORT).show();

            }
        });

    }

}
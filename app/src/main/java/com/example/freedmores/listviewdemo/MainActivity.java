package com.example.freedmores.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Array of strings...
    ListView simpleList;
    String  Item[] = {"Apple", "Banana", "Lemon", "Cherry", "Strawberry", "Avocado"};
    String  SubItem[] = {"The apple tree is a deciduous tree in the rose family best known for its sweet, pomaceous fruit, the apple.",
            "The banana is an edible fruit – botanically a berry – produced by several kinds of large herbaceous flowering plants in the genus Musa.",
            "The lemon, Citrus limon Osbeck, is a species of small evergreen tree in the flowering plant family Rutaceae, native to Asia.",
            "A cherry is the fruit of many plants of the genus Prunus, and is a fleshy drupe.",
            "The garden strawberry is a widely grown hybrid species of the genus Fragaria, collectively known as the strawberries.",
            "The avocado is a tree, long thought to have originated in South Central Mexico, classified as a member of the flowering plant family Lauraceae."};
    int fruit_images[] = {R.drawable.apple, R.drawable.bananas, R.drawable.lemon, R.drawable.cherries,R.drawable.strawberries, R.drawable.avocado};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleList = (ListView)findViewById(R.id.ListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), Item,SubItem, fruit_images);
        simpleList.setAdapter(customAdapter);

        // When the user clicks on the ListItem
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                //Object o = simpleList.getItemAtPosition(position);
               // Country country = (Country) o;
                Toast.makeText(MainActivity.this, "Selected Item :" + position, Toast.LENGTH_LONG).show();
            }
        });
    }
}

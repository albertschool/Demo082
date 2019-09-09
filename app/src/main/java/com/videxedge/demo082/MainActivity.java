package com.videxedge.demo082;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
/**
 * Demo project for ListView
 *
 * @author      Albert Levy <albert.school2015@gmail.com>
 * @version     1.0 (Vasic demo)
 * @since       9/9/2019
 */
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    TextView tV;
    ListView lV;
    String [] town={"Tel-Aviv","Haife","Jerusalem","Beer-Sheva"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/**
 * Init parameters
 */
        tV = (TextView) findViewById(R.id.tV);
        lV = (ListView) findViewById(R.id.lV);

        lV.setOnItemClickListener(this);
        lV.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        ArrayAdapter<String> adp = new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item,town);
        lV.setAdapter(adp);
    }
/**
 * onItemClick method: Display on the TextView the position in the adapter &
 * the row id of the data that was pressed
 */
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int pos, long rowid) {
        tV.setText(""+pos+" "+rowid);
    }
}

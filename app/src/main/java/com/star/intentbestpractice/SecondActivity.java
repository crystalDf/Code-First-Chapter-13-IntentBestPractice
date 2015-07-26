package com.star.intentbestpractice;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;


public class SecondActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        SerializablePerson serializablePerson = (SerializablePerson)
                getIntent().getSerializableExtra("serializable_person_data");
        ParcelablePerson parcelablePerson =
                getIntent().getParcelableExtra("parcelable_person_data");

        TextView textView1 = (TextView) findViewById(R.id.serializablePerson);
        textView1.setText("Name: " + serializablePerson.getName() +
                " Age: " + serializablePerson.getAge());

        TextView textView2 = (TextView) findViewById(R.id.parcelablePerson);
        textView2.setText("Name: " + parcelablePerson.getName() +
                " Age: " + parcelablePerson.getAge());

    }


}

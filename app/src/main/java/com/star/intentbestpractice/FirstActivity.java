package com.star.intentbestpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class FirstActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        SerializablePerson serializablePerson = new SerializablePerson();

        serializablePerson.setName("Tom");
        serializablePerson.setAge(20);

        ParcelablePerson parcelablePerson = new ParcelablePerson();

        parcelablePerson.setName("Alice");
        parcelablePerson.setAge(16);

        Intent intent = new Intent(this, SecondActivity.class);

        intent.putExtra("serializable_person_data", serializablePerson);
        intent.putExtra("parcelable_person_data", parcelablePerson);

        startActivity(intent);
    }


}

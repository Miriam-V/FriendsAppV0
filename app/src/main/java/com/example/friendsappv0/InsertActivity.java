package com.example.friendsappv0;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class InsertActivity extends AppCompatActivity {

    // Reference to the DatabaseManager
    private DatabaseManager dbManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dbManager = new DatabaseManager(this); // reference to dbManager?
        setContentView(R.layout.activity_insert); // Wired this activity with activity_insert
    }



    public void insert(View view) {
        // Retrieve first name, last name, and email.

        Log.w("InsertActivity", "Insert Button Pushed");

        EditText firstNameET = findViewById(R.id.input_first_name);
        EditText lastNameET = findViewById(R.id.input_last_name);
        EditText emailET = findViewById(R.id.input_email);
        String firstName = firstNameET.getText().toString();
        String lastName = lastNameET.getText().toString();
        String email = emailET.getText().toString();

        // Insert into Database
        Friends friends = new Friends(0, firstName, lastName, email);
        dbManager.insert(friends); // call insert method
        Toast.makeText(this, "Friend Added", Toast.LENGTH_SHORT).show(); // Alerts user that a task was added?

        // Clear Data
        firstNameET.setText("");
        lastNameET.setText("");
        emailET.setText("");

    }


    public void goBack(View view) {
        this.finish();
    }
}

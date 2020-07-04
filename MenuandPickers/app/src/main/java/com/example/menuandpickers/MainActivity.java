package com.example.menuandpickers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.share:
                Toast.makeText(this,item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.Dail:
                Toast.makeText(this,item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.setting:
                Toast.makeText(this,item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.Gallery:
                Toast.makeText(this,item.getTitle(), Toast.LENGTH_SHORT).show();
                break;


        }
        return super.onOptionsItemSelected(item);
    }

    public void Alert(View view) {
        AlertDialog.Builder dial = new AlertDialog.Builder(MainActivity.this);
        dial.setTitle("Alert Dial");
        dial.setMessage("u wanna exit?");
        dial.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        dial.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        dial.setCancelable(false);
        dial.show();
    }

    public void Date(View view) {
    }

    public void Time(View view) {
    }
}
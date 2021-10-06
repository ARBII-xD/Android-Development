package com.example.menututorial;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements MenuItem.OnMenuItemClickListener, PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView =findViewById(R.id.text_view);
        registerForContextMenu(textView);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.setHeaderTitle("Choose your option");

        getMenuInflater().inflate(R.menu.example_contextmenu,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {


        switch(item.getItemId())
        { case R.id.contextitem1:
                Toast.makeText(this,"option 1 is selected",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.contextitem2:
                Toast.makeText(this,"option 2 is selected",Toast.LENGTH_SHORT).show();
                return true;

            default:
        return super.onContextItemSelected(item);}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.example_menu,menu);

        return true;
                   }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        { case R.id.item1:
            Toast.makeText(this,"This is Item 1 ",Toast.LENGTH_SHORT).show();
            return true;

            case R.id.item2:
                Toast.makeText(this,"This is Item 2 ",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(this,"This is Item 3 ",Toast.LENGTH_SHORT).show();
                return true;

        default:
        return super.onOptionsItemSelected(item);}
    }

    public void showPopup(View view) {
        PopupMenu popupMenu=new PopupMenu(this,view);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.example_popup);
        popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.popupitem1:
                Toast.makeText(this,"This is item 1 ",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.popupitem2:
                Toast.makeText(this,"This is item 2 ",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.popupitem3:
                Toast.makeText(this,"This is item 3 ",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.popupitem4:
                Toast.makeText(this,"This is item 4 ",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.popupitem5:
                Toast.makeText(this,"This is item 5 ",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.popupitem6:
                Toast.makeText(this,"This is item 6 ",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }


}
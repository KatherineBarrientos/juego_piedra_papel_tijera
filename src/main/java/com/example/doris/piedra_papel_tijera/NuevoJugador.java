package com.example.doris.piedra_papel_tijera;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class NuevoJugador extends AppCompatActivity {

EditText NombreJugador;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_jugador);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_nuevo_jugador, menu);
        return true;
    }

    public void Click(View view) {
        String NombreJigador;
        String nombre;
        String nuevo = "nuevo";

        Intent data = new Intent();
        EditText miEditText = (EditText) findViewById(R.id.editText);
        String textoIntroducido = miEditText.getText().toString();

        setResult(RESULT_OK, data);
        this.finish();
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

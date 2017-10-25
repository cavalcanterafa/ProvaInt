/*
	@Author: Rafael Pedroso Cavalcante
	RA: 201411358
*/

package com.devpass.provaint;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class ResultadoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Intent intent = getIntent();
        String texto = intent.getStringExtra(MainActivity.NUMERO);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(texto);

        ViewGroup layout = findViewById(R.id.txt_numero);
        layout.addView(textView);
    }
}





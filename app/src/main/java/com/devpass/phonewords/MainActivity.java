/*
	@Author: Rafael Pedroso Cavalcante
	RA: 201411358
*/
package com.devpass.provaint;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    public static final String NUMERO = "com.devpass.provaint.numero";
    private EditText etNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumero = (EditText) findViewById(R.id.etNumero);

    }

    public String converter(EditText num){
        num.getText().toString().replace('A', '2');
        num.getText().toString().replace('B', '2');
        num.getText().toString().replace('C', '2');
        num.getText().toString().replace('D', '3');
        num.getText().toString().replace('E', '3');
        num.getText().toString().replace('F', '3');
        num.getText().toString().replace("G", "4");
        num.getText().toString().replace('H', '4');
        num.getText().toString().replace('I', '4');
        num.getText().toString().replace('J', '5');
        num.getText().toString().replace('K', '5');
        num.getText().toString().replace('L', '5');
        num.getText().toString().replace('M', '6');
        num.getText().toString().replace('N', '6');
        num.getText().toString().replace('O', '6');
        num.getText().toString().replace('P', '7');
        num.getText().toString().replace('Q', '7');
        num.getText().toString().replace('R', '7');
        num.getText().toString().replace('S', '7');
        num.getText().toString().replace('T', '8');
        num.getText().toString().replace('U', '8');
        num.getText().toString().replace('V', '8');
        num.getText().toString().replace('W', '9');
        num.getText().toString().replace('X', '9');
        num.getText().toString().replace('Y', '9');
        num.getText().toString().replace('Z', '9');
        return num.toString();
    }

    public void ligar(View view){
        
        String cv = converter((EditText) etNumero.getText());
        Intent intent = new Intent(this, ResultadoActivity.class);
        intent.putExtra(NUMERO, cv);
        startActivity(intent);
    }
}

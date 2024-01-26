package devandroid.estefania.applista.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.estefania.applista.R;
import devandroid.estefania.applista.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    SharedPreferences preferences;
    public static final String NOME_PREFERENCES = "pref listavip";

    Pessoa pessoa;
    Pessoa outrapessoa;


    EditText editPrimeiroNome;
    EditText editSobrenome;
    EditText editCursoDesejado;
    EditText editTelefoneContato;

    Button buttonLimpar;
    Button buttonSalvar;
    Button buttonFinalizar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = getSharedPreferences(NOME_PREFERENCES,0);
        SharedPreferences.Editor listaVip = preferences.edit();

        pessoa = new Pessoa();

        outrapessoa = new Pessoa();
        outrapessoa.setPrimeiroNome("Mayelle");
        outrapessoa.setSobreNome("Silva");
        outrapessoa.setCursoDesejado("Culinária");
        outrapessoa.setTelefoneContato("85 985450954");

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobrenome = findViewById(R.id.editSobrenome);
        editCursoDesejado = findViewById(R.id.editCursoDesejado);
        editTelefoneContato = findViewById(R.id.editTelefoneContato);

        buttonSalvar = findViewById(R.id.buttonSalvar);
        buttonLimpar = findViewById(R.id.buttonLimpar);
        buttonFinalizar = findViewById(R.id.buttonFinalizar);

        editPrimeiroNome.setText(outrapessoa.getPrimeiroNome());
        editSobrenome.setText(outrapessoa.getSobreNome());
        editCursoDesejado.setText(outrapessoa.getCursoDesejado());
        editTelefoneContato.setText(outrapessoa.getTelefoneContato());

        buttonLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editPrimeiroNome.setText("");
                editSobrenome.setText("");
                editCursoDesejado.setText("");
                editTelefoneContato.setText("");
            }
        });

        buttonFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Volte Sempre", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        buttonSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
                pessoa.setSobreNome(editSobrenome.getText().toString());
                pessoa.setCursoDesejado(editCursoDesejado.getText().toString());
                pessoa.setTelefoneContato(editTelefoneContato.getText().toString());

                Toast.makeText(MainActivity.this, "Salvo" + pessoa.toString(), Toast.LENGTH_LONG).show();

                listaVip.putString("Primeiro nome", pessoa.getPrimeiroNome());
                listaVip.putString("Sobrenome", pessoa.getSobreNome());
                listaVip.putString("Curso Desejado", pessoa.getCursoDesejado());
                listaVip.putString("Telefone", pessoa.getTelefoneContato());
                listaVip.apply();
            }
        });

    }
}
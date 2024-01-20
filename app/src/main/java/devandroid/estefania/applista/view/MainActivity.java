package devandroid.estefania.applista.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.estefania.applista.R;
import devandroid.estefania.applista.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
    }
}
package devandroid.estefania.applista.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.estefania.applista.R;
import devandroid.estefania.applista.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outrapessoa;

    String dadosPessoa;
    String dadosOutraPessoa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        pessoa.setPrimeiroNome("Estefânia");
        pessoa.setSobreNome("Pinheiro");
        pessoa.setCursoDesejado("Ciência da Computação");
        pessoa.setTelefoneContato("85 981986456");

        outrapessoa = new Pessoa();
        outrapessoa.setPrimeiroNome("Mayelle");
        outrapessoa.setSobreNome("Silva");
        outrapessoa.setCursoDesejado("Culinária");
        outrapessoa.setTelefoneContato("85 985450954");

        dadosPessoa = "Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += " Curso Desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += " Telefone de Contato: ";
        dadosPessoa += pessoa.getTelefoneContato();

        dadosOutraPessoa = "Primeiro nome: ";
        dadosOutraPessoa += pessoa.getPrimeiroNome();
        dadosOutraPessoa += " Sobrenome: ";
        dadosOutraPessoa += pessoa.getSobreNome();
        dadosOutraPessoa += " Curso Desejado: ";
        dadosOutraPessoa += pessoa.getCursoDesejado();
        dadosOutraPessoa += " Telefone de Contato: ";
        dadosOutraPessoa += pessoa.getTelefoneContato();

    }
}
package devandroid.estefania.applista.controller;


import android.content.SharedPreferences;
import android.util.Log;

import devandroid.estefania.applista.model.Pessoa;
import devandroid.estefania.applista.view.MainActivity;

public class PessoaController {

    SharedPreferences preferences;
    SharedPreferences.Editor listaVip;
    public static final String NOME_PREFERENCES = "pref_listavip";

    public PessoaController(MainActivity mainActivity) {
        preferences =
                mainActivity.getSharedPreferences(NOME_PREFERENCES, 0);
        listaVip = preferences.edit();

    }

    public Pessoa buscar(Pessoa pessoa) {

        pessoa.setPrimeiroNome(preferences.getString("primeiroNome", "NA"));
        pessoa.setSobreNome(preferences.getString("sobreNome", "NA"));
        pessoa.setCursoDesejado(preferences.getString("cursoDesejado", "NA"));
        pessoa.setTelefoneContato(preferences.getString("telefoneContato", "NA"));

        return pessoa;
    }

    public void limpar() {
        listaVip.clear();
        listaVip.apply();

    }

    public void salvar(Pessoa pessoa) {
        Log.i("MVC Controller", "Salvo" + pessoa);
        listaVip.putString("primeiroNome", pessoa.getPrimeiroNome());
        listaVip.putString("sobreNome", pessoa.getSobreNome());
        listaVip.putString("nomeCurso", pessoa.getCursoDesejado());
        listaVip.putString("telefone", pessoa.getTelefoneContato());
        listaVip.apply();

    }

}


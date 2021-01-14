package alura.com.br.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // agora com o activity criado na pasta layout

        List<String> alunos = new ArrayList<>(
                Arrays.asList("Danilo", "Alex", "Goku", "Gohan", "Mendigo Voador", "Donald Trunph", "Bolsonaro", "Lacraia", "Zé", "Tio Patinhas"));

        ListView listaDeAlunos = findViewById(R.id.activity_main_lista_de_alunos);
        listaDeAlunos.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alunos));

        /*  o componente "ListView" implenta a lista de alunos no Layout
            o método "findViewById" serve para buscar o elemento por um critério, no caso aqui o ID
            apartir da classe "ArrayAdapter" eu posso enviar um contexto (lista alunos) no para o layout ja predefinido do framework android (simple_list_item_1)
         */

    }
}

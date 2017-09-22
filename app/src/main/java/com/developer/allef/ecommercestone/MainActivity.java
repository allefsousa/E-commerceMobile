package com.developer.allef.ecommercestone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.developer.allef.ecommercestone.Model.produtosModel;
import com.developer.allef.ecommercestone.remote.EndPoint;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {




    @BindView(R.id.lv)
            ListView list;
    String TAG = "Allef";

    ArrayAdapter<String> adapter;
    ArrayList<String>nomeProduto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        nomeProduto = new ArrayList<>(); // Intanciando o novo arrayList
        // Este adapter é Padão do android para customizalo voce tera que estendelo e criar uma view.Honder para montar da forma que quer
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,nomeProduto);



        // Interface que contem as Rotas da API
        lojaServices api = EndPoint.getApiService();
        // chamada do retrofit para busca dos produtos
        Call<List<produtosModel>> produtos = api.listaProdutos();


        /**
         * chamada de callback para fazer a requisição na Api
         */
        produtos.enqueue(new Callback<List<produtosModel>>() {
            @Override

            public void onResponse(Call<List<produtosModel>> call, Response<List<produtosModel>> response) {
                if(response.isSuccessful()){
                    for(produtosModel produtosJson : response.body()){
                        nomeProduto.add(produtosJson.getTitulo());
                        /**
                         *
                        NomePorduto nada mais é que uma lista de String para mostrar o dados
                         no ListView Padrão
                        nomeProduto.add(produtosJson.getCep());
                        nomeProduto.add(produtosJson.getData());
                        nomeProduto.add(produtosJson.getLoja());
                        nomeProduto.add(produtosJson.getUrlFoto());
                        nomeProduto.add(String.valueOf(produtosJson.getValor()));

                         */
                    }
                    /**
                     * Passando o Adapter para a lista
                     */
                    list.setAdapter(adapter);

                }
            }

            @Override
            public void onFailure(Call<List<produtosModel>> call, Throwable t) {

            }
        });






    }
}

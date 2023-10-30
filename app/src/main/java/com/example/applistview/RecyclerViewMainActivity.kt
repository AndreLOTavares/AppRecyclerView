package com.example.applistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewMainActivity : AppCompatActivity() {

    private lateinit var rvLista: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_main)

        val lista = listOf(
            Mensagem("André","Tudo bem com você? ", "08:30"),
            Mensagem("Samara","Olá boa tarde! ", "11:30"),
            Mensagem("Pedro","Qual o valor do carro? ", "07:10"),
            Mensagem("João","O valor do carro é 80 mil ", "07:15"),
            Mensagem("Patricia","Como foi a consulta no médico? ", "08:33"),
            Mensagem("Maria","Foi uma consulta de rotina, está tudo bem,obrigada! ", "08:35"),
            Mensagem("Beatriz","Foi um prazer conhecer você! ", "12:00"),
            Mensagem("Juninho","Irmão o almoço para amanhã está confirmado? ", "20:30"),
            Mensagem("Henrique","Claro que sim irmão, aguardo você amanhã. ", "20:35"),
            Mensagem("Maria","O aluno precisa melhorar a dedicação, notas baixas ", "13:30")

        )

        rvLista = findViewById(R.id.rv_lista)

        //rvLista.adapter = MensagemAdapter(lista)

        rvLista.layoutManager = LinearLayoutManager(this)

    }
}
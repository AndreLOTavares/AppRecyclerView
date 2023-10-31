package com.example.applistview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MensagemAdapter(
    private val lista: List<Mensagem>
): RecyclerView.Adapter<MensagemAdapter.MensagemViewHolder>() {

    inner class MensagemViewHolder(
        val itemView: View
    ): ViewHolder(itemView){

        val textNome: TextView = itemView.findViewById(R.id.text_nome)
        val textUltima: TextView = itemView.findViewById(R.id.text_ultima)
        val textHorario: TextView = itemView.findViewById(R.id.text_horario)

    }

    //Ao criar View Holder -> Vai criar a visualização
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MensagemViewHolder {

        val layoutInflater = LayoutInflater.from(
            parent.context
        )

        val itemView = layoutInflater.inflate(
            R.layout.item_lista,
            parent,
            false
        )

        return MensagemViewHolder(itemView)

    }//Fim override fun onCreateViewHolder


    //getItemCount -> Recuperar a quantidade de itens
    override fun getItemCount(): Int {
        return lista.size
    }

    //Ao vincular o view holder
    override fun onBindViewHolder(mensagemViewholder: MensagemViewHolder, position: Int) {

        val mensagem = lista[position]
        mensagemViewholder.textNome.text = mensagem.nome
        mensagemViewholder.textUltima.text = mensagem.ultima
        mensagemViewholder.textHorario.text = mensagem.horario

    }

}
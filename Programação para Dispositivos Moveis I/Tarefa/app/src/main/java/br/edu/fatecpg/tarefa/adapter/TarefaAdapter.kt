package br.edu.fatecpg.tarefa.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.tarefa.R
import br.edu.fatecpg.tarefa.dao.Tarefa

class TarefaAdapter(
    private val tarefas: MutableList<Tarefa>
) : RecyclerView.Adapter<TarefaAdapter.TarefaViewHolder>() {

    inner class TarefaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nome = itemView.findViewById<TextView>(R.id.tvNome)
        val descricao = itemView.findViewById<TextView>(R.id.tvDescricao)
        val btnConcluir = itemView.findViewById<Button>(R.id.btnConcluir)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_tarefa, parent, false)
        return TarefaViewHolder(view)
    }

    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {
        val tarefa = tarefas[position]

        holder.nome.text = tarefa.nome
        holder.descricao.text = tarefa.descricao
        holder.btnConcluir.text = "Concluir"

        holder.btnConcluir.setOnClickListener {
            tarefas.removeAt(position)
            notifyItemRemoved(position)
            
            Toast.makeText(holder.itemView.context, "Tarefa '${tarefa.nome}' concluída!", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return tarefas.size
    }

    fun adicionarTarefa(tarefa: Tarefa) {
        tarefas.add(tarefa)
        notifyItemInserted(tarefas.size - 1)
    }
}

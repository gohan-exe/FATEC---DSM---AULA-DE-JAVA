package br.edu.fatecpg.cinema.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.cinema.models.Cinema
import br.edu.fatecpg.cinema.R

class CinemaAdapter(private val filmes: List<Cinema>):
        RecyclerView.Adapter<CinemaAdapter.ViewHolder>() {

      class ViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
          val txvFilme:TextView = itemView.findViewById(R.id.txv_filme)
          val txvAutor:TextView = itemView.findViewById(R.id.txv_autor)
      }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CinemaAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_filme,parent,false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: CinemaAdapter.ViewHolder, position: Int) {
        val filmes = filmes[position]
        holder.txvFilme.text = filmes.filme
        holder.txvAutor.text = filmes.autor
    }

    override fun getItemCount(): Int {
        return filmes.size
    }
}
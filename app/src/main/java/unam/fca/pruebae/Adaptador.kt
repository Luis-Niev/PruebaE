package unam.fca.pruebae

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class Adaptador (private val context: Context,
                 private val categorias: MutableList<Categoria>):
                 RecyclerView.Adapter<Adaptador.ViewHolder>() {
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adaptador.ViewHolder {
        val vista = LayoutInflater.from(context)
            .inflate(R.layout.categorias, parent, false)
        return ViewHolder(vista)
    }

    override fun getItemCount(): Int {
        return categorias.size
    }

    override fun onBindViewHolder(holder: Adaptador.ViewHolder, position: Int) {
        val categoria: Categoria = categorias[position]
        holder.tvNombre.text = categoria.nombre

    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvNombre: TextView
        init {
            tvNombre = itemView.findViewById(R.id.nmbre)
        }

    }
}
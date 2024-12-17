package com.example.app_MiViaje


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ConductorAdapter(private val conductores: List<Conductor>) :
    RecyclerView.Adapter<ConductorAdapter.ConductorViewHolder>() {

    class ConductorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nombre: TextView = itemView.findViewById(R.id.conductorNombre)
        val foto: ImageView = itemView.findViewById(R.id.conductorFoto)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConductorViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_conductor, parent, false)
        return ConductorViewHolder(view)
    }

    override fun onBindViewHolder(holder: ConductorViewHolder, position: Int) {
        val conductor = conductores[position]
        holder.nombre.text = conductor.nombre
        holder.foto.setImageResource(conductor.foto)
    }

    override fun getItemCount(): Int = conductores.size
}

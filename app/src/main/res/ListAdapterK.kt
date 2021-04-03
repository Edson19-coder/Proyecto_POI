package com.example.pantallas_avance

import android.content.Context
import android.graphics.Color
import android.graphics.PorterDuff
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(
    itemList: List<ListaDeMensajes>,
    context: Context
) :
    RecyclerView.Adapter<ListaAdapter.ViewHolder>() {
    private var mData: List<ListaDeMensajes>
    private val mInflater: LayoutInflater
    private val context: Context
    override fun getItemCount(): Int {
        return mData.size
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListaAdapter.ViewHolder {
        val view = mInflater.inflate(R.layout.mensaje_elemento, null)
        return ListaAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ListaAdapter.ViewHolder,
        position: Int
    ) {
        holder.bindData(mData[position])
    }

    fun setItems(items: List<ListaDeMensajes>) {
        mData = items
    }

    open inner class ViewHolder internal constructor(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var messageImage: ImageView
        var nombre: TextView
        var mensaje: TextView
        var fecha: TextView
        fun bindData(item: ListaDeMensajes) {
            messageImage.setColorFilter(
                Color.parseColor(item.getColor()),
                PorterDuff.Mode.SRC_IN
            )
            nombre.text = item.getNombre()
            mensaje.text = item.getMensaje()
            fecha.text = item.getFecha()
        }

        init {
            messageImage = itemView.findViewById(R.id.messageImageView)
            nombre = itemView.findViewById(R.id.nombreTextView)
            mensaje = itemView.findViewById(R.id.mensajeTextView)
            fecha = itemView.findViewById(R.id.fechaTextView)
        }
    }

    init {
        mInflater = LayoutInflater.from(context)
        this.context = context
        mData = itemList
    }
}
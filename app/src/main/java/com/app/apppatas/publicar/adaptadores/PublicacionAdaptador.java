package com.app.apppatas.publicar.adaptadores;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.apppatas.R;
import com.app.apppatas.publicar.modelo.Publicacion;

import java.util.List;

public class PublicacionAdaptador extends RecyclerView.Adapter<PublicacionAdaptador.ViewHolderPublicacion> {

    private Context context;
    private List<Publicacion> listPublicacion;

    public PublicacionAdaptador(Context context, List<Publicacion> listPublicacion){
        this.context = context;
        this.listPublicacion = listPublicacion;
    }

    @NonNull
    @Override
    public ViewHolderPublicacion onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_publicacion_recycler,viewGroup,false);
        return new ViewHolderPublicacion(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPublicacion viewHolderPublicacion, int position) {
        viewHolderPublicacion.nombreUsuario.setText(listPublicacion.get(position).getNombreUsuario());
        viewHolderPublicacion.hora.setText(listPublicacion.get(position).getHora());
        viewHolderPublicacion.fecha.setText(listPublicacion.get(position).getFecha());

        viewHolderPublicacion.nombreMascota.setText(listPublicacion.get(position).getNombreMascota());
        viewHolderPublicacion.raza.setText(listPublicacion.get(position).getRaza());
        viewHolderPublicacion.color.setText(listPublicacion.get(position).getColor());
        viewHolderPublicacion.tamano.setText(listPublicacion.get(position).getTamanio());
        viewHolderPublicacion.aditamentos.setText(listPublicacion.get(position).getAditamentos());
        viewHolderPublicacion.donde.setText(listPublicacion.get(position).getDonde());
        viewHolderPublicacion.observaciones.setText(listPublicacion.get(position).getObservaciones());
        viewHolderPublicacion.enfermedades.setText(listPublicacion.get(position).getEnfermedades());
    }

    @Override
    public int getItemCount() {
        return listPublicacion.size();
    }

    public class ViewHolderPublicacion extends RecyclerView.ViewHolder {

        TextView nombreUsuario, fecha, hora;
        TextView nombreMascota, raza, color, tamano,
                 aditamentos, donde, observaciones, enfermedades;

        ImageView imgUser, imgMascota;

        public ViewHolderPublicacion(@NonNull View itemView) {
            super(itemView);

            nombreUsuario = itemView.findViewById(R.id.txtNombreUsurio);
            fecha = itemView.findViewById(R.id.txtFecha);
            hora =itemView.findViewById(R.id.txtHora);

            nombreMascota = itemView.findViewById(R.id.txtNombreMascota);
            raza = itemView.findViewById(R.id.txtRaza);
            color = itemView.findViewById(R.id.txtColor);
            tamano = itemView.findViewById(R.id.txtTamanio);
            aditamentos = itemView.findViewById(R.id.txtAditamentos);
            donde = itemView.findViewById(R.id.txtDonde);
            observaciones = itemView.findViewById(R.id.txtObservaciones);
            enfermedades = itemView.findViewById(R.id.txtEnfermedades);

            imgUser = itemView.findViewById(R.id.imgUsuario);
            imgMascota = itemView.findViewById(R.id.imgMascota);
        }
    }
}

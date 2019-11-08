package com.ejemplo.customlistviewadapter.adapters;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ejemplo.customlistviewadapter.R;
import com.ejemplo.customlistviewadapter.activities.MainActivity;
import com.ejemplo.customlistviewadapter.datamodel.Hero;

import java.util.ArrayList;

/**
 * Adaptador personalizado para construir items de lista que incluyan 3 widgets:
 * 1. ImageView con la foto del héroe
 * 2. TextView con el nombre de cada héroe
 * 3. TextView con el nombre de cada superhéroe
 */
public class CustomAdapter extends BaseAdapter {
    private ArrayList<Hero> heroes;
    private Activity activity;
    public CustomAdapter(MainActivity activity, ArrayList<Hero> alumnos){
        this.heroes = alumnos;
        this.activity = activity;
    }

    /**
     * Devuelve el número de heroes
     * @return
     */
    @Override
    public int getCount() {
        return this.heroes.size();
    }

    /**
     * Devuelve el alumno en la posición indicada dentro del ArrayList de heroes
     * @param position Entero con la posición seleccionada
     * @return Devuelve dentro de Object el objeto de la clase Alumno seleccionado
     */
    @Override
    public Object getItem(int position) {
        return heroes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null)
            convertView = activity.getLayoutInflater().inflate(R.layout.item_list_layout,null);

        TextView tvNombre = convertView.findViewById(R.id.tvNombre);
        TextView tvEdad = convertView.findViewById(R.id.tvEdad);
        ImageView ivFoto = convertView.findViewById(R.id.ivFoto);
        tvNombre.setText(heroes.get(position).getNombre());
        tvEdad.setText(String.valueOf(heroes.get(position).getEdad()));
        ivFoto.setImageDrawable(heroes.get(position).getFoto());
        return convertView;
    }
}

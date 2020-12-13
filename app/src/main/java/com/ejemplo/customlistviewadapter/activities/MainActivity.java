package com.ejemplo.customlistviewadapter.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.ejemplo.customlistviewadapter.R;
import com.ejemplo.customlistviewadapter.adapters.CustomAdapter;
import com.ejemplo.customlistviewadapter.datamodel.Hero;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Actividad principal de la aplicación, carga la interfaz principal que la forma un listview
 * personalizado. Esta aplicación muestra una lista de héroes con sus principales características.
 * Por cada elemento de la lista, héroe, se podra consultar su nombre, foto, edad y los poderes
 * que tiene.
 * @author Rafa
 * @version 1.0.1
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //se construye un array de poderes, todos los héroes tienen los mismos poderes
        ArrayList<String> poderes = new ArrayList<String>();
        poderes.add("Vuela");
        poderes.add("Rayos láser");

        //se construyen los objetos del modelo de datos
        ArrayList<Hero>  heroes = new ArrayList<Hero>();
        heroes.add(new Hero("Adrian",26,getDrawable("adrian.jpg"),poderes));
        heroes.add(new Hero("Miryam",26,getDrawable("miryam.jpg"),poderes));
        heroes.add(new Hero("Laura",26,getDrawable("laura.jpg"),poderes));
        heroes.add(new Hero("Sergio",26,getDrawable("sergio.jpg"),poderes));
        heroes.add(new Hero("Javier",26,getDrawable("javier.jpg"),poderes));
        heroes.add(new Hero("Antonio",26,getDrawable("antonio.jpg"),poderes));
        heroes.add(new Hero("David",26,getDrawable("david.jpg"),poderes));
        heroes.add(new Hero("Rafa",26,getDrawable("rafa.jpg"),poderes));
        heroes.add(new Hero("Pablo",26,getDrawable("pablo.jpg"),poderes));
        heroes.add(new Hero("Victor",26,getDrawable("victor.jpg"),poderes));
        //se construye el adaptador
        CustomAdapter adapter = new CustomAdapter(this,heroes);
        //se obtiene la referencia al listview
        ListView lvAlumnos = findViewById(R.id.lvAlumnos);
        //se establece el modo de selección simple al listview
        lvAlumnos.setChoiceMode(AbsListView.CHOICE_MODE_SINGLE);
        //se implementa el método de evento clic sobre el item de lista
        lvAlumnos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //se obtiene la referencia a la foto del superhéroe
                ImageView ivFoto = view.findViewById(R.id.ivFoto);
                //se anima la foto con una rotación de 360º
                ivFoto.animate().rotationXBy(360);
            }
        });
        //se asigna el adaptador al ListView
        lvAlumnos.setAdapter(adapter);
    }

    /**
     * Método para obtener un objeto Drawable con la foto del alumno almacenada en un fichero.
     * Se maneja un flujo de fichero de entrada InputStream
     * @param fileImage Nombre del fichero de la foto del alumno
     * @return Devuelve un objeto Drawable con la foto del alumno
     */
    private Drawable getDrawable(String fileImage){
        InputStream ims = null;
        Drawable imageDrawable=null;
        try {
            ims = getAssets().open(fileImage);
            imageDrawable = Drawable.createFromStream(ims, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageDrawable;
    }
}

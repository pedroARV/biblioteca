package example2.tonio.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import example2.tonio.fragments_1.R;

//este comentario dice que extiende de la clase Fragment
/**
 * A simple {@link Fragment} subclass.
 */
public class DataFragment extends Fragment {


    public DataFragment() {
        //dice que requiere un constructor vacio para extender lo de la clase Fragment
        // Required empty public constructor
    }


    //este metodo es similar al siclo de vida de un activity, pero en esta ocasion se llama onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // creamos un objeto de la clase View e inflamos el fragment// contenedor y el valor false
        //el primer parametro es el layout que vamos a inflar// el segundo es el ViewGroup que sera un container// y el valor booleano false
        View view = inflater.inflate(R.layout.fragment_data, false);


        

        //este metodo regresa un view que esta inflado con nuestro layout
        // Inflate the layout for this fragment
        return view;

        //cambiando la estructura de esta forma puedes poner codigo dentro del fragment y poner metodos dentro de este, ya que si lo dejamos como estaba no podriamos

    }

}

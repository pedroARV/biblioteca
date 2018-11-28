package example2.tonio.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import example2.tonio.fragments_1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsFragment extends Fragment {


    public DetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //creamos un objeto View que contendra el inflater del layout
        View view = inflater.inflate(R.layout.fragment_details, container, false);

        //aqui podemos agregar los metodos y codigo que querramos





        // Inflate the layout for this fragment
        return view;
    }

}

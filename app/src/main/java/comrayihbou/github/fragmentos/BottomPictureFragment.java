package comrayihbou.github.fragmentos;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomPictureFragment extends Fragment{ //Extends Fragment.

    //Creacion de Variables.
    private static TextView textoSuperior;
    private static TextView textoInferior;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //Inflate
        View view = inflater.inflate(R.layout.bottom_picture_fragment, container, false);
        //LLamado a los TextView
        textoSuperior = (TextView) view.findViewById(R.id.textoSuperior);
        textoInferior = (TextView) view.findViewById(R.id.textoInferior);
        return view;
    }

    public void setMemeText (String top, String bottom){

        //SetText para los TextView
        textoSuperior.setText(top);
        textoInferior.setText(bottom);
    }
}

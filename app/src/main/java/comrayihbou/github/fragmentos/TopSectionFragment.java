package comrayihbou.github.fragmentos;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

/* En esta clase se crea el Listener del EditText para luego pasarlo al metodo createMeme del MainActivity */

public class TopSectionFragment extends Fragment{ //Extendemos la clase fragment primero para despues sobre escribir el metodo onCreateVIew

    private static EditText topTextInput;
    private static EditText bottomTextInput;

    TopSectionListener activityCommander;

    public interface  TopSectionListener{
        public void createMeme(String top, String bottom);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            activityCommander = (TopSectionListener) activity;
        }catch(ClassCastException e) {
            throw new ClassCastException(activity.toString());
        }
    }

    //Sobre escribir el metodo onCreateVIew. Alt+insert - Metodo onCreateView

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //Inflater
        View view = inflater.inflate(R.layout.top_section_fragment, container, false);

        //Se hace el llamado a los EditText y Botones
        topTextInput = (EditText) view.findViewById(R.id.topTextInput);
        bottomTextInput = (EditText) view.findViewById(R.id.bottomTextInput);
        final Button button = (Button) view.findViewById(R.id.buttonClick);

        //Listener del Boton
        button.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        buttonClicked(v);
                    }
                }
        );
        return view;
    }

    //Llamar este metodo cuando el boton es pulsado
    public void buttonClicked(View view){
        activityCommander.createMeme(topTextInput.getText().toString(), //Transformar el Texto a toString().
                bottomTextInput.getText().toString());
    }
}

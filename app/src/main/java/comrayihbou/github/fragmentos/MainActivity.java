package comrayihbou.github.fragmentos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*En esta aplicacion se maneja el uso de fragmentos de tal forma que puedan ser usados en diferentes pantallas,
por lo tanto se usa un fragmento en donde se introducen dos textos que seran utilizados en otra fragmento que contiene una imagen.
Un ejemplo sencillo del uso de Fragments.
*/
public class MainActivity extends AppCompatActivity implements TopSectionFragment.TopSectionListener{

    //Metodo OnCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Este Metodo llama al fragmento superior cuando se pulsa el boton, para modificar el fragmento inferior.
    @Override
    public void createMeme(String top, String bottom) {
        BottomPictureFragment bottomFragment = (BottomPictureFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2); //Aqui hacemos el llamado al Fragmento Inferior.
        bottomFragment.setMemeText(top, bottom); //Aqui se modifica el texto del fragmento inferior.
    }
}

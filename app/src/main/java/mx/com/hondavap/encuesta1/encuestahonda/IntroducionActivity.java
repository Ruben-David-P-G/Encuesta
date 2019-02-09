package mx.com.hondavap.encuesta1.encuestahonda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class IntroducionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introducion);
    }


    // Inicio de creacion del menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflar_menu=getMenuInflater();
        inflar_menu.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    // Final de creacion del menu

    //Inicio de Creacion de las pulsacines del menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.opt_about:
                // Hacer algo
                Intent i = new Intent(this,AboutActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_out);
                break;
            case R.id.opt_settings:
                Toast.makeText(this, R.string.m_action_confi,Toast.LENGTH_SHORT).show();
                break;
            //// Hacer algo
            case R.id.opt_exit:
                Intent restartHome = new Intent(IntroducionActivity.this, MainActivity.class);
                startActivity(restartHome);
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                break;

            default:
                return true;

        }
        return super.onOptionsItemSelected(item);
    }
    // Final de Creacion de las pulsacines del menu


    public void Iniciar(View f){
        Intent i = new Intent(this,SurveyActivity.class);
        startActivity(i);
        overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_out);
    }
}

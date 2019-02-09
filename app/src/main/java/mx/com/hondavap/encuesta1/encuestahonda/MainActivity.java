package mx.com.hondavap.encuesta1.encuestahonda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        Intent i = new Intent(this, IntroducionActivity.class);
        startActivity(i);
        overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_out);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login= (Button) findViewById(R.id.btn_login);
        login.setOnClickListener(this);
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
                startActivity(new Intent(this, AboutActivity.class));
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_out);


                break;
            case R.id.opt_settings:
                Toast.makeText(this, R.string.m_action_confi,Toast.LENGTH_SHORT).show();
                break;
                //// Hacer algo
            case R.id.opt_exit:
                //Toast.makeText(this, R.string.m_action_salir,Toast.LENGTH_SHORT).show();
                finish();
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




}

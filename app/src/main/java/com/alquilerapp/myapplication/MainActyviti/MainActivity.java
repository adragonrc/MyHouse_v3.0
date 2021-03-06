package com.alquilerapp.myapplication.MainActyviti;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.alquilerapp.myapplication.Base.BaseActivity;
import com.alquilerapp.myapplication.CambiarContrasenia;
import com.alquilerapp.myapplication.MainActyviti.Interface;
import com.alquilerapp.myapplication.MainActyviti.Presenter;
import com.alquilerapp.myapplication.MenuPricipal;
import com.alquilerapp.myapplication.R;

public class MainActivity extends BaseActivity<Presenter> implements Interface.view {
    private EditText etUser;
    private EditText etPass;
    @Override
    protected void iniciarComandos() {
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @NonNull
    @Override
    protected Presenter createPresenter() {
        return new Presenter(this);
    }

    protected void iniciarViews(){
        etUser = findViewById(R.id.etUser);
        etPass = findViewById(R.id.etPass);
    }

    public void onClickIngresar(View view) {
        presenter.ingresar(etUser.getText().toString(), etPass.getText().toString());
    }
    public void onClikCambiarContraseña(View view){
        startActivity(new Intent(this, CambiarContrasenia.class));
    }

    @Override
    public void ingresar() {
        startActivity(new Intent(this, MenuPricipal.class));
    }

    @Override
    public void negarIngreso() {
    }

}

/*
public class MusicIntentReceiver extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals(Intent.ACTION_HEADSET_PLUG))
        {
            int state = intent.getIntExtra("state", -1);
            switch (state)
            {
                case 0:
                    Utilidades.mostrarToastText(context, "Auricular conectado");
                    break;
                case 1:
                    Utilidades.mostrarToastText(context, "Auricular desconectado");
                    break;
                default:
                    Utilidades.mostrarToastText(context, "Estado desconocido");
                    break;
            }
        }
    }
}*/
package com.example.android12;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn; //подвязываем баттан с того активити
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn =findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {   //установка listener
            @Override
            public void onClick(View v) {
                //это путь на другую страницу
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);


                //набирает номер,полностью закомент чтобы одновр-но не открыв-сь
//                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: (+996) 700 700 700"));
//                startActivity(intent);

                //это команда для вызова камеры,также полностью закомменти
//                Intent intCamera = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
//                startActivity(intCamera);

                //это намерение для поисковика гугл
//                String text = "Colisium";
//                Intent intGoogle = new Intent(Intent.ACTION_WEB_SEARCH);
//                intGoogle.putExtra(SearchManager.QUERY,text);
//                startActivity(intGoogle);



            }
        });
    }
}
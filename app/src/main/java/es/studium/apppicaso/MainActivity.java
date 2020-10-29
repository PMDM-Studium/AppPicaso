package es.studium.apppicaso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
ImageView imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagen=findViewById(R.id.imageView2);
        Picasso.get()
                .load("https://www.tiendasdecuadros.com/archivos/images/carlos-guernica-redimension-1549889328.jpg")
                .placeholder(R.drawable.ic_launcher_background)
                .into(imagen);
    }
}
package com.sbrms.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.sbrms.R;

public class BarcodeTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcode_test);

        Button button=findViewById(R.id.barcodeGenerate);
        TextView textView=findViewById(R.id.edit);
        ImageView imageView=findViewById(R.id.imageView);

        MultiFormatWriter multiFormatWriter=new MultiFormatWriter();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    BitMatrix bitMatrix= multiFormatWriter.encode(textView.getText().toString(), BarcodeFormat.UPC_A,imageView.getWidth(),imageView.getHeight());

                    Bitmap bitmap=Bitmap.createBitmap(imageView.getWidth(),imageView.getHeight(),Bitmap.Config.RGB_565);
                    for(int i=0;i<imageView.getWidth();i++)
                    {
                        for(int j=0;j<imageView.getHeight();j++)
                        {
                            bitmap.setPixel(i,j,bitMatrix.get(i,j)? Color.BLACK:Color.WHITE);
                        }
                    }
                    imageView.setImageBitmap(bitmap);


                } catch (WriterException e) {
                    e.printStackTrace();
                }


            }
        });



    }
}
package com.example.farmora10;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity
{
    private ImageView productadd, updateprice;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);


        productadd = (ImageView) findViewById(R.id.t_product_add);
        updateprice = (ImageView) findViewById(R.id.t_update_price);



        productadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Vegetable");
                startActivity(intent);
            }
        });
        updateprice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, Home2Activity.class);
                intent.putExtra("category", "Vegetable");
                startActivity(intent);
            }
        });




    }
}

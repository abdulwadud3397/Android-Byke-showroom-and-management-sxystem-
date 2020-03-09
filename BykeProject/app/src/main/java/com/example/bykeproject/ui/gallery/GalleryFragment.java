package com.example.bykeproject.ui.gallery;

import android.os.Bundle;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.bykeproject.R;
import com.example.bykeproject.model.Product;
import com.example.bykeproject.rest.APIClient;
import com.example.bykeproject.rest.APIInterface;

import java.security.acl.Owner;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;
    EditText onerNameEditText;
    EditText emailEditText;
    EditText addressEditText;
    Spinner colorEditText;
    Spinner brandNameEditText;
    Spinner typeEditText;
    EditText qtyEditText;
    EditText priceEditText;
    EditText chesisEditText;
    EditText sellerEditText;
    Button save;
    Button reset;
    APIInterface apiInterface;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        galleryViewModel =
//                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        final  TextView textView=root.findViewById(R.id.text_gallery);

        reset = root.findViewById(R.id.resetSubmit);
//        final TextView textView = root.findViewById(R.id.text_gallery);
//        galleryViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
//        insertProducts(root);
//        apiInterface = APIClient.getClient().create(APIInterface.class);
//        Call<List<Product>>productCall = apiInterface.getProducts();
//        productCall.enqueue(new Callback<List<Product>>() {
//            @Override
//            public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
//                Log.d("products =------------",response.body().get(4).getName());
//                textView.setText(response.body().get(4).getName());
//            }
//
//            @Override
//            public void onFailure(Call<List<Product>> call, Throwable t) {
//
//            }
//        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onerNameEditText.setText("");
                emailEditText.setText("");
                addressEditText.setText("");
                addressEditText.setText("");
//            colorEditText.(" ");
//            brandNameEditText.setText(" ");
//            typeEditText.setText(" ");
                qtyEditText.setText("");
                priceEditText.setText("");
                chesisEditText.setText("");
                sellerEditText.setText("");
            }
        });


      insertProducts(root);

        return root;
    }

   public void insertProducts(final View root) {
       onerNameEditText = root.findViewById(R.id.Owner_name);
       emailEditText = root.findViewById(R.id.products_email);
       addressEditText = root.findViewById(R.id.products_address);
       colorEditText = root.findViewById(R.id.spinnerColor);
       brandNameEditText = root.findViewById(R.id.spinner);
       typeEditText = root.findViewById(R.id.spinner_type);
       qtyEditText = root.findViewById(R.id.Products_qty);
       priceEditText = root.findViewById(R.id.Products_price);
       chesisEditText = root.findViewById(R.id.Products_chesisNumber);
       sellerEditText = root.findViewById(R.id.Products_seller_name);
        save = root.findViewById(R.id.btnSellSubmit);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                apiInterface = APIClient.getClient().create(APIInterface.class);
//                Call<List<Product>>productCall = apiInterface.getProducts();
                final Product product = new Product();
                product.setOwner(onerNameEditText.getText().toString());
                product.setEmail(emailEditText.getText().toString());
                product.setAddress(addressEditText.getText().toString());
//                product.setColor(colorEditText.getText().toString());
//                product.setBrand(brandNameEditText.getText().toString());
//                product.setType(typeEditText.getText().toString());
                product.setQty(Integer.parseInt(qtyEditText.getText().toString()));
                product.setPrice(Double.parseDouble(priceEditText.getText().toString()));
                product.setChesis(Integer.parseInt(chesisEditText.getText().toString()));
                product.setSeller(sellerEditText.getText().toString());
                Call<List<Product>> productCall = apiInterface.getProducts();
                productCall.enqueue(new Callback<List<Product>>() {
                    @Override
                    public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
                        Toast.makeText(getContext(),"Successfully inserted"+response.body().getClass(),Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onFailure(Call<List<Product>> call, Throwable t) {
                        Toast.makeText(getContext(),"Failed insert", Toast.LENGTH_LONG).show();

                    }
                });


            }
        });

   }


}
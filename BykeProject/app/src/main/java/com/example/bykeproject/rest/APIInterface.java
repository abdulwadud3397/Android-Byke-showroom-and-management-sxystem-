package com.example.bykeproject.rest;

import com.example.bykeproject.model.MultipleResource;
import com.example.bykeproject.model.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APIInterface {
    @GET("/api/unknown")
    Call<MultipleResource> doGetListResources();
    @GET("/SpringWH/test")
    Call<List<Product>> getProducts();
    @POST("/SpringWH/saveProduct")
    Call<Product> insertProducts(@Body Product p);

}

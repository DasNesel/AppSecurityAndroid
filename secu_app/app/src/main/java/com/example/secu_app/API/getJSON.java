package com.example.secu_app.API;

import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class getJSON {

    public static Retrofit retrofit;
    private String baseUrl;
    private String fileName = "APIURL";

    public Retrofit getInstance() {
        if (retrofit == null && this.baseUrl != null || this.baseUrl != "FileNotFoundException") {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(this.baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
    //public GetEvents create(Class<GetEvents> retrofitInterfaceClass) { return null; }
/*
    private void setBaseUrl(){
        if (fileName != null) {
            try {
                //open the file and retrieve the inputStream
                InputStream inputStream = openFileInput(fileName);
                if (inputStream != null) {
                    // open a reader on the inputStream
                    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

                    // String to use to store read lines
                    String str;
                    StringBuilder buf = new StringBuilder();

                    // Read the file
                    while ((str = reader.readLine()) != null) {
                        buf.append(str + "\r\n");
                    }
                    // Close the reader
                    reader.close();
                    // Close the inputStream
                    inputStream.close();
                    // Affect the text to the textView
                    textViewFile.setText(buf.toString());
                }
            } catch (java.io.FileNotFoundException e) {
                Toast.makeText(this, "FileNotFoundException", Toast.LENGTH_LONG);
            } catch (IOException e) {
                Toast.makeText(this, "FileNotFoundException", Toast.LENGTH_LONG);
            }
        }
    }

}
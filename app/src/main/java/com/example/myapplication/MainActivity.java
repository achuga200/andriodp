package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init the webView
        webView = (WebView) findViewById(R.id.webView);
        //get web settings
        WebSettings webSettings = webView.getSettings();
        //set this for javascript containing sites
        webSettings.setJavaScriptEnabled(true);
        //load your url
        //paste the full url here as it appears in the address
        webView.loadUrl("https;//fidexweb.tech");
        //for opening link in app
        webView.setWebViewClient(new WebViewClient());


    }

    //if you are on a different page then backbutton wont finish or terminate the app lifecycle

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
        } else {
            super.onBackPressed();
        }
    }
}

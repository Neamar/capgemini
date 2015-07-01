package com.bealder.capgemini;


import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class ProfileActivity extends WebViewActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new MixinMenuActivity().addMenuListeners(this);

        webView.loadUrl("https://www.google.fr/search?q=profile");

    }
}

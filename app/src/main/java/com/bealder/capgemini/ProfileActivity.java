package com.bealder.capgemini;


import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;


public class ProfileActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        new MixinMenuActivity().addMenuListeners(this);

        WebView webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl("file:///android_asset/mentions.html");

    }
}

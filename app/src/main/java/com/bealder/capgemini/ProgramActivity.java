package com.bealder.capgemini;


import android.os.Bundle;


public class ProgramActivity extends WebViewActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new MixinMenuActivity().addMenuListeners(this);
        webView.loadUrl("http://ase-france.com/app/agenda");
    }
}

package com.xiantang.androidstructure.demo.mvc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.xiantang.androidstructure.R;

public class MvcDemoActivity extends AppCompatActivity implements IMvc.IView {

    private EditText etInputString;
    private Button btnClearText;
    private TextView tvResultShow;

    private IMvc.IController iController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvc_demo);

        etInputString = findViewById(R.id.etInputText);
        btnClearText = findViewById(R.id.btnClearText);
        tvResultShow = findViewById(R.id.tvResultShow);

        etInputString.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (iController != null) {
                    iController.updateTheTextFromView(s.toString());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        btnClearText.setOnClickListener(v -> {
            iController.clearText();
        });
        MvcModel mvcModel = new MvcModel(this);
        iController = new MvcController(mvcModel);
    }


    @Override
    public void showText(String text) {
        if (TextUtils.isEmpty(text)) {
            tvResultShow.setText("default text");
        } else
            tvResultShow.setText(text);
    }

    @Override
    public void clearText() {
        etInputString.setText("");
    }
}

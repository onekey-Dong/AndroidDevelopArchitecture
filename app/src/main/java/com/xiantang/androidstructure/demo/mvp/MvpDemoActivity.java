package com.xiantang.androidstructure.demo.mvp;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.xiantang.androidstructure.R;
import com.xiantang.androidstructure.base.mvp.BaseMvpActivity;

public class MvpDemoActivity extends BaseMvpActivity<MvpPresenter> implements IMvp.IView {

    private EditText etInputString;
    private Button btnClearText;
    private TextView tvResultShow;

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

            }

            @Override
            public void afterTextChanged(Editable s) {
                log("afterTextChanged: " + s.toString());
                if (mPresenter != null) {
                    mPresenter.updateTextFromView(s.toString());
                }
            }
        });
        btnClearText.setOnClickListener(v -> {
            mPresenter.clearTextInView();
        });
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

    @Override
    public MvpPresenter createPresenter() {
        return new MvpPresenter();
    }
}

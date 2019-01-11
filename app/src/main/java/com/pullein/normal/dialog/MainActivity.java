package com.pullein.normal.dialog;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnMsgDialog:
                new NormalDialog(this).setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public void onCancel(DialogInterface dialog) {

                    }
                }).show();
                break;
            case R.id.btnMsgWithoutTitleDialog:
                break;
            case R.id.btnSingleInputDialog:
                new NormalSingleInputDialog(this)
                        .setTitle("哈哈哈")
                        .show();
                break;
            case R.id.btnSingleInputWithoutTitleDialog:
                break;
            case R.id.btnMultilineInputDialog:
                new NormalMultilineInputDialog(this)
                        .show();
                break;
            case R.id.btnMultilineInputWithoutTitleDialog:
                break;
            default:
                break;
        }
    }
}

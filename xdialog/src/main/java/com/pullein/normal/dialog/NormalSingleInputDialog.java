package com.pullein.normal.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

/**
 * NormalDialog<br>
 * describe ：单行输入框
 *
 * @author xugang
 * @date 2019/1/11
 */
public class NormalSingleInputDialog extends NormalInputDialog {

    private TextView tvTitle;

    public NormalSingleInputDialog(Context mContext) {
        super(mContext);
    }

    @Override
    protected View onCreateView() {
        View view = LayoutInflater.from(mContext).inflate(R.layout.normal_dialog_single_input, null);
        tvTitle = view.findViewById(R.id.normal_dialog_title);
        return view;
    }


    public NormalSingleInputDialog setTitle(String title) {
        tvTitle.setText(title);
        return this;
    }
}

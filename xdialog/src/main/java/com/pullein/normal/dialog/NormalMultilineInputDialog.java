package com.pullein.normal.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

/**
 * NormalDialog<br>
 * describe ：多行输入框
 *
 * @author xugang
 * @date 2019/1/11
 */
public class NormalMultilineInputDialog extends NormalInputDialog {
    public NormalMultilineInputDialog(Context mContext) {
        super(mContext);
    }

    @Override
    protected View onCreateView() {
        View view = LayoutInflater.from(mContext).inflate(R.layout.mormal_dialog_multiline_input, null);
        return view;
    }
}

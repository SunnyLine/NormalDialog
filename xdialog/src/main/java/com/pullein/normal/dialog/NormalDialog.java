package com.pullein.normal.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

/**
 * NormalDialog<br>
 * describe ：普通信息提示框
 *
 * @author xugang
 * @date 2019/1/11
 */
public class NormalDialog extends BaseDialog {
    public NormalDialog(Context mContext) {
        super(mContext);
    }

    @Override
    protected View onCreateView() {
        View view = LayoutInflater.from(mContext).inflate(R.layout.normal_dialog_msg, null);

        return view;
    }
}

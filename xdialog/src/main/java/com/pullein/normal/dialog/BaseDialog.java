package com.pullein.normal.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.WindowManager;

import com.pullein.normal.dialog.utils.DensityUtil;

/**
 * NormalDialog<br>
 * describe ：
 *
 * @author xugang
 * @date 2019/1/10
 */
public abstract class BaseDialog {
    protected Context mContext;
    protected AlertDialog mAlertDialog;
    protected View mRootView;
    private DialogInterface.OnCancelListener onCancelListener;
    private DialogInterface.OnShowListener onShowListener;

    private boolean isCancelable;

    public BaseDialog(Context mContext) {
        this.mContext = mContext;
    }

    public <D extends BaseDialog> D setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.onCancelListener = onCancelListener;
        return (D) this;
    }

    public <D extends BaseDialog> D setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.onShowListener = onShowListener;
        return (D) this;
    }

    protected abstract View onCreateView();

    public AlertDialog onCreateDialog(View view) {
        AlertDialog dialog = new AlertDialog.Builder(mContext)
                .setView(view)
                .setCancelable(isCancelable)
                .create();
        if (onCancelListener != null) {
            dialog.setOnCancelListener(onCancelListener);
        }
        dialog.setOnShowListener(onShowListener);
        return dialog;
    }


    public void show() {
        mRootView = onCreateView();
        if (mRootView == null) {
            throw new NullPointerException(getClass().getSimpleName() + " rootView is null");
        }
        mAlertDialog = onCreateDialog(mRootView);
        mAlertDialog.show();
        onShowPost();
    }

    public void onShowPost() {
        /**
         * 设置弹窗占屏幕宽度比例
         */
        WindowManager.LayoutParams p = mAlertDialog.getWindow().getAttributes();
        p.width = (int) (DensityUtil.getScreenWidth(mRootView.getContext()) * 0.85);
        mAlertDialog.getWindow().setAttributes(p);
    }

    public boolean isShow() {
        return mAlertDialog != null && mAlertDialog.isShowing();
    }

    public void cancel() {
        if (isShow()) {
            mAlertDialog.cancel();
        }
    }
}

package com.google.android.libraries.youtube.offline.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.google.android.apps.youtube.music.R;
import defpackage.ttc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class OfflineDialogOptionView extends ttc {
    private RadioButton b;

    public OfflineDialogOptionView(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        RadioButton radioButton = (RadioButton) findViewById(R.id.radio_button);
        this.b = radioButton;
        radioButton.setImportantForAccessibility(2);
        super.onFinishInflate();
    }

    @Override // defpackage.ttc, android.widget.Checkable
    public final void setChecked(boolean z) {
        super.setChecked(z);
        RadioButton radioButton = this.b;
        if (radioButton != null) {
            radioButton.setChecked(z);
        }
    }

    public OfflineDialogOptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OfflineDialogOptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public OfflineDialogOptionView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

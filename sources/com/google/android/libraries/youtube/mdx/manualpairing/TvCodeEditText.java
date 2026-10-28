package com.google.android.libraries.youtube.mdx.manualpairing;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.textfield.TextInputEditText;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class TvCodeEditText extends TextInputEditText {
    public TvCodeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    public TvCodeEditText(Context context) {
        this(context, null);
    }

    public TvCodeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

package com.google.android.apps.youtube.music.ui.preference;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import androidx.preference.EditTextPreference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class CustomEditTextPreference extends EditTextPreference {
    public final AppCompatEditText h;

    public CustomEditTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new AppCompatEditText(context, attributeSet);
    }
}
